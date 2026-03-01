create database aula01_ti3;

use aula01_ti3;

create table pedido (
	id_pedido int auto_increment primary key,
    nomeproduto varchar(255) not null,
    descr_produto text,
    preco_produto decimal(10,2) not null
);

insert into pedido (nomeproduto, descr_produto, preco_produto) values
('Produto 1', 'Descrição do Produto 1', 10.99),
('Produto 2', 'Descrição do Produto 2', 20.49),
('Produto 3', 'Descrição do Produto 3', 15.75),
('Produto 4', 'Descrição do Produto 4', 8.50),
('Produto 5', 'Descrição do Produto 5', 30.00);

delimiter //
create procedure atualizar_valor_produto (in valor_parametro int, in id_parametro int)
begin
	-- Atualizar valor_produto da tabela pedido
    update pedido
    set preco_produto = preco_produto * (1 + (valor_parametro/100))
    where id_pedido = id_parametro;
end;
// delimiter ;
    call atualizar_valor_produto(100,4);
    
select * from pedido;



