drop table if exists product;
drop table if exists category;

create table category(
	id int primary key auto_increment,
	name varchar(20) not null unique
);

create table product(
id int primary key auto_increment,
name varchar(20) not null ,
price int ,
cat_id int ,
foreign key(cat_id) references category(id)
);
