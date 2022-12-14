/*
 * This file is generated by jOOQ.
 */
package com.ezpc.mysql;


import com.ezpc.mysql.tables.Country;
import com.ezpc.mysql.tables.Developer;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Spring extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>spring</code>
     */
    public static final Spring SPRING = new Spring();

    /**
     * The table <code>spring.country</code>.
     */
    public final Country COUNTRY = Country.COUNTRY;

    /**
     * The table <code>spring.developer</code>.
     */
    public final Developer DEVELOPER = Developer.DEVELOPER;

    /**
     * No further instances allowed
     */
    private Spring() {
        super("spring", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Country.COUNTRY,
            Developer.DEVELOPER
        );
    }
}
