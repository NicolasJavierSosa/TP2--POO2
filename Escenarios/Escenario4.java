//Escenario 4: Método que lanza múltiples excepciones
//Descripción: Tienes un método que abre un archivo y lo lee, pero puede lanzar excepciones si el archivo no existe o si hay un error de entrada/salida.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Clase que demuestra la lectura de un archivo y manejo de excepciones.
 * @author Grupo I
 */
public class Escenario4 {

    /**
     * Lee el contenido de un archivo y lo imprime en la consola.
     *
     * @param filePath la ruta del archivo a leer
     * @throws FileNotFoundException si el archivo no existe
     * @throws IOException si ocurre un error de entrada/salida
     */
    public void readFile(String filePath) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }

    /**
     * Método principal para ejecutar el lector de archivos.
     *
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Escenario4 fileReader = new Escenario4();
        String filePath = "ruta/del/archivo.txt"; 

        try {
            fileReader.readFile(filePath);
        } catch (FileNotFoundException e) {
            System.err.println("El archivo no fue encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}
