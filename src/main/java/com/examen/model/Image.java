package com.examen.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

public class Image {

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String medium;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String original;

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }
}
