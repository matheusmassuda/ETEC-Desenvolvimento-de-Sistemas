use imobiliaria;

select * from apartamento;
select * from condominio;

ALTER TABLE apartamento
ADD COLUMN numero_moradores INT
AFTER codigo_cond;

-- Desativar (0) e ativar (1) o safe mode para que seja possível acrescentar numero de moradores no apartamento
SET SQL_SAFE_UPDATES = 0;
SET SQL_SAFE_UPDATES = 1;


UPDATE apartamento
SET numero_moradores = FLOOR(1 + (RAND() * 5));

-- Criando a VIEW com numero de apartamentos, com nome condominio, e quantidade de pessoas residentes
CREATE VIEW vw_numeroapartamento_nomecondominio_quantidadepessoas AS
SELECT 
    a.numero,
    c.nome AS nome_condominio,
    a.numero_moradores
FROM apartamento a
JOIN condominio c
    ON a.codigo_cond = c.codigo;

SELECT * FROM vw_numeroapartamento_nomecondominio_quantidadepessoas;



