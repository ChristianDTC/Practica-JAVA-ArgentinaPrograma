import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de días en que "+
                "se tomó la temperatura");
        int cantidadDiasTemperatura = teclado.nextInt();

        float temperaturas, temperaturasTotal, promedioTemperaturas,
                promedioMas20, temperaturaMas20;

        String mas40 = "NO";

        int diasBajo0, cantidadTemperaturaMas20;
        diasBajo0 = cantidadTemperaturaMas20= 0;
        temperaturaMas20 = temperaturasTotal = 0;

        for (int x = 1; x <= cantidadDiasTemperatura; x++){

            System.out.println();
            System.out.println("Ingrese la temperatura del día " + x);
            temperaturas = teclado.nextInt();

            temperaturasTotal += temperaturas;

            if (temperaturas < 0){
                diasBajo0 ++;
            }

            if (temperaturas > 20){
                temperaturaMas20 +=  temperaturas;
                cantidadTemperaturaMas20 ++;
            }

            if (temperaturas > 40){
                mas40 = "SI";
            }
        }

        System.out.println();
        System.out.println("La cantidad de temperaturas ingresadas es de " +
                cantidadDiasTemperatura);
        System.out.println("Hubo " + diasBajo0 + " días con " +
                "temperaturas bajo cero");

        promedioTemperaturas = temperaturasTotal / cantidadDiasTemperatura;
        System.out.println("El promedio de todas las temperaturas " +
               "ingresadas es de " + promedioTemperaturas + "°");

        if (cantidadTemperaturaMas20 > 0){
            promedioMas20 = temperaturaMas20 / cantidadTemperaturaMas20;
            System.out.println("El promedio de temperaturas de los días" +
                    " calidos es de " + promedioMas20 + "°");
        }

        System.out.println("Hubo algún día mayor a 40°? " + mas40);

    }
}