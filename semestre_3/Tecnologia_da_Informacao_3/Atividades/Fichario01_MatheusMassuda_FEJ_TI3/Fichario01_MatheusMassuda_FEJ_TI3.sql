create database atividade01_ti3;

use atividade01_ti3;

-- criação das tabelas propostas pela (IA) --
CREATE TABLE clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(150) NOT NULL
);

CREATE TABLE produtos (
    id_produto INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    preco DECIMAL(10,2) NOT NULL CHECK (preco >= 0)
);

CREATE TABLE pedidos (
    id_pedido INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INTEGER NOT NULL,
    data_pedido DATE NOT NULL,
    CONSTRAINT fk_cliente
        FOREIGN KEY (id_cliente)
        REFERENCES clientes(id_cliente)
        ON DELETE RESTRICT
);

CREATE TABLE itens_pedido (
    id_item INT AUTO_INCREMENT PRIMARY KEY,
    id_pedido INTEGER NOT NULL,
    id_produto INTEGER NOT NULL,
    quantidade INTEGER NOT NULL CHECK (quantidade > 0),
    preco_unitario DECIMAL(10,2) NOT NULL CHECK (preco_unitario >= 0),

    CONSTRAINT fk_pedido
        FOREIGN KEY (id_pedido)
        REFERENCES pedidos(id_pedido)
        ON DELETE CASCADE,

    CONSTRAINT fk_produto
        FOREIGN KEY (id_produto)
        REFERENCES produtos(id_produto)
        ON DELETE RESTRICT
);

-- inserindo dados nas tabelas --
INSERT INTO clientes (nome) VALUES
('Ana Souza'),
('Bruno Lima'),
('Carla Mendes'),
('Diego Rocha');

INSERT INTO produtos (nome, preco) VALUES
('Notebook', 3500.00),
('Mouse Gamer', 120.00),
('Teclado Mecânico', 450.00),
('Monitor 24"', 900.00);

INSERT INTO pedidos (id_cliente, data_pedido) VALUES
(1, '2025-05-10'),
(2, '2025-05-15'),
(3, '2024-11-20'),
(4, '2020-03-05');

INSERT INTO itens_pedido (id_pedido, id_produto, quantidade, preco_unitario) VALUES
-- Pedido 1 (Ana - Maio 2025)
(1, 1, 1, 3500.00),
(1, 2, 2, 120.00),

-- Pedido 2 (Bruno - Maio 2025)
(2, 3, 1, 450.00),
(2, 2, 1, 120.00),

-- Pedido 3 (Carla - 2024)
(3, 4, 1, 900.00),

-- Pedido 4 (Diego - 2020)
(4, 2, 3, 120.00);

select * from pedidos;


-- CRIAÇÃO DO STORED PROCEDURE --
DELIMITER //
CREATE PROCEDURE relatorio_vendas_mensal (
    IN p_ano INT,
    IN p_mes INT
)
BEGIN
    -- Total de vendas no mês
    SELECT 
        SUM(ip.quantidade * ip.preco_unitario) AS total_vendas
    FROM pedidos p
    JOIN itens_pedido ip ON p.id_pedido = ip.id_pedido
    WHERE YEAR(p.data_pedido) = p_ano
      AND MONTH(p.data_pedido) = p_mes;

    -- Quantidade total de pedidos
    SELECT 
        COUNT(DISTINCT p.id_pedido) AS total_pedidos
    FROM pedidos p
    WHERE YEAR(p.data_pedido) = p_ano
      AND MONTH(p.data_pedido) = p_mes;

    -- Ticket médio
    SELECT 
        SUM(ip.quantidade * ip.preco_unitario) /
        COUNT(DISTINCT p.id_pedido) AS ticket_medio
    FROM pedidos p
    JOIN itens_pedido ip ON p.id_pedido = ip.id_pedido
    WHERE YEAR(p.data_pedido) = p_ano
      AND MONTH(p.data_pedido) = p_mes;

    -- Top 5 produtos mais vendidos
    SELECT 
        pr.nome,
        SUM(ip.quantidade) AS total_vendido
    FROM pedidos p
    JOIN itens_pedido ip ON p.id_pedido = ip.id_pedido
    JOIN produtos pr ON pr.id_produto = ip.id_produto
    WHERE YEAR(p.data_pedido) = p_ano
      AND MONTH(p.data_pedido) = p_mes
    GROUP BY pr.id_produto, pr.nome
    ORDER BY total_vendido DESC
    LIMIT 5;

END;
//
DELIMITER ;

select * from clientes;
select * from itens_pedido;
select * from pedidos;
select * from produtos;
CALL relatorio_vendas_mensal(2025, 5);


