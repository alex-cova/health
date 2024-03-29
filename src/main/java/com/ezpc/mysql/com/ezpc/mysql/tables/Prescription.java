/*
 * This file is generated by jOOQ.
 */
package com.ezpc.mysql.tables;


import com.ezpc.mysql.Keys;
import com.ezpc.mysql.Spring;
import com.ezpc.mysql.tables.records.PrescriptionRecord;

import java.time.LocalDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Prescription extends TableImpl<PrescriptionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>spring.prescription</code>
     */
    public static final Prescription PRESCRIPTION = new Prescription();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PrescriptionRecord> getRecordType() {
        return PrescriptionRecord.class;
    }

    /**
     * The column <code>spring.prescription.hospitalId</code>.
     */
    public final TableField<PrescriptionRecord, Long> HOSPITALID = createField(DSL.name("hospitalId"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>spring.prescription.doctorId</code>.
     */
    public final TableField<PrescriptionRecord, String> DOCTORID = createField(DSL.name("doctorId"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>spring.prescription.timestamp</code>.
     */
    public final TableField<PrescriptionRecord, LocalDateTime> TIMESTAMP = createField(DSL.name("timestamp"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>spring.prescription.uuid</code>.
     */
    public final TableField<PrescriptionRecord, String> UUID = createField(DSL.name("uuid"), SQLDataType.VARCHAR(36), this, "");

    private Prescription(Name alias, Table<PrescriptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Prescription(Name alias, Table<PrescriptionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>spring.prescription</code> table reference
     */
    public Prescription(String alias) {
        this(DSL.name(alias), PRESCRIPTION);
    }

    /**
     * Create an aliased <code>spring.prescription</code> table reference
     */
    public Prescription(Name alias) {
        this(alias, PRESCRIPTION);
    }

    /**
     * Create a <code>spring.prescription</code> table reference
     */
    public Prescription() {
        this(DSL.name("prescription"), null);
    }

    public <O extends Record> Prescription(Table<O> child, ForeignKey<O, PrescriptionRecord> key) {
        super(child, key, PRESCRIPTION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Spring.SPRING;
    }

    @Override
    public UniqueKey<PrescriptionRecord> getPrimaryKey() {
        return Keys.KEY_PRESCRIPTION_PRIMARY;
    }

    @Override
    public Prescription as(String alias) {
        return new Prescription(DSL.name(alias), this);
    }

    @Override
    public Prescription as(Name alias) {
        return new Prescription(alias, this);
    }

    @Override
    public Prescription as(Table<?> alias) {
        return new Prescription(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Prescription rename(String name) {
        return new Prescription(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Prescription rename(Name name) {
        return new Prescription(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Prescription rename(Table<?> name) {
        return new Prescription(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, LocalDateTime, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Long, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Long, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
