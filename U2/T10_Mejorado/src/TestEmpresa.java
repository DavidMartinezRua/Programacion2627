import java.time.LocalDate;

public class TestEmpresa {
    public static void main(String[] args) {
        Empresa n1 = new Empresa("Nitro+");
        Empleado e1 = new Empleado("Kageaki","11122233A", LocalDate.of(1923,3,22),2200.00,"Ventas");


        n1.plantillaBase();
        n1.numeroDeEmpleados();


        n1.mostrarEmpresa();

    }
}
