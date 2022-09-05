package com.ezpc.domain.country;

import com.ezpc.domain.exceptions.ConflictException;

import java.util.function.Consumer;

public class CountryCreateAction implements Consumer<CountryRepresentation> {

    private final CountryService service;

    public CountryCreateAction(CountryService service) {
        this.service = service;
    }

    @Override
    public void accept(CountryRepresentation representation) {

        var model = new CountryModel(representation);

        if (service.existsWithName(representation.getName())) {
            throw new ConflictException("A country with name %s already exists".formatted(model.getName()));
        }

        service.create(model);
    }
}
