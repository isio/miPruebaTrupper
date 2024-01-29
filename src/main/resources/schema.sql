DROP TABLE IF EXISTS CLIENTES;
CREATE TABLE CLIENTES (
id_cliente INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
nombre varchar(50) NOT NULL,
activo bit
);



DROP TABLE IF EXISTS LISTA_COMPRA;
CREATE TABLE LISTA_COMPRA (
id_lista INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
id_cliente INT NOT NULL,
nombre VARCHAR(50) NOT NULL,
fecha_registro date,
fecha_ultima_actualizacion date,
activo bit
);
DROP TABLE IF EXISTS PRODUCTOS;
CREATE TABLE PRODUCTO (
id_producto INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
clave VARCHAR(15),
descripcion VARCHAR(150),
activo bit
);

DROP TABLE IF EXISTS LISTA_COMPRA_DETALLE;
CREATE TABLE LISTA_COMPRA_DETALLE (
id_lista_compra INT,
codigo_producto INT,
FOREIGN KEY (id_lista_compra) REFERENCES
LISTA_COMPRA (id_lista),
id_producto INT NOT NULL,
cantidad INT,
 primary key(id_lista_compra,codigo_producto));
