CREATE TABLE producto (
codigo SERIAL PRIMARY KEY NOT NULL,
nombre VARCHAR(45) NOT NULL,
cantidadExistencia decimal NOT NULL,
precioUnitario decimal NOT NULL
);

CREATE TABLE Categoria_Producto(
codigo SERIAL PRIMARY KEY NOT NULL,
nombre VARCHAR(45) NOT NULL
);