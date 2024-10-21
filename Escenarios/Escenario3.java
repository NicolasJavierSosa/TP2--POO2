// Escenario 3: Método con varios parámetros y retorno
// Descripción: Tienes un método que calcula el índice de masa corporal (IMC) y devuelve un valor basado en el peso y la altura.

import java.util.Scanner;
/**
 * Clase que calcula el IMC de una persona
 */
public class Escenario3 {

    /**
     * método main, es donde se solicita los datos a las personas.
     *
     * @author Nicolas Sosa
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        double altura, peso;
        Scanner leer = new Scanner(System.in);

        /**
         * Se solicita que ingrese la altura en metros de la persona.
         */
        System.out.println("Ingrese su altura en metros");
        altura = leer.nextDouble();
        /**
         * Se solicita que ingrese el peso en kilogramos de la persona.
         */
        System.out.println("Ingrese su peso en kg");
        peso = leer.nextDouble();

        // Crea un objeto de la clase App
        Escenario3 app = new Escenario3();

        // Llama al método Calculo del objeto app, pasando la altura y el peso como parámetros
        app.Calculo(altura, peso);
    }

    /**
     * Método que calcula el índice de masa corporal de una persona, dada la altura y el peso.
     *
     * @param altura La altura de la persona en metros.
     * @param peso   El peso de la persona en kilogramos.
     */
    public void Calculo(double altura, double peso) {
        double imc = peso / Math.pow(altura, 2);

        if (imc < 18.5) {
            System.out.println("Su índice de masa corporal indica: Bajo peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Su índice de masa corporal indica: Peso Normal");
        } else {
            System.out.println("Su índice de masa corporal indica: Sobre Peso");
        }
    }
}