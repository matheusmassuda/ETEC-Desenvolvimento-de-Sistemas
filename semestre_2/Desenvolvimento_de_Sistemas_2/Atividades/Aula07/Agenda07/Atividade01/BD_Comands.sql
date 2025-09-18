use pwii;

describe produto;
select * from produto;

create table produto (
	idproduto int not null auto_increment,
    nome varchar(45) not null,
    preco float not null,
    quantidade int not null,
    primary key (idproduto)
);

