create database truyum;
use truyum;
create table MenuItems (
item_id int auto_increment primary key,
item_name varchar(30) not null,
price float(2) not null,
item_active boolean not null,
date_of_launch date not null,
category varchar(30) not null,
free_delivery boolean not null
);

create table Users (
user_id int auto_increment primary key,
user_name varchar(30) not null
);

create table Cart (
cart_user_id int,
cart_item_id int,
constraint primary key(cart_user_id,cart_item_id),
foreign key (cart_user_id) references Users(user_id),
foreign key (cart_item_id) references MenuItems(item_id)
);