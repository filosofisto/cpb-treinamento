--Acessar o mysql: mysql -u root -p

create database testdb;

use testdb;

create table pessoa (
  id integer not null primary key,
  nome varchar(30) not null
);

insert into pessoa (id,nome) values (1, 'Eduardo');
insert into pessoa (id,nome) values (2, 'Ribeiro');
insert into pessoa (id,nome) values (3, 'Silva');
insert into pessoa (id,nome) values (4, 'Juliana');
insert into pessoa (id,nome) values (5, 'Maria Eduarda');
insert into pessoa (id,nome) values (6, 'Djovana');
insert into pessoa (id,nome) values (7, 'Hiago');
insert into pessoa (id,nome) values (8, 'Hanna');
insert into pessoa (id,nome) values (9, 'Helena');
insert into pessoa (id,nome) values (10, 'Eloi');