drop table if exists services;
drop sequence if exists services_id_seq;

CREATE SEQUENCE services_id_seq INCREMENT 1 START 1;

create table services (
    id int8 not null default nextval('services_id_seq'),
    "service_code" varchar(255) not null,
    "service_name" varchar(255) not null,
    "service_icon" varchar(255) null,
    "service_tariff" numeric(12,2) null,
    "created_on" timestamp default now(),
    "updated_on" timestamp default now(),
    PRiMARY KEY (id),
    UNIQUE(service_code)
);

INSERT INTO services (service_code,service_name,service_icon,service_tariff) VALUES ('PAJAK','Pajak PBB','https://nutech-integrasi.app/dummy.jpg',40000);
INSERT INTO services (service_code,service_name,service_icon,service_tariff) VALUES ('PLN','Listrik','https://nutech-integrasi.app/dummy.jpg',10000);
INSERT INTO services (service_code,service_name,service_icon,service_tariff) VALUES ('PDAM','PDAM Berlangganan','https://nutech-integrasi.app/dummy.jpg',40000);
INSERT INTO services (service_code,service_name,service_icon,service_tariff) VALUES ('PULSA','Pulsa','https://nutech-integrasi.app/dummy.jpg',40000);
INSERT INTO services (service_code,service_name,service_icon,service_tariff) VALUES ('PGN','PGN Berlangganan','https://nutech-integrasi.app/dummy.jpg',50000);
INSERT INTO services (service_code,service_name,service_icon,service_tariff) VALUES ('MUSIK','Musik Berlangganan','https://nutech-integrasi.app/dummy.jpg',50000);
INSERT INTO services (service_code,service_name,service_icon,service_tariff) VALUES ('TV','TV Berlangganan','https://nutech-integrasi.app/dummy.jpg',50000);
INSERT INTO services (service_code,service_name,service_icon,service_tariff) VALUES ('PAKET_DATA','Paket data','https://nutech-integrasi.app/dummy.jpg',50000);
INSERT INTO services (service_code,service_name,service_icon,service_tariff) VALUES ('VOUCHER_GAME','Voucher Game','https://nutech-integrasi.app/dummy.jpg',100000);
INSERT INTO services (service_code,service_name,service_icon,service_tariff) VALUES ('VOUCHER_MAKANAN','Voucher Makanan','https://nutech-integrasi.app/dummy.jpg',100000);
INSERT INTO services (service_code,service_name,service_icon,service_tariff) VALUES ('QURBAN','Qurban','https://nutech-integrasi.app/dummy.jpg',200000);
INSERT INTO services (service_code,service_name,service_icon,service_tariff) VALUES ('ZAKAT','Zakat','https://nutech-integrasi.app/dummy.jpg',300000);