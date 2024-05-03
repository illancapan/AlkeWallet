import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private String rut;
    private String password;
    private double saldo;
    List<Cuenta> cuentas;

    public Cliente(String nombre,
                   String apellido,
                   String rut,
                   String password,
                   double saldo,
                   List<Cuenta> cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.password = password;
        this.saldo = saldo;
        this.cuentas = cuentas;
    }




}


/*Crear una persona que puede realizar,
 depositos,
 retiros,
 transferencias

 */