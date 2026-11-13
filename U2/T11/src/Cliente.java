import java.time.LocalDate;

public class Cliente extends Persona {
    private int numeroCliente;

    public Cliente(String nombre, String dni, LocalDate fechaDeNacemento) {
        super(nombre, dni, fechaDeNacemento);
        this.numeroCliente = numeroCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre= " + getNombre() + " | dni= " + getDni() + " | nacimiento= " + getFechaDeNacemento() + '}';
    }
}
