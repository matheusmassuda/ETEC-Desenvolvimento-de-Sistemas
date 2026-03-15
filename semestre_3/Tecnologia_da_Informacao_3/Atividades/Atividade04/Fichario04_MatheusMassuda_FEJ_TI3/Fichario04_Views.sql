use imobiliaria;

select * from condominio;
select * from apartamento;

-- Criando VIEW que apresente nome e telefone de contato do SÍNDICO
CREATE VIEW vw_nome_e_telefone_sindico AS
SELECT nome, telefone
FROM sindico;

select * from vw_nome_e_telefone_sindico;


-- Criando VIEW que apresenta o TOTAL de apartamentos por CONDOMÍNIO
CREATE VIEW vw_total_apartamentos_por_condominio AS
SELECT codigo_cond, COUNT(*) AS total_apartamentos
FROM apartamento
GROUP BY codigo_cond;

select * from vw_total_apartamentos_por_condominio;