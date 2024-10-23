drop table if exists banners;
drop sequence if exists banners_id_seq;

CREATE SEQUENCE banners_id_seq INCREMENT 1 START 1;

create table banners (
    id int8 not null default nextval('banners_id_seq'),
    "banner_name" varchar(255) not null,
    "banner_image" text not null,
    "description" text null,
    "created_on" timestamp default now(),
    "updated_on" timestamp default now(),
    PRiMARY KEY (id)
);

INSERT INTO banners (banner_name,banner_image,description) VALUES ('Banner 1','https://nutech-integrasi.app/dummy.jpg','Lerem Ipsum Dolor sit amet');
INSERT INTO banners (banner_name,banner_image,description) VALUES ('Banner 2','https://nutech-integrasi.app/dummy.jpg','Lerem Ipsum Dolor sit amet');
INSERT INTO banners (banner_name,banner_image,description) VALUES ('Banner 3','https://nutech-integrasi.app/dummy.jpg','Lerem Ipsum Dolor sit amet');
INSERT INTO banners (banner_name,banner_image,description) VALUES ('Banner 4','https://nutech-integrasi.app/dummy.jpg','Lerem Ipsum Dolor sit amet');
INSERT INTO banners (banner_name,banner_image,description) VALUES ('Banner 5','https://nutech-integrasi.app/dummy.jpg','Lerem Ipsum Dolor sit amet');
INSERT INTO banners (banner_name,banner_image,description) VALUES ('Banner 6','https://nutech-integrasi.app/dummy.jpg','Lerem Ipsum Dolor sit amet');
