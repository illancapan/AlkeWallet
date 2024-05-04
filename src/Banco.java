import java.util.Scanner;

public class Banco {
    Scanner leer = new Scanner(System.in);

    Cuenta cuenta = new Cuenta(
            100.000000,
            0.0,
            0.0,
            "0123456789");
   /* Cliente cliente = new Cliente(
            "Juan",
            "Perez",
            "12345678-9",
            "juan@email.com",
            "pw123",
            100.000);
    */
    public void retiro() {
        System.out.println("Retirar efectivo");
        double montoRetirar = leer.nextDouble();;
        InformacionCliente.mostrarInformacionCliente(cuenta);
        if (montoRetirar <= cuenta.getSaldo()) {
            double nuevoSaldo = cuenta.getSaldo() - montoRetirar;
            cuenta.setSaldo(nuevoSaldo);
            System.out.println("Gracias por retirar");
            System.out.println("Su saldo es: "+cuenta.getSaldo());
        }else {
            System.out.println("no se puede retirar tanta cantidad");
        }


    }
    public void Deposito() {
        System.out.println("Deposito efectivo");
        double montoDepositar = leer.nextDouble();;
        InformacionCliente.mostrarInformacionCliente(cuenta);
        if (montoDepositar >= 0) {
            double nuevoSaldo = cuenta.getSaldo() + montoDepositar;
            cuenta.setSaldo(nuevoSaldo);
            System.out.println("Gracias por Depositar");
            System.out.println("Su saldo es: "+cuenta.getSaldo());
        }else {
            System.out.println("no se puede depositar una cantidad inferior");
        }


    }
    public void mostrarSaldo() {
        System.out.println("Su saldo es: " + cuenta.getSaldo());
    }
}


/*crear un banco para contener todas las operaciones*/