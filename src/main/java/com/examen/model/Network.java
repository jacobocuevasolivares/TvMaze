package com.examen.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

public class Network {

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public int id;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String name;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public Country country;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String officialSite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getOfficialSite() {
        return officialSite;
    }

    public void setOfficialSite(String officialSite) {
        this.officialSite = officialSite;
    }

}
