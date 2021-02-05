create database moviecruiser;
use moviecruiser;

create table Movies (
id int auto_increment primary key,
title varchar(100) not null,
box_office float not null,
movie_active boolean not null,
date_of_launch date not null,
genre varchar(20) not null,
teaser boolean not null
);

insert into Movies (title,box_office,movie_active,date_of_launch,genre,teaser) values (
"Dhoom",2.8,true,"2004-08-09","adventure",true);

insert into Movies (title,box_office,movie_active,date_of_launch,genre,teaser) values (
"Kabil",1.8,false,"2010-04-19","thriller",true);

insert into Movies (title,box_office,movie_active,date_of_launch,genre,teaser) values (
"Welcome",2.4,true,"2012-10-09","comedy",false);

insert into Movies (title,box_office,movie_active,date_of_launch,genre,teaser) values (
"Premam",8.8,true,"2015-05-23","romance",true);

insert into Movies (title,box_office,movie_active,date_of_launch,genre,teaser) values (
"Veeram",6.8,true,"2017-06-09","action",true);

select * from Movies;


create table Users (
user_id int auto_increment primary key,
user_name varchar(30) not null

);
create table Favorites (
user_id int,
movie_id int,
constraint primary key(user_id,movie_id),
foreign key (user_id) references Users(user_id),
foreign key (movie_id) references Movies(id)
);
insert into Users(user_name) values("Don");
insert into Users(user_name) values("Anu");

insert into Favorites values(1,1);
insert into Favorites values(1,2);
insert into Favorites values(2,3);
insert into Favorites values(2,4);

