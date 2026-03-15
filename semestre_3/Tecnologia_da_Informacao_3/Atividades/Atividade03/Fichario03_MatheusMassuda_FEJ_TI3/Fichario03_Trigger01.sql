USE imobiliaria;

select * from apartamento;
select * from garagem;

-- INSERINDO GARAGEM AUTOMATICAMENTE
DELIMITER //

CREATE TRIGGER trg_garagem_cobertura
AFTER INSERT ON apartamento
FOR EACH ROW
BEGIN

    IF NEW.tipo = 'cobertura' THEN
    
        INSERT INTO garagem (tipo, numero_ap)
        VALUES ('coberta', NEW.numero);
        
    END IF;

END //

DELIMITER ;

INSERT INTO apartamento (numero, tipo, codigo_cond, valor)
VALUES ('c601', 'cobertura', 1, 300000.00);

SELECT * 
FROM garagem
WHERE numero_ap = 'c601';

SHOW TRIGGERS FROM imobiliaria;