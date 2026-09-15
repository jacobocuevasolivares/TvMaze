package com.examen.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import java.util.ArrayList;

public class Show {

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public int id;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String url;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String name;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String type;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String language;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public ArrayList<String> genres;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String status;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public int runtime;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public int averageRuntime;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String premiered;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String ended;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String officialSite;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public Schedule schedule;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public Rating rating;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public int weight;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public Network network;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public Object webChannel;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public Object dvdCountry;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public Externals externals;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public Image image;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String summary;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public int updated;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public Links _links;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public ArrayList<Comments> comentarios;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public int getAverageRuntime() {
        return averageRuntime;
    }

    public void setAverageRuntime(int averageRuntime) {
        this.averageRuntime = averageRuntime;
    }

    public String getPremiered() {
        return premiered;
    }

    public void setPremiered(String premiered) {
        this.premiered = premiered;
    }

    public String getEnded() {
        return ended;
    }

    public void setEnded(String ended) {
        this.ended = ended;
    }

    public String getOfficialSite() {
        return officialSite;
    }

    public void setOfficialSite(String officialSite) {
        this.officialSite = officialSite;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Object getWebChannel() {
        return webChannel;
    }

    public void setWebChannel(Object webChannel) {
        this.webChannel = webChannel;
    }

    public Object getDvdCountry() {
        return dvdCountry;
    }

    public void setDvdCountry(Object dvdCountry) {
        this.dvdCountry = dvdCountry;
    }

    public Externals getExternals() {
        return externals;
    }

    public void setExternals(Externals externals) {
        this.externals = externals;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getUpdated() {
        return updated;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }

    public Links get_links() {
        return _links;
    }

    public void set_links(Links _links) {
        this._links = _links;
    }

    public ArrayList<Comments> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<Comments> comentarios) {
        this.comentarios = comentarios;
    }
}
