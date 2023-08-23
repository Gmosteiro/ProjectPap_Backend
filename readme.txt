-- Crear tabla para Socio
CREATE TABLE IF NOT EXISTS socio (
    nickname varchar(255) NOT NULL,
    nombre varchar(255) NOT NULL,
    apellido varchar(255) NOT NULL,
    email varchar(255) NOT NULL UNIQUE, -- Agregamos UNIQUE aquí
    fechaNac date NOT NULL,
    CONSTRAINT socio_pkey PRIMARY KEY (nickname)
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



Ignore this

public class RowSelectionListener implements ListSelectionListener {

                @Override
                public void valueChanged(ListSelectionEvent event) {

                        int viewRow = jTable2.getSelectedRow();

                        if (!event.getValueIsAdjusting() && viewRow != -1) {

                                // Better to access table row using modelRow rather than viewRow
                                int modelRow = jTable2.convertRowIndexToModel(viewRow);

                                // Access value at selected row at the second column (columnIndex = 1)
                                Object modelvalue = jTable2.getModel().getValueAt(modelRow, 0);

                                // Print cell value
                                System.out.println(modelvalue);

                                String nickname = (String) modelvalue;

                                Usuario selectedUser = ManejadorUsuarios.getUser(nickname);

                                if (selectedUser instanceof Profesor) {
                                        // Si selectedUser es una instancia de Profesor
                                        Profesor profesor = (Profesor) selectedUser; // Puedes hacer un casting a
                                                                                     // Profesor
                                        // Realiza acciones específicas para un profesor
                                        System.out.println("El usuario seleccionado es un Profesor.");
                                        System.out.println("Institución: " + profesor.getInstitucion());
                                } else if (selectedUser instanceof Socio) {
                                        // Si selectedUser es una instancia de Socio
                                        Socio socio = (Socio) selectedUser; // Puedes hacer un casting a Socio
                                        // Realiza acciones específicas para un socio
                                        System.out.println("El usuario seleccionado es un Socio.");
                                        // Acciones adicionales para Socio si es necesario
                                }

                                // nickname, email,nombre, apellido, fechaNac

                        }
                }
        }
