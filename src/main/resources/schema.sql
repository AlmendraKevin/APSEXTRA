DROP TABLE IF EXISTS ZAPATOS;
DROP TABLE IF EXISTS USUARIOS;

CREATE TABLE USUARIOS(
id INT AUTO_INCREMENT PRIMARY KEY,
active tinyint DEFAULT '1',
password varchar(100) NOT  NULL ,
roles varchar(100) NOT NULL ,
user_name varchar(100) NOT NULL);


CREATE TABLE ZAPATOS(
id_zapato INT AUTO_INCREMENT PRIMARY KEY,
modelo_zapato varchar(60) NOT NULL ,
color_zapato varchar(60) NOT NULL,
talla_zapato varchar(60) NOT NULL,
existencia_zapato varchar(60) NOT NULL,
costo_zapato varchar(60) NOT NULL ,
ubicacion_zapato varchar(60) NOT NULL ,
img longblob,
str text);