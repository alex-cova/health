package com.ezpc.domain.country;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

public interface CountryRepresentation {

    @Schema(required = true)
    UUID getUuid();

    @Schema(required = true, maxLength = 120)
    String getName();

}
