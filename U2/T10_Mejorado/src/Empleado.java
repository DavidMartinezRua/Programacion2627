import java.time.LocalDate;

public class Empleado extends Persona{
    private double salario;
    private String departamento;

    public Empleado(String nombre, String dni, LocalDate fechaDeNacemento, double salario, String departamento) {
        super(nombre, dni, fechaDeNacemento);
        this.salario = salario;
        this.departamento = departamento;
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
        return "Empleado{nombre= "+ getNombre() + ", salario=" + salario +  ", departamento='" + departamento + '\'' +  '}';
    }
}
