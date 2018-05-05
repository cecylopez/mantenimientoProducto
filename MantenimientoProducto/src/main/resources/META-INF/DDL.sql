DROP TABLE producto;

CREATE TABLE producto (
codigo SERIAL PRIMARY KEY NOT NULL,
nombre VARCHAR(45) NOT NULL,
cantidadExistencia decimal NOT NULL,
precioUnitario decimal NOT NULL,
categoria int NOT NULL
);

CREATE TABLE Categoria_Producto(
codigo SERIAL PRIMARY KEY NOT NULL,
nombre VARCHAR(45) NOT NULL
);

ALTER TABLE producto
   ADD CONSTRAINT fk_categoria
   FOREIGN KEY (categoria)
REFERENCES Categoria_Producto(codigo);

