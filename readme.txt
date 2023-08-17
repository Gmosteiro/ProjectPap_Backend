-- Crear tabla para Socio 
CREATE TABLE IF NOT EXISTS socio (
    nickname varchar(255) NOT NULL,
    nombre varchar(255) NOT NULL,
    apellido varchar(255) NOT NULL,
    email varchar(255) NOT NULL,
    fechaNac date NOT NULL
);

-- Crear tabla para Registro
CREATE TABLE IF NOT EXISTS registro (
    fecha_registro date NOT NULL,
    -- Agregar otras columnas necesarias para Registro
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


CREATE TABLE IF NOT EXISTS public.actividaddeportiva (
    nombre varchar(255) NOT NULL,
    descripcion varchar(255) NULL,
    duracion integer NULL,
    costo float NULL,
    fechareg date NULL,
    CONSTRAINT actividaddeportiva_pkey PRIMARY KEY (nombre)
);

CREATE TABLE IF NOT EXISTS public.instituciondeportiva (
    nombre varchar(255) NOT NULL,
    descripcion varchar(255) NULL,
    url varchar(255) NULL,
    CONSTRAINT instituciondeportiva_pkey PRIMARY KEY (nombre)
);
