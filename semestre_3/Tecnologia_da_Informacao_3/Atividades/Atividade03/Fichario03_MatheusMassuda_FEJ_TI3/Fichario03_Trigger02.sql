USE imobiliaria;

DELIMITER //
CREATE TRIGGER trg_desvaloriza_apartamento
AFTER DELETE ON garagem
FOR EACH ROW
BEGIN
    UPDATE apartamento
    SET valor = valor * 0.70
    WHERE numero = OLD.numero_ap;
END //
DELIMITER ;

SELECT * 
FROM garagem
WHERE numero_ap = 'a401';



DELETE FROM garagem
WHERE numero = 4;



