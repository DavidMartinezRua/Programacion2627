import java.util.Scanner;

public class MenuEmpresa {


    private Scanner scanner;
    private Empresa n1;

    public MenuEmpresa() {
        scanner = new Scanner(System.in);
        n1 = new Empresa("Nitro+");
    }

    public void menu(){
        int opcion = 0;
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
            switch (opcion){
                case 1 : {n1.plantillaBase();}
                case 2 : {}
                case 3 : {}
                case 4 : {}
                case 5 : {}
                case 6 : {}
                case 7 : {}
                case 8 : {}
                case 9 : {}
                case 10: {}
                case 11: {}
                case 12: {}
                case 13: {}
                case 0 : {}
                default: {}
            }
        }while (opcion != 0);

    }
}
