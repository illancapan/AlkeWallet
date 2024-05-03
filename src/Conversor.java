import java.util.Scanner;

public class Conversor {

    public static void convertir(){


        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de pesos a convertir: ");
        double cantidadPesos = leer.nextDouble();

        double valorDolar;
        double dolar = 947.65;
        double euro = 982.5;

        valorDolar = cantidadPesos * dolar;
        System.out.println("El valor del dolar es: "+ valorDolar);
    }


}


/*Convierte tipo de cambios CLP a EURO, DOLAR*/