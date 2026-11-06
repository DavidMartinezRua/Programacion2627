import java.time.LocalDate;

public class Empleado extends Persona{
    private int numeroEmpleado;
    private double salario;
    private String departamento;

    public Empleado(String nombre, String dni, LocalDate fechaDeNacemento, int numeroEmpleado, double salario, String departamento) {
        super(nombre, dni, fechaDeNacemento);
        this.numeroEmpleado = numeroEmpleado;
        this.salario = salario;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +  "numeroEmpleado=" + numeroEmpleado +  ", salario=" + salario +  ", departamento='" + departamento + '\'' +  '}';
    }
}
