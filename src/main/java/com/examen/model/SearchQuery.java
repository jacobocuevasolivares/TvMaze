package com.examen.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import jakarta.validation.constraints.Pattern;

public class SearchQuery {

    @Pattern(regexp = "^[a-zA-Z0-9!@#$%&*()_+=|<>?{}/\\[\\]~-]+$", message = "Solo se permiten cararcteres")
    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String operacion;

    public SearchQuery() {}

    public SearchQuery(String operacion) {
        this.operacion = operacion;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

}
