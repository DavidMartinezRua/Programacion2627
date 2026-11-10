import java.time.LocalDate;

public class Empresa {
    private String nombre;
    private Empleado[] empleados;
    private final int MAX_EMPLEADOS = 100;
    private int numeroEmpleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new Empleado[MAX_EMPLEADOS];
        this.numeroEmpleados = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void plantillaBase() {
        Empleado e1 = new Empleado("Carlos García", "12345678A", LocalDate.of(1995, 5, 20), 101, 2500.50, "Informática");

        Empleado e2 = new Empleado("Laura Martínez", "23456789B", LocalDate.of(1998, 8, 15), 102, 2200, "Recursos Humanos");

        Empleado e3 = new Empleado("Pedro López", "34567890C", LocalDate.of(1990, 3, 10), 103, 2800, "Contabilidad");

        Empleado e4 = new Empleado("Ana Fernández", "45678901D", LocalDate.of(1997, 11, 25), 104, 2100, "Marketing");

        Empleado e5 = new Empleado("Miguel Sánchez", "56789012E", LocalDate.of(1988, 1, 30), 105, 3200, "Informática");

        Empleado e6 = new Empleado("María Rodríguez", "67890123F", LocalDate.of(1993, 7, 12), 106, 2400, "Ventas");

        Empleado e7 = new Empleado("Javier Pérez", "78901234G", LocalDate.of(1992, 9, 5), 107, 2600, "Logística");

        Empleado e8 = new Empleado("Elena Gómez", "89012345H", LocalDate.of(1999, 4, 18), 108, 2000, "Administración");

        Empleado e9 = new Empleado("David Torres", "90123456J", LocalDate.of(1985, 12, 2), 109, 3500, "Dirección");

        Empleado e10 = new Empleado("Sara Díaz", "01234567K", LocalDate.of(2000, 6, 22), 110, 1950, "Marketing");

        Empleado e11 = new Empleado("Minato Kageaki", "11122233A", LocalDate.of(1923, 3, 22), 1, 2200.00, "Ventas");

        Empleado[] grupo = {e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11};
        for (int i = 0; i < grupo.length; i++) {
            if (empleados.length >= numeroEmpleados) {
                empleados[numeroEmpleados] = grupo[i];
                numeroEmpleados++;
                System.out.println("Empleado añadido");
            } else {
                System.out.println("Plantilla llena.");
            }
        }
    }

    public void nuevoEmpleado(Empleado e) {
        if (empleados.length >= numeroEmpleados) {
            empleados[numeroEmpleados] = e;
            numeroEmpleados++;
            System.out.println("Empleado añadido");
        } else {
            System.out.println("Plantilla llena.");
        }
    }

    public void mostrarNumeroDeEmpleados() {
        System.out.println("Hay " + numeroEmpleados + " empleados trabajando en " + getNombre() + ".");
    }

    public void mostrarEmpresa(){
        System.out.println("\t---" + getNombre() + "---");
        for (int i = 0; i < numeroEmpleados; i++) {
            if (empleados[i].getNombre() != null){
                System.out.println(empleados[i]);
            }
        }
    }

    public void filtrarSueldo(double filtro){
        System.out.println("---Empleados con sueldo superior a " + filtro + "---");
        for (int i = 0; i < numeroEmpleados; i++) {
            if (empleados[i].getSalario() > filtro){
                System.out.println(empleados[i]);
            }
        }
    }

    public Empleado maxSueldo(){
        double maximo = Integer.MIN_VALUE;
        int j = 0;

        System.out.println("---Empleado mais pagado---");

        if (numeroEmpleados > 0){
            for (int i = 0; i < numeroEmpleados; i++) {
                if (empleados[i].getSalario() > maximo){
                    maximo = empleados[i].getSalario();
                }
            }

            while (empleados[j].getSalario() != maximo){
                j++;
            }

            return empleados[j];
        }else {
            System.out.println("Non hay empleados na empresa");
            return null;
        }
    }

    public Empleado minSueldo(){
        double minimo = Integer.MAX_VALUE;
        int j = 0;

        System.out.println("---Empleado menos pagado---");

        if (numeroEmpleados > 0){
            for (int i = 0; i < numeroEmpleados; i++) {
                if (empleados[i].getSalario() < minimo){
                    minimo = empleados[i].getSalario();
                }
            }

            while (empleados[j].getSalario() != minimo){
                j++;
            }

            return empleados[j];
        }else {
            System.out.println("Non hay empleados na empresa");
            return null;
        }
    }

    public void  subidaDeSueldoXeral(int porcentaxe){

        System.out.println("--Subida de sueldo---");

        if (numeroEmpleados > 0){
            for (int i = 0; i < numeroEmpleados; i++){
                empleados[i].setSalario((empleados[i].getSalario()) + (empleados[i].getSalario() * porcentaxe / 100));
            }
        }else{
            System.out.println("Non hay empleados na empresa");
        }
    }

    public void subidaDeSueldoDepartamento(int porcentaxe, String departamento){

        System.out.println("--Subida de sueldo---");

        if (numeroEmpleados > 0){
            for (int i = 0; i < numeroEmpleados; i++){
                if (empleados[i].getDepartamento().equalsIgnoreCase(departamento)){
                        empleados[i].setSalario((empleados[i].getSalario()) + (empleados[i].getSalario() * porcentaxe / 100));
                }
            }
        }else{
            System.out.println("Non hay empleados na empresa");
        }
    }

    public void mostrarDepartamento(String departamento){
        System.out.println("---Mostrar departamento---");

        if (numeroEmpleados > 0){
            for (int i = 0; i < numeroEmpleados; i++){
                if (empleados[i].getDepartamento().equalsIgnoreCase(departamento)){
                    System.out.println(empleados[i]);
                }
            }
        }else{
            System.out.println("Non hay empleados na empresa");
        }
    }

    public Empleado busquedaPorDni(String dni){
        System.out.println("---Mostrar empleado---");

        if (numeroEmpleados > 0){
            for (int i = 0; i < numeroEmpleados; i++) {
                if (empleados[i].getDni().equalsIgnoreCase(dni)){
                    return empleados[i];
                }
            }
            return null;
        } else {
            System.out.println("Non hay empleados na empresa.");
            return null;
        }
    }

    public boolean borrarEmpleado(String dni){
        System.out.println("---Borrar empleado---");

        if (numeroEmpleados > 0){
            for (int i = 0; i < numeroEmpleados; i++) {
                if (empleados[i].getDni().equalsIgnoreCase(dni)){
                    empleados[i] = null;
                    return true;
                }
            }
            return false;
        } else {
            System.out.println("Non hay empleados na empresa.");
            return false;
        }
    }
}
