package serializararrayclaseciudad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Clase que lee de un fichero un array de objetos de clase Ciudad
 * serializados y lo imprime en pantalla.
 *
 * @author Sebastián López
 */
public class InputStream {

    public static void main(String[] args) {
        Ciudad[] ciudades;

        System.out.println("Abriendo fichero, abriendo flujo, leyendo objetos...");
        try ( FileInputStream fis = new FileInputStream("ciudades.dat");  ObjectInputStream ois = new ObjectInputStream(fis)) {

            ciudades = (Ciudad[]) ois.readObject();

            for (int i = 0; i < ciudades.length; ++i) {
                System.out.println(ciudades[i]);
            }
            System.out.println("OK");

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Fichero no encontrado.");
        } catch (IOException e) {
            System.out.println("ERROR: No se puede acceder al fichero.");
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: No se encuentra la clase.");

        }
    }
}
