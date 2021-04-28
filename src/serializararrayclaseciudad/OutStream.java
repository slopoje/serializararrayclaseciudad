package serializararrayclaseciudad;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Clase que escribe en un fichero un array de objetos de clase Ciudad
 * serializados.
 *
 * @author Sebastián López
 */
public class OutStream {

    public static void main(String[] args) {

        Ciudad[] ciudades = new Ciudad[3];

        System.out.println("Creando fichero, abriendo flujo, escribiendo array, cerrando fichero...");
        try ( FileOutputStream fos = new FileOutputStream("ciudades.dat");  ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            ciudades[0] = new Ciudad("Aguadulce", 29092);
            ciudades[1] = new Ciudad("Almería", 201322);
            ciudades[2] = new Ciudad("Vícar", 26899);

            oos.writeObject(ciudades);
            System.out.println("OK");

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Fichero no encontrado.");
        } catch (IOException e) {
            System.out.println("ERROR: No se puede acceder al fichero.");
        }

    }

}
