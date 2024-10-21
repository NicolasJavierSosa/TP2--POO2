//Escenario 1: Método que lanza una excepción
//Descripción: Tienes un método que divide dos números, pero puede lanzar una excepción si el divisor es cero.
import java.util.Scanner;

/**
 * Clase que representa la división entre dos numeros
 */
public class Escenario1 {

    /**
     * Calcula el cociente de dos números.
     *
     * @param num1 Primer número.
     * @param num2 Segundo número.
     * @throws ArithmeticException Excepción lanzada si el divisor es cero.
     */
    public void Cosiente(int num1, int num2) {
        if (num2 != 0) {
            System.out.println("La división es: " + num1 / num2);
        } else {
            throw new ArithmeticException("Error: No se puede dividir entre 0");
        }

    }
    /**
     * Método principal de la aplicación.
     *
     * @param args Argumentos de la línea de comandos.
     * @throws Exception Excepción que puede ser lanzada durante la ejecución del programa.
     */
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el numero a dividir");
        num1 = leer.nextInt();
        System.out.println("Ingrese el dividendo");
        num2 = leer.nextInt();
        Escenario1 app = new Escenario1();

        // Llama al método Cosiente del objeto app
        app.Cosiente(num1, num2);
    }
}