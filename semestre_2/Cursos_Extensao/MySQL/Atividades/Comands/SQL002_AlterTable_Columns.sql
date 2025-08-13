use cadastro;

create table if not exists cursos (
nome varchar(30) not null unique,
descricao text,
carga int unsigned,
totaulas int unsigned,
ano year default '2025'
) default charset = utf8;

alter table cursos
add column idcurso int not null first,
add primary key (idcurso);


describe cursos;
select * from cursos;