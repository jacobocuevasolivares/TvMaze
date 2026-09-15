package com.examen.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import java.util.ArrayList;

public class Schedule {

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String time;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public ArrayList<String> days;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ArrayList<String> getDays() {
        return days;
    }

    public void setDays(ArrayList<String> days) {
        this.days = days;
    }
}
