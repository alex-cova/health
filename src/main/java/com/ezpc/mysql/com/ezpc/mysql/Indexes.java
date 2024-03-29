/*
 * This file is generated by jOOQ.
 */
package com.ezpc.mysql;


import com.ezpc.mysql.tables.Appointment;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in spring.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index APPOINTMENT_APPOINTMENT_HOSPITALID_TIMESTAMP_INDEX = Internal.createIndex(DSL.name("appointment_hospitalId_timestamp_index"), Appointment.APPOINTMENT, new OrderField[] { Appointment.APPOINTMENT.HOSPITALID, Appointment.APPOINTMENT.TIMESTAMP }, false);
}
