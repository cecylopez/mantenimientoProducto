DROP TABLE producto;

CREATE TABLE producto (
codigo SERIAL PRIMARY KEY NOT NULL,
nombre VARCHAR(45) NOT NULL,
cantidad_existencia decimal NOT NULL,
precio_unitario decimal NOT NULL,
categoria_codigo int 
);
DROP TABLE categoria_producto;

CREATE TABLE categoria_producto(
codigo SERIAL PRIMARY KEY NOT NULL,
nombre VARCHAR(45) NOT NULL
);

ALTER TABLE producto
   ADD CONSTRAINT fk_categoria
   FOREIGN KEY (categoria_codigo)
REFERENCES categoria_producto(codigo);

INSERT INTO categoria_producto(nombre) values('materiales');
INSERT INTO categoria_producto(nombre) values('herramientas');
INSERT INTO categoria_producto(nombre) values('pinturas');
INSERT INTO categoria_producto(nombre) values('materiales construccion');

INSERT INTO producto(nombre, cantidad_existencia, precio_unitario, categoria_codigo) VALUES ('Producto1', 1, 1.01, 1);
INSERT INTO producto(nombre, cantidad_existencia, precio_unitario, categoria_codigo) VALUES ('Producto2', 2, 2.02, 1);
INSERT INTO producto(nombre, cantidad_existencia, precio_unitario, categoria_codigo) VALUES ('Producto3', 3, 3.03, 1);
INSERT INTO producto(nombre, cantidad_existencia, precio_unitario, categoria_codigo) VALUES ('Producto4', 4, 4.04, 2);
INSERT INTO producto(nombre, cantidad_existencia, precio_unitario, categoria_codigo) VALUES ('Producto5', 5, 5.05, 2);

