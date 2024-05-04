public class Cuenta {

        private double saldo;
        private double deposito;
        private double retiro;
        private String numeroCuenta;

        public double getSaldo() {
                return saldo;
        }

        public void setSaldo(double saldo) {
                this.saldo = saldo;
        }

        public double getDeposito() {
                return deposito;
        }

        public void setDeposito(double deposito) {
                this.deposito = deposito;
        }

        public double getRetiro() {
                return retiro;
        }

        public void setRetiro(double retiro) {
                this.retiro = retiro;
        }

        public String getNumeroCuenta() {
                return numeroCuenta;
        }

        public void setNumeroCuenta(String numeroCuenta) {
                this.numeroCuenta = numeroCuenta;
        }
        public Cuenta(double saldo, double deposito, double retiro, String numeroCuenta) {
                this.saldo = saldo;
                this.deposito = deposito;
                this.retiro = retiro;
                this.numeroCuenta = numeroCuenta;
        }


}


/*almacenar las transacciones realizadas por el cliente */