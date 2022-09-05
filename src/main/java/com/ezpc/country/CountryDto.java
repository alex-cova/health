package com.ezpc.country;

import com.ezpc.domain.country.CountryRepresentation;

import java.util.UUID;

public class CountryDto implements CountryRepresentation {

    private UUID uuid;
    private String name;

    public CountryDto() {
    }

    public CountryDto(UUID uuid, String name) {
        this.uuid = uuid;
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
