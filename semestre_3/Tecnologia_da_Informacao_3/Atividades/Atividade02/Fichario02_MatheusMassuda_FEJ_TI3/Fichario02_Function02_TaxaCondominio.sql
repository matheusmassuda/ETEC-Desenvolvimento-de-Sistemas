use imobiliaria;
select * from apartamento;
select * from condominio;

-- Criação de função para calcular o valor da taxa de condomínio a partir do valor do apartamento passando como parâmetro o identificador do apartamento e percentual aplicado
DELIMITER //
CREATE FUNCTION CalculaTaxaCondominio (numero_ap_param VARCHAR(5), percentual DECIMAL(5,2)) RETURNS DECIMAL(10,2)
READS SQL DATA
BEGIN
-- declara variáveis para a função
	DECLARE valor_ap DECIMAL(10,2);
	DECLARE taxaCondominio DECIMAL(10,2);
    
-- busca valor do apartamento, "transforma" valor em valor_ap na tabale apartamento. Faz com o que o valor numero receba numero_ap_param
    SELECT valor INTO valor_ap FROM apartamento
    WHERE numero = numero_ap_param;
    
    -- Faz o cálculo percentual
    SET taxaCondominio = valor_ap * (percentual/100);
   
   -- retorna o valor do cálculo
	RETURN taxaCondominio;
END;
//
DELIMITER ;

-- Teste da função CalculaTaxaCondominio
select * from apartamento;

-- faz o "chamamento" da função, selecione o n° e valor do apartamento da tabela apartamento para exibir, e além disso exibo o cálculo realizado
-- pela function com o nome taxa_condominio
SELECT a.numero, a.valor, CalculaTaxaCondominio(a.numero, 15) AS taxa_condominio
FROM apartamento a
WHERE a.codigo_cond = 1;