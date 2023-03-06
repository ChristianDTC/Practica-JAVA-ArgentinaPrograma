import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número entero");
        System.out.println("Si desea finalizar ingrese -1000");
        float numeroIngresado = teclado.nextInt();
        float numeroMayor = numeroIngresado;

        while (numeroIngresado != -1000){

            System.out.println();
            System.out.println("Ingrese un número entero");
            System.out.println("Si desea finalizar ingrese -1000");
            numeroIngresado = teclado.nextInt();
            if (numeroIngresado > numeroMayor){
                numeroMayor = numeroIngresado;
            }

        }

        System.out.println();
        System.out.println("El número mayor de los ingresados es: " + numeroMayor);
    }
}