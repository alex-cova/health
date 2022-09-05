package com.ezpc.country;

import com.ezpc.domain.country.CountryModel;
import com.ezpc.domain.country.CountryService;
import org.jetbrains.annotations.NotNull;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.ezpc.mysql.Tables.COUNTRY;

@Service
public class CountryServiceImpl implements CountryService {

    private final DSLContext dsl;

    public CountryServiceImpl(DSLContext dsl) {
        this.dsl = dsl;
    }

    @Override
    public void create(@NotNull CountryModel model) {
        var record = dsl.newRecord(COUNTRY);

        record.setUuid(model.getUuid().toString());
        record.setName(model.getName());

        record.store();

    }

    @Override
    public boolean delete(@NotNull UUID uuid) {
        return dsl.deleteFrom(COUNTRY)
                .where(COUNTRY.UUID.eq(uuid.toString()))
                .limit(1)
                .execute() >= 1;
    }

    @Override
    public boolean existsWithName(String name) {
        return dsl.fetchExists(dsl.selectFrom(COUNTRY)
                .where(COUNTRY.NAME.eq(name)));
    }
}
