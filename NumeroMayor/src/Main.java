import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese 2 números enteros:");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();


        if (numero1 == numero2){
            System.out.println("Los números son iguales: " + numero1);
        } else {
            int numeroMayor = (numero1 > numero2)? numero1 : numero2;
            System.out.println("El número mayor es: " + numeroMayor);
        }


       /*
       if (numero1 > numero2) {
                numeroMayor = numero1;
            } else {
                numeroMayor = numero2;
            }
        if (numero1 > numero2){
            System.out.println("El número mayor es: " + numero1);
        } else {
            System.out.println("El número mayor es: " + numero2);
        */

    }
}