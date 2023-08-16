-- Crear tabla para Socio 
CREATE TABLE IF NOT EXISTS socio (
    id serial PRIMARY KEY,
    nickname varchar(255) NOT NULL,
    nombre varchar(255) NOT NULL,
    apellido varchar(255) NOT NULL,
    email varchar(255) NOT NULL,
    fecha_nac date NOT NULL
);

-- Crear tabla para Registro
CREATE TABLE IF NOT EXISTS registro (
    id serial PRIMARY KEY,
    fecha_registro date NOT NULL,
    -- Agregar otras columnas necesarias para Registro
    socio_id integer REFERENCES socio(id) ON DELETE CASCADE
);

--Crear tabla para Profesor
CREATE TABLE IF NOT EXISTS  public.profesor (
    nickname varchar(255) NOT NULL,
    institucion varchar(255) NULL,
    descripcion varchar(255) NULL,
    biografia varchar(255) NULL,
    sitioweb varchar(255) NULL,
    nombre varchar(255) NULL,
    apellido varchar(255) NULL,
    email varchar(255) NULL,
    fechanac date NULL,
    CONSTRAINT profesor_pkey PRIMARY KEY (nickname)
);