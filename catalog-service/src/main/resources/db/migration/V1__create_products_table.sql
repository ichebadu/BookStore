create sequence products_id_seq start with 1 increment by 50;

-- DROP TABLE IF EXISTS products;
-- DROP SEQUENCE IF EXISTS products_id_seq;

create table products
(
    id bigint default nextval('products_id_seq') not null,
    code text not null unique,
    name text not null ,
    description text,
    image_url text,
    price numeric not null,
    primary key (id)
);