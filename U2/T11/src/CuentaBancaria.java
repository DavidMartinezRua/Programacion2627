public class CuentaBancaria {
    private Cliente titular;
    private int numeroCuenta;
    private double saldo;

    public CuentaBancaria(Cliente titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresarSaldo(double ingreso) {
        System.out.println("Ingreso de saldo: ");
        setSaldo(getSaldo() + ingreso);
    }

    public boolean retirarSaldo(double retirada){
        System.out.println("Retirar saldo");
        if (getSaldo()-retirada >= 0){
            setSaldo(getSaldo()-retirada);
            System.out.println("Saldo retirado.");
            return true;
        }
        System.out.println("Saldo insuficiente");
        return false;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "titular=" + titular + " | numeroCuenta=" + numeroCuenta + " | saldo=" + saldo + '}';
    }
}
