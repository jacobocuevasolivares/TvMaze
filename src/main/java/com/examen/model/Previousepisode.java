package com.examen.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

public class Previousepisode {

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String href;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String name;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
