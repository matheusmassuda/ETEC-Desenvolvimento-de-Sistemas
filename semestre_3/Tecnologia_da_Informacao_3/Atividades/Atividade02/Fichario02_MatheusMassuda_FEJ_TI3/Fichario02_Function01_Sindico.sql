use imobiliaria;

select * from sindico;

-- Cria Função como nome GetNomeSindico para retornar nome do sindico a partir do ID
DELIMITER //
CREATE FUNCTION GetNomeSindico(matricula_param INT) RETURNS VARCHAR(255)
READS SQL DATA
BEGIN 
-- declara a criação da variável nome_sindico
	DECLARE nome_sindico VARCHAR(255);
 
 -- seleciona e "transforma" a coluna nome na coluna nome_sindico da nova query para exibir os resutlados da função
    SELECT nome INTO nome_sindico
    FROM sindico
    WHERE matricula = matricula_param;
    
 -- retorna o resultado da query
    RETURN nome_sindico;
END;
// 
DELIMITER ;

-- Teste de chamamento da função que retorna o nome do síndico pela matricula (tentei trabalhar com o apelidamento como visto na video aula
-- exemplo: "s." é um apelido para tabela sindico e retorna os valores consultados "AS" "COMO" campos na nova tabela de consulta
SELECT GetNomeSindico(1) AS nome_sindico, s.endereco AS endereco_sindico, s.telefone AS telefone_sindico
FROM sindico s;

-- Intruções para apresentar dados do condomínio usei "c." como apelido para a tabela condomínio
SELECT GetNomeSindico(c.matricula_sind) AS nome_sindico, c.nome AS nome_condominio, c.endereco AS endereco_condominio
FROM condominio c;





