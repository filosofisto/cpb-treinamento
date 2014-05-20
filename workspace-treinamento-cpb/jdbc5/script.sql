drop table pessoa;

create table pessoa (
  cpf varchar(11) not null primary key,
  nome varchar(30) not null,
  idade integer not null
);

insert into pessoa (cpf, nome, idade) values ("81646674987", "Eduardo Ribeiro da Silva", 39);
insert into pessoa (cpf, nome, idade) values ("88877766685", "Djovana Souza Vieira", 25);