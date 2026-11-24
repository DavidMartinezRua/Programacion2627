import java.time.LocalDate;
import java.util.Scanner;

public class MenuEmpresa {


    private Scanner scanner;
    private Empresa n1;

    public MenuEmpresa() {
        scanner = new Scanner(System.in);
        n1 = new Empresa("Nitro+");
    }

    public void menu(){
        int opcion, numero;
        double decimal;
        String texto;
        boolean carga = false;

        System.out.println("Bienvenido al menu de empresa!");
        do {
            System.out.println("Elige una opción: ");
            System.out.println("1. Cargar ejemplos");
            System.out.println("2. Añadir empleado.");
            System.out.println("3. Mostrar numero de empleados");
            System.out.println("4. Mostrar datos de la empresa");
            System.out.println("5. Filtrar según un salarío mínimo");
            System.out.println("6. Mostrar los picos salariales de la empresa");
            System.out.println("7. Mostrar salario mas alto");
            System.out.println("8. Mostrar salario mas bajo");
            System.out.println("9. Incremento total de salario por porcentaje");
            System.out.println("10. Incremento de salario a departamento por porcentaje");
            System.out.println("11. Mostar empleados de un departamento");
            System.out.println("12. Buscar empleado mediante DNI");
            System.out.println("13. Eliminar empleado mediante DNI");
            System.out.println("0. Salir");



            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){

                case 1 -> {
                    System.out.println("-Cargar exemplos-");
                    if (!carga){
                        n1.plantillaBase();
                        System.out.println("Exemplos cargados.");
                        carga = true;
                    }else {
                        System.out.println("Os exemplos xa foron cargados.");
                    }
                }
                case 2 -> {
                    String nombre, dni, departamento;
                    double salario;
                    LocalDate fechaDeNacemento;
                    System.out.println("-Añadir empleado-");
                    System.out.println("Escribe o nome do empleado:");
                    nombre = scanner.nextLine();
                    System.out.println("Escribe o dni do empleado:");
                    dni = scanner.nextLine();
                    System.out.println("Escribe o departamento do empleado:");
                    departamento = scanner.nextLine();
                    System.out.println("Escribe a data de nacemento do empleado (yyyy-mm-dd):");
                    texto = scanner.nextLine();
                    fechaDeNacemento = LocalDate.parse(texto);
                    System.out.println("Escribe o salaio do empleado:");
                    salario = scanner.nextDouble();
                    scanner.nextLine();
                    Empleado e = new Empleado(nombre,dni,fechaDeNacemento,salario,departamento);
                    n1.empleadoNuevo(e);
                }
                case 3 -> {
                    System.out.println("-Mostrar numero de empleados-");
                    n1.numeroDeEmpleados();
                }
                case 4 -> {
                    n1.mostrarEmpresa();
                }
                case 5 -> {
                    System.out.println("-Filtrar por salario-");
                    System.out.println("Escribe o salario polo que filtrar:");
                    decimal = scanner.nextDouble();
                    scanner.nextLine();

                    n1.filtroDeSalario(decimal);
                }
                case 6 -> {
                    System.out.println("-Picos salariales-");
                    n1.picosSalariales();
                }
                case 7 -> {
                    System.out.println("-Mostrar salario mais alto-");
                    System.out.println(n1.EmpleadoSalarioMaior());
                }
                case 8 -> {
                    System.out.println("-Mostrar salario mais baixo-");
                    System.out.println(n1.EmpleadoSalarioMenor());
                }
                case 9 -> {
                    System.out.println("-Incremento total-");
                    System.out.println("Escribe o porcentaxe do incremento:");
                    numero = scanner.nextInt();
                    scanner.nextLine();

                    n1.incrementoTotal(numero);
                }
                case 10-> {
                    System.out.println("-Incremento por departamento-");
                    System.out.println("Escribe o departamento que recibirá o incremento:");
                    texto = scanner.nextLine();
                    System.out.println("Escribe o porcentaxe do incremento:");
                    numero = scanner.nextInt();
                    scanner.nextLine();

                    n1.incrementoEnDepartamento(numero, texto);
                }
                case 11-> {
                    System.out.println("-Mostrar departamento-");
                    System.out.println("Escribe o nome do departamento que queres buscar:");
                    texto = scanner.nextLine();
                    n1.mostrarDepartamento(texto);
                }
                case 12-> {
                    System.out.println("-Buscar empleado segúndo DNI-");
                    System.out.println("Escribe o DNI do empleado que queres buscar:");
                    texto = scanner.nextLine();
                    System.out.println(n1.buscarEmpleado(texto));
                }
                case 13-> {
                    System.out.println("-Eliminar empleado segúndo DNI-");
                    System.out.println("Escribe o DNI do empleado que queres buscar:");
                    texto = scanner.nextLine();
                    System.out.println(n1.borrarEmpleado(texto));
                }
                case 0 -> {System.out.println("Chao!");}
                default-> {System.out.println("Esta opción non existe.");}
            }
        }while (opcion != 0);

    }
}
