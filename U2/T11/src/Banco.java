public class Banco {
    private String nome;
    private CuentaBancaria[] cuentas;
    private final int MAX_CLIENTES = 20;
    private int numeroClientes;

    public Banco(String nome) {
        this.nome = nome;
        this.cuentas = new CuentaBancaria[MAX_CLIENTES];
        this.numeroClientes = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CuentaBancaria[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(CuentaBancaria[] cuentas) {
        this.cuentas = cuentas;
    }

    public void abrirCuenta(Cliente cliente, double saldo){
        if (cuentas.length >= numeroClientes){
            CuentaBancaria cuentaBancaria = new CuentaBancaria(cliente, saldo);
            cuentaBancaria.setNumeroCuenta(cuentaBancaria.getNumeroCuenta()+numeroClientes+1);

            cuentas[numeroClientes] = cuentaBancaria;
            numeroClientes++;
        } else {
            System.out.println("No hay espacio para mas clientes.");
        }
    }


}
