package com.ezpc.domain.country;

import com.ezpc.domain.exceptions.BadRequestException;

import java.util.UUID;
import java.util.function.Consumer;

public class CountryDeleteAction implements Consumer<UUID> {

    private final CountryService service;

    public CountryDeleteAction(CountryService service) {
        this.service = service;
    }

    @Override
    public void accept(UUID uuid) {
        if (!service.delete(uuid)) {
            throw new BadRequestException("Country with id %s wasn't deleted or no exists");
        }
    }
}
