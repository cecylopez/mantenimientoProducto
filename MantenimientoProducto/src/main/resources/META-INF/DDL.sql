DROP TABLE producto;

CREATE TABLE producto (
codigo SERIAL PRIMARY KEY NOT NULL,
nombre VARCHAR(45) NOT NULL,
cantidad_existencia decimal NOT NULL,
precio_unitario decimal NOT NULL,
categoria int 
);
DROP TABLE categoria_producto;

CREATE TABLE categoria_producto(
codigo SERIAL PRIMARY KEY NOT NULL,
nombre VARCHAR(45) NOT NULL
);

ALTER TABLE producto
   ADD CONSTRAINT fk_categoria
   FOREIGN KEY (categoria)
REFERENCES categoria_producto(codigo);

INSERT INTO categoria_producto(nombre) values('materiales');
INSERT INTO categoria_producto(nombre) values('herramientas');
INSERT INTO categoria_producto(nombre) values('pinturas');
INSERT INTO categoria_producto(nombre) values('materiales contruccion');
