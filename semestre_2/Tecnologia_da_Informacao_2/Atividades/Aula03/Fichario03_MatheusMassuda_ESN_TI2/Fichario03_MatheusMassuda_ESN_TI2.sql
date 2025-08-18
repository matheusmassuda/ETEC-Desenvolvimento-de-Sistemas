-- Criação e seleção doi Banco de Dados atividade03ti2 (caso não exista)
create database if not exists atividade03ti2;
use atividade03ti2;

-- Criação tabela proprietário
create table proprietario (
	RG varchar(15) not null,
    Nome varchar(100) not null,
    Telefone varchar(15) not null,
    Email varchar(100),
    primary key (RG)
);

-- Criação tabla garagem
create table garagem (
	Numero int not null,
    Tipo enum('Padrão','Coberta') not null,
    primary key (Numero)
);

-- Criação tabela sindico
create table sindico(
	Matricula int not null auto_increment,
    Nome varchar(100) not null,
    Endereco varchar(150),
    Telefone varchar(15) not null,
    primary key (Matricula)
);

-- Criação tabela condomínio
create table condominio (
	Codigo int not null auto_increment,
    Nome varchar(100) not null,
    Endereco varchar(150) not null,
    Matricula_Sindico int not null,
    primary key (Codigo),
    foreign key (Matricula_Sindico) references sindico (Matricula),
    unique key (Matricula_Sindico)
);

-- Criação tabela apartamento
create table apartamento (
	Numero int not null,
    Tipo enum ('Padrão','Cobertura') not null,
    Codigo_Condominio int not null,
    RG_Proprietario varchar(15) not null,
    Numero_Garagem int not null,
    primary key (Numero, Codigo_Condominio),
    foreign key (Codigo_Condominio) references condominio (Codigo),
    foreign key (RG_Proprietario) references proprietario (RG),
    foreign key (Numero_Garagem) references garagem (Numero),
    Unique key (Numero_Garagem)
);

-- Comando para teste da criação da tabela
describe apartamento;


