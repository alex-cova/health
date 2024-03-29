/*
 * This file is generated by jOOQ.
 */
package com.ezpc.mysql.tables.records;


import com.ezpc.mysql.tables.Doctor;

import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DoctorRecord extends UpdatableRecordImpl<DoctorRecord> implements Record17<String, String, String, String, String, String, String, String, JSON, String, String, String, JSON, String, Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>spring.doctor.uuid</code>.
     */
    public void setUuid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>spring.doctor.uuid</code>.
     */
    public String getUuid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>spring.doctor.license</code>.
     */
    public void setLicense(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>spring.doctor.license</code>.
     */
    public String getLicense() {
        return (String) get(1);
    }

    /**
     * Setter for <code>spring.doctor.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>spring.doctor.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>spring.doctor.university</code>.
     */
    public void setUniversity(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>spring.doctor.university</code>.
     */
    public String getUniversity() {
        return (String) get(3);
    }

    /**
     * Setter for <code>spring.doctor.phoneNumber</code>.
     */
    public void setPhonenumber(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>spring.doctor.phoneNumber</code>.
     */
    public String getPhonenumber() {
        return (String) get(4);
    }

    /**
     * Setter for <code>spring.doctor.email</code>.
     */
    public void setEmail(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>spring.doctor.email</code>.
     */
    public String getEmail() {
        return (String) get(5);
    }

    /**
     * Setter for <code>spring.doctor.user</code>.
     */
    public void setUser(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>spring.doctor.user</code>.
     */
    public String getUser() {
        return (String) get(6);
    }

    /**
     * Setter for <code>spring.doctor.secret</code>.
     */
    public void setSecret(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>spring.doctor.secret</code>.
     */
    public String getSecret() {
        return (String) get(7);
    }

    /**
     * Setter for <code>spring.doctor.address</code>.
     */
    public void setAddress(JSON value) {
        set(8, value);
    }

    /**
     * Getter for <code>spring.doctor.address</code>.
     */
    public JSON getAddress() {
        return (JSON) get(8);
    }

    /**
     * Setter for <code>spring.doctor.country</code>.
     */
    public void setCountry(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>spring.doctor.country</code>.
     */
    public String getCountry() {
        return (String) get(9);
    }

    /**
     * Setter for <code>spring.doctor.specialityLicense</code>.
     */
    public void setSpecialitylicense(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>spring.doctor.specialityLicense</code>.
     */
    public String getSpecialitylicense() {
        return (String) get(10);
    }

    /**
     * Setter for <code>spring.doctor.specialityUniversity</code>.
     */
    public void setSpecialityuniversity(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>spring.doctor.specialityUniversity</code>.
     */
    public String getSpecialityuniversity() {
        return (String) get(11);
    }

    /**
     * Setter for <code>spring.doctor.schedule</code>.
     */
    public void setSchedule(JSON value) {
        set(12, value);
    }

    /**
     * Getter for <code>spring.doctor.schedule</code>.
     */
    public JSON getSchedule() {
        return (JSON) get(12);
    }

    /**
     * Setter for <code>spring.doctor.prefix</code>.
     */
    public void setPrefix(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>spring.doctor.prefix</code>.
     */
    public String getPrefix() {
        return (String) get(13);
    }

    /**
     * Setter for <code>spring.doctor.status</code>.
     */
    public void setStatus(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>spring.doctor.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>spring.doctor.title</code>.
     */
    public void setTitle(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>spring.doctor.title</code>.
     */
    public String getTitle() {
        return (String) get(15);
    }

    /**
     * Setter for <code>spring.doctor.specialityTitle</code>.
     */
    public void setSpecialitytitle(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>spring.doctor.specialityTitle</code>.
     */
    public String getSpecialitytitle() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<String, String, String, String, String, String, String, String, JSON, String, String, String, JSON, String, Integer, String, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<String, String, String, String, String, String, String, String, JSON, String, String, String, JSON, String, Integer, String, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Doctor.DOCTOR.UUID;
    }

    @Override
    public Field<String> field2() {
        return Doctor.DOCTOR.LICENSE;
    }

    @Override
    public Field<String> field3() {
        return Doctor.DOCTOR.NAME;
    }

    @Override
    public Field<String> field4() {
        return Doctor.DOCTOR.UNIVERSITY;
    }

    @Override
    public Field<String> field5() {
        return Doctor.DOCTOR.PHONENUMBER;
    }

    @Override
    public Field<String> field6() {
        return Doctor.DOCTOR.EMAIL;
    }

    @Override
    public Field<String> field7() {
        return Doctor.DOCTOR.USER;
    }

    @Override
    public Field<String> field8() {
        return Doctor.DOCTOR.SECRET;
    }

    @Override
    public Field<JSON> field9() {
        return Doctor.DOCTOR.ADDRESS;
    }

    @Override
    public Field<String> field10() {
        return Doctor.DOCTOR.COUNTRY;
    }

    @Override
    public Field<String> field11() {
        return Doctor.DOCTOR.SPECIALITYLICENSE;
    }

    @Override
    public Field<String> field12() {
        return Doctor.DOCTOR.SPECIALITYUNIVERSITY;
    }

    @Override
    public Field<JSON> field13() {
        return Doctor.DOCTOR.SCHEDULE;
    }

    @Override
    public Field<String> field14() {
        return Doctor.DOCTOR.PREFIX;
    }

    @Override
    public Field<Integer> field15() {
        return Doctor.DOCTOR.STATUS;
    }

    @Override
    public Field<String> field16() {
        return Doctor.DOCTOR.TITLE;
    }

    @Override
    public Field<String> field17() {
        return Doctor.DOCTOR.SPECIALITYTITLE;
    }

    @Override
    public String component1() {
        return getUuid();
    }

    @Override
    public String component2() {
        return getLicense();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getUniversity();
    }

    @Override
    public String component5() {
        return getPhonenumber();
    }

    @Override
    public String component6() {
        return getEmail();
    }

    @Override
    public String component7() {
        return getUser();
    }

    @Override
    public String component8() {
        return getSecret();
    }

    @Override
    public JSON component9() {
        return getAddress();
    }

    @Override
    public String component10() {
        return getCountry();
    }

    @Override
    public String component11() {
        return getSpecialitylicense();
    }

    @Override
    public String component12() {
        return getSpecialityuniversity();
    }

    @Override
    public JSON component13() {
        return getSchedule();
    }

    @Override
    public String component14() {
        return getPrefix();
    }

    @Override
    public Integer component15() {
        return getStatus();
    }

    @Override
    public String component16() {
        return getTitle();
    }

    @Override
    public String component17() {
        return getSpecialitytitle();
    }

    @Override
    public String value1() {
        return getUuid();
    }

    @Override
    public String value2() {
        return getLicense();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getUniversity();
    }

    @Override
    public String value5() {
        return getPhonenumber();
    }

    @Override
    public String value6() {
        return getEmail();
    }

    @Override
    public String value7() {
        return getUser();
    }

    @Override
    public String value8() {
        return getSecret();
    }

    @Override
    public JSON value9() {
        return getAddress();
    }

    @Override
    public String value10() {
        return getCountry();
    }

    @Override
    public String value11() {
        return getSpecialitylicense();
    }

    @Override
    public String value12() {
        return getSpecialityuniversity();
    }

    @Override
    public JSON value13() {
        return getSchedule();
    }

    @Override
    public String value14() {
        return getPrefix();
    }

    @Override
    public Integer value15() {
        return getStatus();
    }

    @Override
    public String value16() {
        return getTitle();
    }

    @Override
    public String value17() {
        return getSpecialitytitle();
    }

    @Override
    public DoctorRecord value1(String value) {
        setUuid(value);
        return this;
    }

    @Override
    public DoctorRecord value2(String value) {
        setLicense(value);
        return this;
    }

    @Override
    public DoctorRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public DoctorRecord value4(String value) {
        setUniversity(value);
        return this;
    }

    @Override
    public DoctorRecord value5(String value) {
        setPhonenumber(value);
        return this;
    }

    @Override
    public DoctorRecord value6(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public DoctorRecord value7(String value) {
        setUser(value);
        return this;
    }

    @Override
    public DoctorRecord value8(String value) {
        setSecret(value);
        return this;
    }

    @Override
    public DoctorRecord value9(JSON value) {
        setAddress(value);
        return this;
    }

    @Override
    public DoctorRecord value10(String value) {
        setCountry(value);
        return this;
    }

    @Override
    public DoctorRecord value11(String value) {
        setSpecialitylicense(value);
        return this;
    }

    @Override
    public DoctorRecord value12(String value) {
        setSpecialityuniversity(value);
        return this;
    }

    @Override
    public DoctorRecord value13(JSON value) {
        setSchedule(value);
        return this;
    }

    @Override
    public DoctorRecord value14(String value) {
        setPrefix(value);
        return this;
    }

    @Override
    public DoctorRecord value15(Integer value) {
        setStatus(value);
        return this;
    }

    @Override
    public DoctorRecord value16(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public DoctorRecord value17(String value) {
        setSpecialitytitle(value);
        return this;
    }

    @Override
    public DoctorRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, JSON value9, String value10, String value11, String value12, JSON value13, String value14, Integer value15, String value16, String value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DoctorRecord
     */
    public DoctorRecord() {
        super(Doctor.DOCTOR);
    }

    /**
     * Create a detached, initialised DoctorRecord
     */
    public DoctorRecord(String uuid, String license, String name, String university, String phonenumber, String email, String user, String secret, JSON address, String country, String specialitylicense, String specialityuniversity, JSON schedule, String prefix, Integer status, String title, String specialitytitle) {
        super(Doctor.DOCTOR);

        setUuid(uuid);
        setLicense(license);
        setName(name);
        setUniversity(university);
        setPhonenumber(phonenumber);
        setEmail(email);
        setUser(user);
        setSecret(secret);
        setAddress(address);
        setCountry(country);
        setSpecialitylicense(specialitylicense);
        setSpecialityuniversity(specialityuniversity);
        setSchedule(schedule);
        setPrefix(prefix);
        setStatus(status);
        setTitle(title);
        setSpecialitytitle(specialitytitle);
        resetChangedOnNotNull();
    }
}
