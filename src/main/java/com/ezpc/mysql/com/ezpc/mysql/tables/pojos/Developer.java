/*
 * This file is generated by jOOQ.
 */
package com.ezpc.mysql.tables.pojos;


import java.io.Serializable;

import org.jooq.JSON;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Developer implements Serializable {

    private static final long serialVersionUID = 1L;

    private String uuid;
    private String name;
    private Integer age;
    private Byte gender;
    private String phonenumber;
    private Integer countryid;
    private String discordid;
    private JSON prolang;

    public Developer() {}

    public Developer(Developer value) {
        this.uuid = value.uuid;
        this.name = value.name;
        this.age = value.age;
        this.gender = value.gender;
        this.phonenumber = value.phonenumber;
        this.countryid = value.countryid;
        this.discordid = value.discordid;
        this.prolang = value.prolang;
    }

    public Developer(
        String uuid,
        String name,
        Integer age,
        Byte gender,
        String phonenumber,
        Integer countryid,
        String discordid,
        JSON prolang
    ) {
        this.uuid = uuid;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phonenumber = phonenumber;
        this.countryid = countryid;
        this.discordid = discordid;
        this.prolang = prolang;
    }

    /**
     * Getter for <code>spring.developer.uuid</code>.
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * Setter for <code>spring.developer.uuid</code>.
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * Getter for <code>spring.developer.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>spring.developer.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>spring.developer.age</code>.
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * Setter for <code>spring.developer.age</code>.
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Getter for <code>spring.developer.gender</code>.
     */
    public Byte getGender() {
        return this.gender;
    }

    /**
     * Setter for <code>spring.developer.gender</code>.
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * Getter for <code>spring.developer.phoneNumber</code>.
     */
    public String getPhonenumber() {
        return this.phonenumber;
    }

    /**
     * Setter for <code>spring.developer.phoneNumber</code>.
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     * Getter for <code>spring.developer.countryId</code>.
     */
    public Integer getCountryid() {
        return this.countryid;
    }

    /**
     * Setter for <code>spring.developer.countryId</code>.
     */
    public void setCountryid(Integer countryid) {
        this.countryid = countryid;
    }

    /**
     * Getter for <code>spring.developer.discordId</code>.
     */
    public String getDiscordid() {
        return this.discordid;
    }

    /**
     * Setter for <code>spring.developer.discordId</code>.
     */
    public void setDiscordid(String discordid) {
        this.discordid = discordid;
    }

    /**
     * Getter for <code>spring.developer.proLang</code>.
     */
    public JSON getProlang() {
        return this.prolang;
    }

    /**
     * Setter for <code>spring.developer.proLang</code>.
     */
    public void setProlang(JSON prolang) {
        this.prolang = prolang;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Developer (");

        sb.append(uuid);
        sb.append(", ").append(name);
        sb.append(", ").append(age);
        sb.append(", ").append(gender);
        sb.append(", ").append(phonenumber);
        sb.append(", ").append(countryid);
        sb.append(", ").append(discordid);
        sb.append(", ").append(prolang);

        sb.append(")");
        return sb.toString();
    }
}