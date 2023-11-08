create schema spring;
use spring;

create table appointment
(
    hospitalId  bigint       not null,
    uuid        varchar(36)  not null,
    timestamp   datetime     not null,
    phoneNumber varchar(15)  null,
    reason      varchar(255) null,
    patientUuid varchar(36)  null,
    name        varchar(45)  null,
    doctorUuid  varchar(36)  not null,
    status      int          not null,
    primary key (hospitalId, uuid)
);

create index appointment_hospitalId_timestamp_index
    on appointment (hospitalId asc, timestamp desc);

create table doctor
(
    uuid                 varchar(36)   not null
        primary key,
    license              varchar(12)   not null,
    name                 varchar(255)  not null,
    university           varchar(255)  not null,
    phoneNumber          varchar(15)   null,
    email                varchar(120)  null,
    user                 varchar(15)   not null,
    secret               varchar(255)  not null,
    address              json          not null,
    country              varchar(5)    not null,
    specialityLicense    varchar(12)   null,
    specialityUniversity varchar(255)  null,
    schedule             json          null,
    prefix               varchar(15)   null,
    status               int default 0 not null,
    title                varchar(45)   not null,
    specialityTitle      varchar(45)   null,
    constraint unique_user_index
        unique (user)
);

create table drug
(
    id      int          not null
        primary key,
    name    varchar(255) not null,
    type    int          not null,
    aliases varchar(255) null
);

create table hospital
(
    id      bigint auto_increment
        primary key,
    name    varchar(120) not null,
    address varchar(120) not null,
    country varchar(3)   not null
);

create table hospitalDoctor
(
    hospitalId  bigint      not null,
    doctorId    varchar(36) not null,
    permissions json        not null,
    primary key (hospitalId, doctorId)
);

create table patient
(
    hospitalId  bigint       not null,
    uuid        varchar(36)  not null,
    name        varchar(120) not null,
    sex         tinyint(1)   not null,
    address     varchar(120) null,
    phoneNumber varchar(20)  null,
    email       varchar(120) null,
    country     varchar(3)   null,
    birthdate   date         null,
    primary key (hospitalId, uuid)
);

create table prescription
(
    hospitalId bigint                             not null,
    doctorId   varchar(36)                        not null,
    timestamp  datetime default CURRENT_TIMESTAMP not null,
    uuid       varchar(36)                        null,
    primary key (hospitalId, doctorId)
);

