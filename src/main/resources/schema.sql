create database mybatisEx2;

use mybatisEx2;

create table Products
(
    prod_id int primary key auto_increment,
    prod_name varchar(255) not null,
    prod_price int not null
);