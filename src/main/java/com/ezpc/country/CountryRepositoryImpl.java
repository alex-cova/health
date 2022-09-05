package com.ezpc.country;

import com.ezpc.domain.country.CountryRepository;
import org.jetbrains.annotations.NotNull;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

import static com.ezpc.mysql.Tables.COUNTRY;

@Repository
public class CountryRepositoryImpl implements CountryRepository {

    private final DSLContext dsl;

    public CountryRepositoryImpl(DSLContext dsl) {
        this.dsl = dsl;
    }

    public CountryDto getById(@NotNull UUID uuid) {
        var record = dsl.selectFrom(COUNTRY)
                .where(COUNTRY.UUID.eq(uuid.toString()))
                .fetchOne();


        if (record == null) return null;

        return new CountryDto(UUID.fromString(record.getUuid()), record.getName());
    }

    @Override
    public List<CountryDto> list() {
        return dsl.selectFrom(COUNTRY)
                .fetch()
                .stream()
                .map(c -> new CountryDto(UUID.fromString(c.getUuid()), c.getName()))
                .toList();
    }
}
