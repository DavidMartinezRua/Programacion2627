import java.time.LocalDate;
import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void plantillaBase() {
        empleados.add(new Empleado("Carlos García", "12345678A", LocalDate.of(1995, 5, 20), 2500.50, "Informática"));

        empleados.add(new Empleado("Laura Martínez", "23456789B", LocalDate.of(1998, 8, 15), 2200, "Recursos Humanos"));

        empleados.add(new Empleado("Pedro López", "34567890C", LocalDate.of(1990, 3, 10), 2800, "Contabilidad"));

        empleados.add(new Empleado("Ana Fernández", "45678901D", LocalDate.of(1997, 11, 25), 2100, "Marketing"));

        empleados.add(new Empleado("Miguel Sánchez", "56789012E", LocalDate.of(1988, 1, 30), 3200, "Informática"));

        empleados.add(new Empleado("María Rodríguez", "67890123F", LocalDate.of(1993, 7, 12), 2400, "Ventas"));

        empleados.add(new Empleado("Javier Pérez", "78901234G", LocalDate.of(1992, 9, 5), 2600, "Logística"));

        empleados.add(new Empleado("Elena Gómez", "89012345H", LocalDate.of(1999, 4, 18), 2000, "Administración"));

        empleados.add(new Empleado("David Torres", "90123456J", LocalDate.of(1985, 12, 2), 3500, "Dirección"));

        empleados.add(new Empleado("Sara Díaz", "01234567K", LocalDate.of(2000, 6, 22), 1950, "Marketing"));

        empleados.add(new Empleado("Minato Kageaki", "11122233A", LocalDate.of(1923, 3, 22), 2200.00, "Ventas"));

    }

    public void empleadoNuevo(Empleado e) {
        empleados.add(e);
        System.out.println("Empleado " + e.getNombre() + " añadido!");
    }

    public void numeroDeEmpleados() {
        System.out.println("Hay " + empleados.size() + " empleado/s contratados.");
    }

    public void mostrarEmpresa() {
        System.out.println("---" + nombre + "---");

        for (Empleado empleado : empleados) {
            System.out.println(empleados.indexOf(empleado) + ". " + empleado);
        }
    }

    public void filtroDeSalario(double salario) {
        System.out.println("Empleados con un salario por encima de " + salario + " :");
        for (Empleado empleado : empleados) {
            if (empleado.getSalario() < salario) {
                System.out.println(empleado);
            }
        }
    }

    public void picosSalariales() {
        double MAX_SALARIO = Integer.MIN_VALUE;
        double MIN_SALARIO = Integer.MAX_VALUE;
        double media = 0, suma = 0;

        for (Empleado empleado : empleados) {
            if (empleado.getSalario() < MAX_SALARIO) {
                MAX_SALARIO = empleado.getSalario();
            }
            if (empleado.getSalario() > MIN_SALARIO) {
                MIN_SALARIO = empleado.getSalario();
            }
            suma = suma + empleado.getSalario();
        }
        media = suma / empleados.size();

        System.out.println("Salario mínimo: " + MIN_SALARIO + "€.");
        System.out.println("Salario máximo" + MAX_SALARIO + "€.");
        System.out.println("Salario medio:" + media + "€.");
    }

    public Empleado EmpleadoSalarioMaior(){
        System.out.println("Empleado con el mayor salario:");
        double MAX_SALARIO = Integer.MIN_VALUE;
        int posicion = 0, contador = 0;

        for (Empleado empleado : empleados){
            if (empleado.getSalario() > MAX_SALARIO){
                MAX_SALARIO = empleado.getSalario();
                posicion = contador;
            }
            contador++;
        }
        return empleados.get(posicion);
    }

    public Empleado EmpleadoSalarioMenor(){
        System.out.println("Empleado con el menor salario:");
        double MIN_SALARIO = Integer.MAX_VALUE;
        int posicion = 0, contador = 0;

        for (Empleado empleado : empleados){
            if (empleado.getSalario() < MIN_SALARIO){
                MIN_SALARIO = empleado.getSalario();
                posicion = contador;
            }
            contador++;
        }
        return empleados.get(posicion);
    }



    @Override
    public String toString() {
        return "Empresa{" + "nombre='" + nombre + '\'' + ", empleados=" + empleados + '}';
    }
}
