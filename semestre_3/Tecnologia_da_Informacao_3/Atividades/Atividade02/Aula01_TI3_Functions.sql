use aula01_ti3;
select * from pedido;

-- Função para retornar nome do produto a partir do ID
DELIMITER //

CREATE FUNCTION GetProdutoNome(id_pedido_param INT) RETURNS VARCHAR(255)
READS SQL DATA
BEGIN 
	DECLARE produto_nome VARCHAR(255);
    
    SELECT nomeproduto INTO produto_nome
    FROM pedido
    WHERE id_pedido = id_pedido_param;
    
    RETURN produto_nome;
END;

//

DELIMITER ;

-- Teste de chamamento da função que retorna o nome por meio do ID

SELECT GetProdutoNome(p.id_pedido) AS produto_nome, p.preco_produto AS preco_produto, p.descr_produto AS descricao_produto
FROM pedido p;


-- Criação de função para calcular imposto sobre produto
DELIMITER //
CREATE FUNCTION CalculaImposto (preco_produto DECIMAL(10,2), percentual DECIMAL(5,2)) RETURNS DECIMAL(10,2)
READS SQL DATA
BEGIN
	DECLARE imposto DECIMAL(10,2);
    
    SET imposto = preco_produto * (percentual/100);
   
	RETURN imposto;
END;
//
DELIMITER ;

-- Teste da função CalculaImposto
select * from pedido;

SELECT p.id_pedido AS pedio_numero, p.preco_produto AS preco_produto, CalculaImposto(p.preco_produto, 50) AS imposto_sobre_produto
FROM pedido p
WHERE p.id_pedido = 5;






