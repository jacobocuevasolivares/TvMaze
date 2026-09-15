package com.examen.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import jakarta.validation.constraints.Pattern;

public class ShowQuery {

    @Pattern(regexp = "^[a-zA-Z0-9!@#$%&*()_+=|<>?{}/\\[\\]~-]+$", message = "Solo se permiten cararcteres")
    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String id;

    public ShowQuery() {   }

    public ShowQuery(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
