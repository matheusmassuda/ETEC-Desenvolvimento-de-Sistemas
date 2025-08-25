use cadastro;

select * from cursos;

insert into cursos values
('1','HTML5','Curso de HTML5','40','37','2014'),
('2','AlgURITIMUS','Lógica de Programação','20','15','2014'),
('3','FÓTOSHÓPI','Curso completo de Photoshop','10','8','2014'),
('4','MySQL','Banco de Dados MySQL','36','15','2018');

select * from cursos;

-- Manipulando um registro ERRADO
update cursos
set nome = 'Algoritmos'
where idcurso = '2';

-- Manipulando outro registro
update cursos
set nome = 'Photoshop'
where idcurso = '3';

-- Manipulando mais de um valor no mesmo registro (linha)
update cursos
set nome = 'Inglês', descricao ='Inglês Básico', carga ='60', totaulas = '52', ano = '2025'
where idcurso = '3';

-- Inserindo nova LINHA
insert into cursos values
('5','Word','Pacote Office','20','13','2025');

-- Deletando uma LINHA
delete from cursos
where idcurso ='5';

-- Deletando TODOS os registros de uma tabela
truncate table cursos;

