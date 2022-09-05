package com.ezpc.domain.country;

import com.ezpc.domain.exceptions.NotFoundException;

import java.util.List;
import java.util.UUID;
import java.util.function.Function;

public class CountryReadAction implements Function<UUID, CountryRepresentation> {

    private final CountryRepository repository;

    public CountryReadAction(CountryRepository repository) {
        this.repository = repository;
    }

    @Override
    public CountryRepresentation apply(UUID uuid) {
        var country = repository.getById(uuid);

        if (country == null) throw new NotFoundException("Country with id %s not found".formatted(uuid));

        return country;
    }

    public List<? extends CountryRepresentation> list(){
        return repository.list();
    }
}
