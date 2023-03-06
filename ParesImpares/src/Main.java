import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número entero");
        System.out.println("Para finalizar ingrese el número 0");
        int numeroIngresado = teclado.nextInt();

        int cantidadNumerosPares = 0;
        int cantidadNumerosImpares = 0;

        while (numeroIngresado != 0){

            if (numeroIngresado % 2 == 0){
                cantidadNumerosPares ++;
            } else {
                cantidadNumerosImpares++;
            }

            System.out.println();
            System.out.println("Ingrese un número entero");
            System.out.println("Para finalizar ingrese el número 0");
            numeroIngresado = teclado.nextInt();

        }

        System.out.println();
        System.out.println("La cantidad de número pares ingresados es: "+
                cantidadNumerosPares);
        System.out.println("La cantidad de número impares ingresados es: "+
                cantidadNumerosImpares);

    }
}