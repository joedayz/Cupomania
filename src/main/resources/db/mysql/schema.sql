
CREATE TABLE IF NOT EXISTS cupon (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  dni VARCHAR(8),
  cupon VARCHAR(30),
  codigoCampana VARCHAR(10),
  status VARCHAR(1),
  INDEX(dni)
) engine=InnoDB;

