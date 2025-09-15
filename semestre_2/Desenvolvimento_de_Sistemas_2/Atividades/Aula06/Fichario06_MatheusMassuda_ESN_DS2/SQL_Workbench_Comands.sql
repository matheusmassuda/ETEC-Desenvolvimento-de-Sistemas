

describe alunoconcluinte;
select * from alunoconcluinte;

use pwii;

create table alunoconcluinte (
	idalunoconcluinte int(11) not null auto_increment,
    nome varchar(45) not null,
    nota1 float not null,
    nota2 float not null,
    nota3 float not null,
    nota4 float not null,
    primary key (idalunoconcluinte)
);

insert into alunoconcluinte (nome, nota1, nota2, nota3, nota4) values
('Eduarda', 10, 10, 9, 10),
('Paulo', 10, 9, 8, 9),
('Igo', 10, 8, 10, 10),
('Guilherm', 10, 9, 8, 7),
('Henrique', 9, 9, 8, 7),
('Nilson', 10, 9, 10, 9),
('Ana', 9, 9, 8, 8),
('Amanda', 8, 9, 9, 8),
('Carlos', 6, 6, 5, 6),
('Pedro', 8, 8, 8, 7);

-- Cria usuário (caso não exista)
CREATE USER IF NOT EXISTS 'pwii_user'@'localhost' IDENTIFIED BY 'senha123';

-- Concede permissões
GRANT SELECT, INSERT, UPDATE, DELETE ON pwii.* TO 'pwii_user'@'localhost';

-- Opcional: recarregar privilégios
FLUSH PRIVILEGES;