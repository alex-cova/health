package com.ezpc.domain.country;

import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

public interface CountryRepository {

    @Nullable CountryRepresentation getById(UUID uuid);

    List<? extends CountryRepresentation> list();
}
