DROP TABLE IF EXISTS CLIENTES;
CREATE TABLE CLIENTES (
		id_cliente 		INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
		nombre 			varchar(50) NOT NULL,
		activo 			bit
);

DROP TABLE IF EXISTS LISTA_COMPRAS;
CREATE TABLE LISTA_COMPRAS (
		id_lista					INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
		nombre						VARCHAR(50) NOT NULL,
		fecha_registro				date,
		fecha_ultima_actualizacion	date,
		activo						bit
);

DROP TABLE IF EXISTS PRODUCTOS;
CREATE TABLE PRODUCTOS (
		id_producto 	INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
		clave 			VARCHAR(15),
		descripcion 	VARCHAR(150),
		activo 			bit
);

DROP TABLE IF EXISTS LISTA_COMPRA_DETALLES;
CREATE TABLE LISTA_COMPRA_DETALLES (
		id_lista_compra 		INT,
		codigo_producto 		INT,
		id_producto 			INT NOT NULL,
		cantidad 				INT,
		primary key(id_lista_compra, codigo_producto));
