package com.examen.controller;

import com.examen.model.*;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
@CrossOrigin(origins = "*")
@Slf4j
public class EndPointSearch {

    @PostMapping("/busquedaSearch")
    public ResponseEntity<Root[]> getSearch(@Valid @RequestBody SearchQuery query) {

        ResponseEntity<Root[]> resultado = null;
        try {
            RestTemplate plantilla = new RestTemplate();
            String url = "http://api.tvmaze.com/search/shows?q={query}";

            Map<String, String> params = new HashMap<>();
            params.put("query", query.getOperacion());

            System.out.println("Enviando PETICION: ");
            resultado = plantilla.getForEntity(url, Root[].class, params);
            System.out.println("proceso TERMINADO: ");
            System.out.println(resultado);

            if (resultado.getBody() != null) {
                for (Root centinela : resultado.getBody()) {
                    int id = centinela.getShow().getId();
                    centinela.getShow().setComentarios( buscarComentarios(id) );
                }
            }

        }catch(Exception e){
            e.printStackTrace();
            log.info("Error: {}", e.getMessage());
        }

        return resultado;

    }

    @PostMapping("/busquedaShows")
    public ResponseEntity<Show> getShow(@Valid @RequestBody ShowQuery query) {

        RestTemplate plantilla = new RestTemplate();
        String url = "https://api.tvmaze.com/shows/{show_id}";

        String id = query.getId();
        Map<String, String> params = new HashMap<>();
        params.put("show_id", id);

        System.out.println("Enviando PETICION: ");

        return showCache.get(id, key -> {
            ResponseEntity<Show> resultado = plantilla.getForEntity(url, Show.class, params);

            if (resultado.getBody() != null) {
                int idShow = resultado.getBody().getId();
                resultado.getBody().setComentarios( buscarComentarios(idShow) );
            }

            System.out.println("proceso TERMINADO: ");
            return resultado;
                });

    }

    private final Cache<String, ResponseEntity<Show>> showCache = Caffeine.newBuilder()
            .expireAfterWrite(10, TimeUnit.MINUTES)
            .maximumSize(10_000)
            .build();


    @PostMapping("/comments")
    public ResponseEntity<String> setComments(@RequestBody Comments com) throws Exception {

        CodecRegistry pojoCodecRegistry = fromRegistries(
                MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build())
        );

        String uri = "mongodb+srv://jacobocuevasolivares_db_user:cfypK63WZgdW4Mck@clusterhunter.ryo8tb9.mongodb.net/?appName=ClusterHunter&maxPoolSize=200";

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(uri))
                .codecRegistry(pojoCodecRegistry)
                .build();

        try (MongoClient mongoClient = MongoClients.create(settings)) {
            MongoDatabase database = mongoClient.getDatabase("sample_mflix");

            //database.createCollection("comments");
            MongoCollection<Comments> collection = database.getCollection("comments", Comments.class);
            collection.insertOne( com );
        } catch (Exception e) {
            log.info("Error: {}", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Se presento un error al procesar la peticion");
        }
        return ResponseEntity.status(HttpStatus.OK).body("Peticion procesada");
    }

    private ArrayList<Comments> buscarComentarios( int id ) {

        ArrayList<Comments> comentarios = new ArrayList<>();

        CodecRegistry pojoCodecRegistry = fromRegistries(
                MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build())
        );

        String uri = "mongodb+srv://jacobocuevasolivares_db_user:cfypK63WZgdW4Mck@clusterhunter.ryo8tb9.mongodb.net/?appName=ClusterHunter&maxPoolSize=200";

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(uri))
                .codecRegistry(pojoCodecRegistry)
                .build();

        try (MongoClient mongoClient = MongoClients.create(settings)) {

            MongoDatabase database = mongoClient.getDatabase("sample_mflix");
            MongoCollection<Comments> collection = database.getCollection("comments", Comments.class);

            FindIterable<Comments> documents = collection.find(Filters.eq("show_id", ""+ id));
            MongoCursor<Comments> cursor = documents.iterator();

            ArrayList<Comments> comen = new ArrayList<>();

            while ( cursor.hasNext() ) {
                comen.add( cursor.next() );
            }

            MongoCursor<Comments> cursor2 =  collection.find().cursor();
            cursor2.forEachRemaining(System.out::println);


            return comen;
        } catch (Exception e) {
            log.info("Error: {}", e.getMessage());
            return comentarios;
        }
    }


}
