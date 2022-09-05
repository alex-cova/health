package com.ezpc.domain.country;

import java.util.UUID;

public interface CountryService {

    void create(CountryModel dto);

    boolean delete(UUID uuid);

    boolean existsWithName(String name);

}
