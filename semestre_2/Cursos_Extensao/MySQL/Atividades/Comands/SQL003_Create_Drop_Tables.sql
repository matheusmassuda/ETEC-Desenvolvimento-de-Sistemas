use cadastro;

create table if not exists teste (
id int auto_increment,
nome varchar(30),
idade int,
primary key (id)
);

insert into teste value
(default, 'Matheus', '27'),
(default, 'Luiz', '27'),
(default, 'Massuda', default),
(default, 'Lá', '30');

describe teste;
select * from teste;

drop table if exists teste;