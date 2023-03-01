import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese 3 números enteros:");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        int numero3 = teclado.nextInt();

        System.out.println("PRIMERA OPCION");
        if (numero1 == numero2 & numero1 == numero3){
            System.out.println("Los 3 números son iguales: " + numero1);
        }else{
            int numeroMayor = (numero1 > numero2)? numero1 : numero2;
            numeroMayor = (numeroMayor > numero3)? numeroMayor : numero3;
            System.out.println("El número mayor de " + numero1 + ", " +
                    numero2 + ", " + numero3 + " es: " + numeroMayor);
        }

        System.out.println();
        System.out.println("SEGUNDA OPCION");
        int numeroMaximo = Math.max(numero1, numero2);
        numeroMaximo = Math.max(numeroMaximo, numero3);
        System.out.println("El número mayor de " + numero1 + ", " +
                numero2 + ", " + numero3 + " es: " + numeroMaximo);

    }
}