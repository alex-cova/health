package com.ezpc.domain.country;

import com.ezpc.domain.Nulls;
import com.ezpc.domain.exceptions.BadRequestException;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class CountryModel {

    private final UUID uuid;
    private final String name;

    public CountryModel(@NotNull CountryRepresentation representation) {

        Nulls.requireNoNull(representation.getUuid(), "UUID can't be null");
        Nulls.requireNoNull(representation.getName(), "Name can't be null");

        this.uuid = representation.getUuid();
        this.name = representation.getName().strip();

        if (name.isBlank()) throw new BadRequestException("Name can't be empty");
        if (name.length() > 120) throw new BadRequestException("Name length can't be greater than 120");

    }

    public CountryModel(UUID uuid, String name) {
        this.uuid = uuid;
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }
}
