import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese dos numeros");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        // "Molde" o "Cast"
        // (float)variable
        // Cambia el tipo de datos del valor extraido de la variable
        // No cambia a la variable


        System.out.println("Para los números " + numero1 + " y " + numero2);
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);

        // Estas dos líneas no las vamos a ejecutar siempre
        // Solamente si el numero2 es distinto de 0.
        if (numero2 != 0) {
            float division = (float) numero1 / numero2;
            System.out.println("La division es: " + division);
        } else {
            System.out.println("No puedo dividir por cero!!");
        }

    }
}