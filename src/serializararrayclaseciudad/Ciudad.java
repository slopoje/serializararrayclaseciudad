package serializararrayclaseciudad;

import java.io.Serializable;

/**
 * Clase que modela una ciudad con los atributos:
 * - nombreCiudad
 * - habitantesCiudad
 *
 * @author Sebastián López
 */
public class Ciudad implements Serializable {

    private String nombreCiudad;
    private int habitantesCiudad;
    private static final long serialVersionUID = 1L;

    public Ciudad(String nombreCiudad, int habitantesCiudad) {
        this.nombreCiudad = nombreCiudad;
        this.habitantesCiudad = habitantesCiudad;
    }

    @Override
    public String toString() {
        return this.nombreCiudad + " tiene " + this.habitantesCiudad + " habitantes";

    }
}
