use aula01_ti3;

select * from pedido;

-- Criadno Views Simples para listar pedidos (tabeas de vizualização pré-programadas
-- Aqui fazemos um SELETC NORMAL ser armazenado dentro de uma TABELA VIRTUAL chamada VIEW
CREATE VIEW vw_lista_pedidos AS
SELECT id_pedido, nomeproduto, descr_produto, preco_produto
FROM pedido;

SELECT * FROM vw_lista_pedidos;


-- Criando VIEWS com FILTRO DE PREÇO
CREATE VIEW vw_pedidos_acima_de_15 AS
SELECT id_pedido, nomeproduto, descr_produto, preco_produto
FROM pedido
WHERE preco_produto > 15.00;

SELECT * FROM vw_pedidos_acima_de_15;

-- VIEW que calcula o TOTAL DE PEDIDOS
CREATE VIEW vw_total_pedidos AS
SELECT SUM(preco_produto) AS total_pedido
FROM pedido;

SELECT * FROM vw_total_pedidos;

-- Creiando VIEWS que agrupa pedidos por nome de produto
CREATE VIEW vw_pedidos_por_produto AS
SELECT nomeproduto, COUNT(*) AS quantidade_pedidos
FROM pedido
GROUP BY nomeproduto;

SELECT * FROM vw_pedidos_por_produto;

INSERT INTO pedido (nomeproduto, descr_produto, preco_produto) VALUES
	('Produto 1', 'Descrição do Produto 1', 10.90);
