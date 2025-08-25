-- Abre o BD cadastro
use cadastro;

-- Seleciona/exibe todas as tuplas (registros) da tabela gafanhotos
select * from gafanhotos;

-- Seleciona tabela inteira e exibe em ordem descentent alfabética de acordo com o campo
-- nome
select * from cursos
order by nome desc;

-- Seleciona e exibe APENAS os campos determinados da tabela
-- Além disso ordena por ano, em seguida ordena por nome
select idcurso, nome, ano from cursos
order by ano, nome;

-- Seleciona e ordena por linha (2016), mas exibe apenas o que foi pedido
-- (idcurso, nome e carga)
select idcurso, nome, carga from cursos
where ano ='2016'
order by nome;

select * from cursos;

-- Seleciona e exibe os campos da tabela cursos onde o ano for maio que 2018
-- e ordena pelos campos ano (menor > maior) e depois pelo nome (alfabético)
select idcurso, nome, carga, ano from cursos
where ano > 2018
order by ano, nome;

-- 
select nome, ano from cursos
where ano between 2014 and 2016
order by nome;

-- Seleciona todos os registros da tabela cursos, onde ano entre intervalo
-- Ordenase decrescente por ano depois crescente por nome
select *from cursos
where ano between 2019 and 2022
order by ano desc, nome;

-- seleciona e exibe os campos da tabela curso onde (especificamente for nos anos
-- 2014, 2015, 2018) e exibe em ordem de ano depois de nome
select idcurso, nome, carga, ano from cursos
where ano in (2014, 2015, 2018)
order by ano, nome;

-- seleciona e exibe os registros dos capmos da tabela curso
-- onde carga > 35 E total de aulas for menor (Operador lógico == satisfaz as duas condições)
select nome, carga, totaulas from cursos
where carga > 35 and totaulas < 30;

-- seleciona e exibe os registros dos capmos da tabela curso
-- onde carga > 35 OU total de aulas for menor (Operador lógico == satisfaz apenas uma das condições)
select nome, carga, totaulas from cursos
where carga > 35 or totaulas < 30;

