/*
 * This file is generated by jOOQ.
 */
package com.ezpc.mysql.tables.records;


import com.ezpc.mysql.tables.Appointment;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppointmentRecord extends UpdatableRecordImpl<AppointmentRecord> implements Record9<Long, String, LocalDateTime, String, String, String, String, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>spring.appointment.hospitalId</code>.
     */
    public void setHospitalid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>spring.appointment.hospitalId</code>.
     */
    public Long getHospitalid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>spring.appointment.uuid</code>.
     */
    public void setUuid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>spring.appointment.uuid</code>.
     */
    public String getUuid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>spring.appointment.timestamp</code>.
     */
    public void setTimestamp(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>spring.appointment.timestamp</code>.
     */
    public LocalDateTime getTimestamp() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>spring.appointment.phoneNumber</code>.
     */
    public void setPhonenumber(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>spring.appointment.phoneNumber</code>.
     */
    public String getPhonenumber() {
        return (String) get(3);
    }

    /**
     * Setter for <code>spring.appointment.reason</code>.
     */
    public void setReason(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>spring.appointment.reason</code>.
     */
    public String getReason() {
        return (String) get(4);
    }

    /**
     * Setter for <code>spring.appointment.patientUuid</code>.
     */
    public void setPatientuuid(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>spring.appointment.patientUuid</code>.
     */
    public String getPatientuuid() {
        return (String) get(5);
    }

    /**
     * Setter for <code>spring.appointment.name</code>.
     */
    public void setName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>spring.appointment.name</code>.
     */
    public String getName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>spring.appointment.doctorUuid</code>.
     */
    public void setDoctoruuid(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>spring.appointment.doctorUuid</code>.
     */
    public String getDoctoruuid() {
        return (String) get(7);
    }

    /**
     * Setter for <code>spring.appointment.status</code>.
     */
    public void setStatus(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>spring.appointment.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Long, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, LocalDateTime, String, String, String, String, String, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, String, LocalDateTime, String, String, String, String, String, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Appointment.APPOINTMENT.HOSPITALID;
    }

    @Override
    public Field<String> field2() {
        return Appointment.APPOINTMENT.UUID;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Appointment.APPOINTMENT.TIMESTAMP;
    }

    @Override
    public Field<String> field4() {
        return Appointment.APPOINTMENT.PHONENUMBER;
    }

    @Override
    public Field<String> field5() {
        return Appointment.APPOINTMENT.REASON;
    }

    @Override
    public Field<String> field6() {
        return Appointment.APPOINTMENT.PATIENTUUID;
    }

    @Override
    public Field<String> field7() {
        return Appointment.APPOINTMENT.NAME;
    }

    @Override
    public Field<String> field8() {
        return Appointment.APPOINTMENT.DOCTORUUID;
    }

    @Override
    public Field<Integer> field9() {
        return Appointment.APPOINTMENT.STATUS;
    }

    @Override
    public Long component1() {
        return getHospitalid();
    }

    @Override
    public String component2() {
        return getUuid();
    }

    @Override
    public LocalDateTime component3() {
        return getTimestamp();
    }

    @Override
    public String component4() {
        return getPhonenumber();
    }

    @Override
    public String component5() {
        return getReason();
    }

    @Override
    public String component6() {
        return getPatientuuid();
    }

    @Override
    public String component7() {
        return getName();
    }

    @Override
    public String component8() {
        return getDoctoruuid();
    }

    @Override
    public Integer component9() {
        return getStatus();
    }

    @Override
    public Long value1() {
        return getHospitalid();
    }

    @Override
    public String value2() {
        return getUuid();
    }

    @Override
    public LocalDateTime value3() {
        return getTimestamp();
    }

    @Override
    public String value4() {
        return getPhonenumber();
    }

    @Override
    public String value5() {
        return getReason();
    }

    @Override
    public String value6() {
        return getPatientuuid();
    }

    @Override
    public String value7() {
        return getName();
    }

    @Override
    public String value8() {
        return getDoctoruuid();
    }

    @Override
    public Integer value9() {
        return getStatus();
    }

    @Override
    public AppointmentRecord value1(Long value) {
        setHospitalid(value);
        return this;
    }

    @Override
    public AppointmentRecord value2(String value) {
        setUuid(value);
        return this;
    }

    @Override
    public AppointmentRecord value3(LocalDateTime value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public AppointmentRecord value4(String value) {
        setPhonenumber(value);
        return this;
    }

    @Override
    public AppointmentRecord value5(String value) {
        setReason(value);
        return this;
    }

    @Override
    public AppointmentRecord value6(String value) {
        setPatientuuid(value);
        return this;
    }

    @Override
    public AppointmentRecord value7(String value) {
        setName(value);
        return this;
    }

    @Override
    public AppointmentRecord value8(String value) {
        setDoctoruuid(value);
        return this;
    }

    @Override
    public AppointmentRecord value9(Integer value) {
        setStatus(value);
        return this;
    }

    @Override
    public AppointmentRecord values(Long value1, String value2, LocalDateTime value3, String value4, String value5, String value6, String value7, String value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AppointmentRecord
     */
    public AppointmentRecord() {
        super(Appointment.APPOINTMENT);
    }

    /**
     * Create a detached, initialised AppointmentRecord
     */
    public AppointmentRecord(Long hospitalid, String uuid, LocalDateTime timestamp, String phonenumber, String reason, String patientuuid, String name, String doctoruuid, Integer status) {
        super(Appointment.APPOINTMENT);

        setHospitalid(hospitalid);
        setUuid(uuid);
        setTimestamp(timestamp);
        setPhonenumber(phonenumber);
        setReason(reason);
        setPatientuuid(patientuuid);
        setName(name);
        setDoctoruuid(doctoruuid);
        setStatus(status);
        resetChangedOnNotNull();
    }
}
