package com.examen.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

public class Country {

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String name;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String code;

    @JsonSetter(nulls = Nulls.AS_EMPTY)
    public String timezone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
