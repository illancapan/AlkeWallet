public class InformacionCliente {

    public static void mostrarInformacionCliente(Cuenta cuenta) {
      /*  Cuenta cuenta = new Cuenta(
                100.000000,
                0.0,
                0.0,
                "0123456789");*/
        Cliente cliente = new Cliente(
                "Juan",
                "Perez",
                "12345678-9",
                "juan@email.com",
                "pw123",
                100.000
        );
        //mostrar informacion del cliente
        System.out.println("Informacion del cliente");
        System.out.println("Nombre: "+cliente.getNombre().concat(" "+cliente.getApellido()));
        System.out.println("Rut: "+cliente.getRut());
        System.out.println("Correo Electronico: "+cliente.getEmail());
        System.out.println("Saldo: "+cuenta.getSaldo());
        System.out.println("Numero Cuenta: "+cuenta.getNumeroCuenta());
    }

}
