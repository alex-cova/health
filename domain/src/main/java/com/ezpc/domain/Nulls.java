package com.ezpc.domain;

import com.ezpc.domain.exceptions.BadRequestException;

public class Nulls {

    public static void requireNoNull(Object obj, String message) {
        if (obj == null) {
            throw new BadRequestException(message);
        }
    }

}
