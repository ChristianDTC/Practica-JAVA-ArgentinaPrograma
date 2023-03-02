import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas en X e Y respectivamente");
        int x = teclado.nextInt();
        int y = teclado.nextInt();

        System.out.println();
        System.out.println("PRIMERA SOLUCION");
        if (x == 0 && y == 0){
            System.out.println("El punto esta en Origen");
        } else if (x == 0 ) {
            System.out.println("El punto esta en el eje X");
        } else if (y == 0) {
            System.out.println("El punto esta en el eje Y");
        } else if (x > 0 && y > 0) {
            System.out.println("El punto esta en el cuadrante I");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto esta en el cuadrante II");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto esta en el cuadrante III");
        } else {
            System.out.println("El punto esta en el cuadrante IV");
        }

        //*************************************************************************
        System.out.println();
        System.out.println("SEGUNDA SOLUCION");
        String punto;
        if (x == 0 && y == 0){
            punto = "Origen";
        } else if (x == 0 || y == 0 ) {
            if (x == 0){
                punto = "eje X";
            }else{
               punto = "eje Y";
            }
        } else if (x > 0) {
            if (y > 0){
                punto = "cuadrante I";
            }else{
                punto = "cuadrante IV";
            }
        } else {
            if (y < 0){
                punto = "cuadrante III";
            }else{
                punto = "cuadrante II";
            }
        }

        System.out.println("El punto esta en el " + punto);

        //**************************************************************************
        System.out.println();
        System.out.println("TERCERA SOLUCION");
        String lugar;
        if (x == 0 && y == 0){
            lugar = "Origen";
        }else if (x == 0 || y == 0){
            lugar = (x == 0)? "eje X" : "eje Y";
        } else if (x > 0) {
            lugar = (y > 0)? "cuadrante I" : "cuadrante IV";
        } else {
            lugar = (y > 0)? "cuadrante II" : "cuadrante III";
        }

        System.out.println("El punto esta en el: " + lugar);
    }
}