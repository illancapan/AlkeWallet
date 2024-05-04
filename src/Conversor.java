import java.util.Scanner;

public class Conversor {
    Scanner leer = new Scanner(System.in);


    public  void convertirDolar(){
        //Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de pesos a convertir en Dolares: ");
        double cantidadPesos = leer.nextDouble();

        double valorDolar;
        double dolar = 947.65;

        valorDolar = cantidadPesos * dolar;
        System.out.println("El valor del Dolar es: "+ valorDolar);
    }
    public  void convertirEuro(){
        //Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de pesos a convertir en Euros: ");
        double cantidadPesos = leer.nextDouble();

        double valorEuro;
        double euro = 982.5;

        valorEuro = cantidadPesos * euro;
        System.out.println("El valor del Euro es: "+ valorEuro);
    }


}


/*Convierte tipo de cambios CLP a EURO, DOLAR*/