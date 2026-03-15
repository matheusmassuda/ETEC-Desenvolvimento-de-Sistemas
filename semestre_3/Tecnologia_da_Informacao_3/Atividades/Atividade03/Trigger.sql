use aula01_ti3

-- CRIAÇÃO DA TRIGGER
DELIMITER //
CREATE TRIGGER atualizar_data_modificacao_pedido
BEFORE UPDATE ON pedido
FOR EACH ROW
BEGIN
	SET NEW.data_modificacao = NOW();
END ;
//
DELIMITER ;

INSERT INTO pedido (nomeproduto, descr_produto, preco_produto)
VALUES ('produto jc', 'produto jc muito legal', 9.99);

-- DESATIVAÇÃO DO SAFE MODE DO SQL E UPDATE DO NOME DO PRODUTO
SET SQL_SAFE_UPDATES = 0;
UPDATE pedido
SET nomeproduto = 'Produto Matheus' 
WHERE nomeproduto = 'produto jc';

-- INSERINDO DADOS
DELIMITER //
CREATE TRIGGER calcular_gorgeta
BEFORE INSERT ON pedido
FOR EACH ROW
BEGIN
	SET NEW.gorgeta = NEW.preco_produto * 0.1;
END ;
//
DELIMITER ;

-- DESATIVAÇÃO DO SAFE MODE DO SQL E INSERÇÃO DA GORGETA
INSERT INTO pedido (nomeproduto, descr_produto, preco_produto)
VALUES ('produto NOVO', 'Recem lançado', 10.00);

SELECT * FROM pedido;