import java.time.LocalDate;

public class TestEmpresa {
    public static void main(String[] args) {
        Empresa nitro = new Empresa("Nitro+");
        Empleado e1 = new Empleado("Messi","12233445L", LocalDate.of(1999,11,11),1,3000,"Futbol");

        nitro.plantillaBase();

        nitro.mostrarEmpresa();

        nitro.mostrarNumeroDeEmpleados();

        nitro.nuevoEmpleado(e1);

        nitro.filtrarSueldo(2600);

        System.out.println(nitro.maxSueldo());

        System.out.println(nitro.minSueldo());

        nitro.subidaDeSueldoXeral(10);

        nitro.mostrarEmpresa();

        nitro.subidaDeSueldoDepartamento(10, "ventas");

        nitro.mostrarEmpresa();

        nitro.mostrarDepartamento("ventas");

        System.out.println(nitro.busquedaPorDni("11122233A"));

        System.out.println(nitro.borrarEmpleado("11122233A"));

        nitro.mostrarEmpresa();



    }
}
