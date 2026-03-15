use imobiliaria;

-- CRIANDO usuário e concedendo o privilégio SELECT nas VIEWS criadas
CREATE USER 'usuario_view'@'localhost'
IDENTIFIED BY 'Usuario123';


-- Concedendo PRIVILÉGIOS ao usuário_view criado
GRANT SELECT ON imobiliaria.vw_nome_e_telefone_sindico
TO 'usuario_view'@'localhost';

GRANT SELECT ON imobiliaria.vw_total_apartamentos_por_condominio
TO 'usuario_view'@'localhost';

-- VERIFICANDO usuário e PRIVILÉGIO via COMANDOS SQL
SHOW GRANTS FOR 'usuario_view'@'localhost';