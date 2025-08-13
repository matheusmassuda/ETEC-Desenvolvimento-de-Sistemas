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

-- Adiciona um campo (na última coluna) em uma tabela
alter table pessoas
add column profissao varchar(20) default 'Dev' after nome,
add column nivel varchar(10) not null default '' after profissao;

-- Altera o tamanho do tipo cadastrado ao campo
alter table pessoas
modify column profissao decimal(5,3);

-- Altera exclusivamente o NOME do campo
alter table pessoas
change column profissao cargo varchar(20) not null default 'Dev';

-- Altera o nome da TABELA inteira
alter table pessoas
rename to funcionarios;

alter table pessoas
drop column profissao;

--
describe funcionarios;
select * from funcionarios;