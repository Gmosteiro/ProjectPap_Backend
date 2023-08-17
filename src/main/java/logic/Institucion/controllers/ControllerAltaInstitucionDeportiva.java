package logic.Institucion.controllers;

import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;

public class ControllerAltaInstitucionDeportiva implements IControllerAltaInstitucionDeportiva {

    /*
     * Actores: Administrador del sistema
     * 
     * El caso de uso comienza cuando el administrador desea dar de alta una
     * institución.
     * Para ello, indica el nombre de la institución (único), una descripción y
     * una URL.
     * Si ya existe una institución con igual nombre, el administrador puede
     * reingresar
     * los datos o cancelar el caso de uso. Finalmente, el sistema da de alta la
     * institución deportiva
     */

    @Override
    public void addInstitucionDeportiva(String nombre, String descripcion, String url) {
        try {

            if (validateInstData(nombre)) {

            }

            InstitucionDeportiva nuevaInstitucion = new InstitucionDeportiva(nombre, descripcion, url);

            ManejadorInstitucion manejador = new ManejadorInstitucion();

            manejador.agregarInstitucion(nuevaInstitucion);

            System.out.println("Institucion Creada");

        } catch (Exception errorException) {
            System.out.println("AddInstitucionDeportiva catch: " + errorException);

        }

    }

    private boolean validateInstData(String nombre) {

        return true;
    }

}
