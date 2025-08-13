create database cadastro
default character set utf8
default collate utf8_general_ci;

use cadastro;

create table pessoas (
id int not null auto_increment,
nome varchar(30) not null,
nascimento date,
sexo enum('M','F'),
peso decimal(5,2),
altura decimal(3,2),
nacionalidade varchar(20) default 'Brasil',
primary key (id)
) default charset = utf8;

-- Insere dados na tabela de acordo com a ordem especificada
insert into pessoas
(id, nome, nascimento, sexo, peso, altura, nacionalidade)
values
(default, 'Mayara', '1995-11-13', 'F', '58', '1.65', default);

-- Insere dados na tabela de acordo com a ordem padrão
insert into pessoas values
(default, 'Mayara', '1995-11-13', 'F', '58', '1.65', default);

-- Insere mais do que um conjunto de daos na tabela
insert into pessoas
(id, nome, nascimento, sexo, peso, altura, nacionalidade)
values
(default, 'Mayra', '1992-10-22', 'F', '80', '1.73', default),
(default, 'Rosana', '1969-01-09', 'F', '89', '1.63', default),
(default, 'Kauê', '1994-03-10', 'M', '78', '1.75', default);

select * from pessoas;