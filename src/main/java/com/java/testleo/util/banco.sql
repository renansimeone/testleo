create database testleodb;
use testleodb;
create table pessoa(
    id long primary key auto_increment,
    nome varchar(50) not null,
    email varchar(50) unique,
    cpf varchar(11) unique,
    ativo boolean not null
);
insert into pessoa values(null, 'Renan Simeone Moreira', 'renansimeone@gmail.com', '13263354728', true);
insert into pessoa values(null, 'Leo', 'Leo@gmail.com', '00000000000', true);