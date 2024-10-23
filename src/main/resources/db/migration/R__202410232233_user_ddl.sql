drop table if exists users;
drop sequence if exists users_id_seq;

CREATE SEQUENCE users_id_seq INCREMENT 1 START 1;

create table users (
    id int8 not null default nextval('users_id_seq'),
    "email" varchar(255) not null,
    "first_name" varchar(255) not null,
    "last_name" varchar(255) not null,
    "password" text not null,
    "profile_image" text null,
    "created_on" timestamp default now(),
    "updated_on" timestamp default now(),
    PRiMARY KEY (id),
    UNIQUE(email)
);