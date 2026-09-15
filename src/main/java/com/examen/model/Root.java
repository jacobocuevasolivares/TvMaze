package com.examen.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

public class Root {

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public double score;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public Show show;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }
}
