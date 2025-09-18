use pwii;

select * from estado;
describe estado;

create table estado (
	idestado int not null auto_increment,
    nome varchar(45) not null,
    sigla varchar(2) not null,
    primary key (idestado)
);

insert into estado (nome, sigla) values
('Acre','AC'),
('Alagoas','AL'),
('Amapá','AP'),
('Amazonas','AM'),
('Bahia','BA'),
('Espírito Santo','ES'),
('Goiás','GO'),
('Maranhão','MA'),
('Mato Grosso','MT'),
('Mato Grosso do Sul','MS'),
('Minas Gerais','MG'),
('Pará','PA'),
('Paraíba','PB'),
('Paraná','PR'),
('Pernambuco','PE'),
('Piauí','PI'),
('Rio de Janeiro','RJ'),
('Rio Grande do Norte','RN'),
('Rio Grande do Sul','RS'),
('Rondônia','RO'),
('Roraima','RR'),
('Santa Catarina','SC'),
('São Paulo','SP'),
('Sergipe','SE'),
('Tocantins','TO'),
('Distrito Federal','DF')
;













