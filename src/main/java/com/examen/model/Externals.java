package com.examen.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

public class Externals {

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public int tvrage;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public int thetvdb;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String imdb;

    public int getTvrage() {
        return tvrage;
    }

    public void setTvrage(int tvrage) {
        this.tvrage = tvrage;
    }

    public int getThetvdb() {
        return thetvdb;
    }

    public void setThetvdb(int thetvdb) {
        this.thetvdb = thetvdb;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

}
