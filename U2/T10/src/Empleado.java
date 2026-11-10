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

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{nombre= "+ getNombre() +  ", numeroEmpleado=" + numeroEmpleado +  ", salario=" + salario +  ", departamento='" + departamento + '\'' +  '}';
    }
}
