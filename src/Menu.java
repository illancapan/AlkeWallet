import java.util.Scanner;

public class Menu {
    //Declaro global scanner
    Scanner scanner = new Scanner(System.in);

    //Llamo a conversor
    Conversor conversor = new Conversor();
    Banco banco = new Banco();

    public void dibujaMenu() {
        String menu = """
                ************************************************
                ** 1- Deposito                                **
                ** 2- Retiro                                  **
                ** 3- Saldo                                   **
                ** 4- Clientes                                **
                ** 5- Conversor de monedas                    **
                ** 6- Salir                                   **
                ************************************************""";
        System.out.println(menu);
    }
    public void dibujaMenuConversor() {

        String menuConversor = """
                ************************************************
                ** 1- Peso Chileno a Dolar                    **
                ** 2- Peso Chileno a Euro                     **
                ** 3- Salir                                   **
                ************************************************""";
        System.out.println(menuConversor);

        //System.out.printf("Hola");
        //System.out.printf("Hola");
        //System.out.printf("Hola");
        //System.out.printf("Hola");
    }
    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            dibujaMenu();
            System.out.print("Seleccione una opción: ");
            //Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Opción seleccionada: Deposito");
                    banco.Deposito();
                    break;
                case 2:
                    System.out.println("Opción seleccionada: Retiro");
                    banco.retiro();
                    break;
                case 3:
                    System.out.println("Opción seleccionada: Saldo");
                    banco.mostrarSaldo();
                    break;
                case 4:
                    System.out.println("Opción seleccionada: Clientes");
                    //InformacionCliente.mostrarInformacionCliente();
                    InformacionCliente.mostrarInformacionCliente(banco.cuenta);
                break;
                case 5:
                    System.out.println("Opción seleccionada: Conversor de monedas");
                    dibujaMenuConversor();
                    iniciarMenuConversor();
                    break;
                case 6:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
    public void iniciarMenuConversor() {
        boolean salir = false;

        while (!salir) {
            dibujaMenuConversor();
            System.out.print("Seleccione una opción: ");
            //Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Opción seleccionada: Peso a Dolar");
                    conversor.convertirDolar();
                    break;
                case 2:
                    System.out.println("Opción seleccionada: Peso a Euro");
                    conversor.convertirEuro();
                    break;
                case 3:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

}



/*Desarrollar menu para el banco y sus transsacciones*/
