package com.examen.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import jakarta.validation.constraints.Pattern;

public class Comments {

    @Pattern(regexp = "^[a-zA-Z0-9!@#$%&*()_+=|<>?{}/\\[\\]~-]+$", message = "Solo se permiten cararcteres")
    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String show_id;

    @Pattern(regexp = "^[a-zA-Z0-9!@#$%&*()_+=|<>?{}/\\[\\]~-]+$", message = "Solo se permiten cararcteres")
    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String comment;

    @Pattern(regexp = "^[a-zA-Z0-9!@#$%&*()_+=|<>?{}/\\[\\]~-]+$", message = "Solo se permiten cararcteres")
    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String rating;

    public Comments() {  }

    public Comments(String show_id, String comment, String rating) {
        this.show_id = show_id;
        this.comment = comment;
        this.rating = rating;
    }

    public String getShow_id() {
        return show_id;
    }

    public void setShow_id(String show_id) {
        this.show_id = show_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
