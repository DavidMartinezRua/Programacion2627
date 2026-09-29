import java.util.Scanner;

public class Matrices7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroEmpleados, contadorH = 0, contadorM = 0, sumaH = 0, sumaM = 0, mediaH = 0, mediaM = 0;


        System.out.println("Cunatos empleados hay?");
        numeroEmpleados = scanner.nextInt();

        int[] empleados = new int[numeroEmpleados];
        int[][] datos = new int[numeroEmpleados][2];

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                if (j == 0) {
                    do {
                        System.out.println("Indica el sexo (Hombre/0 - Mujer/1): ");
                        datos[i][j] = scanner.nextInt();
                    } while (datos[i][j] < 0 || datos[i][j] > 1);
                }
                if (j == 1) {
                    System.out.println("Introduce el sueldo del empleado nº " + (i + 1) + ":");
                    datos[i][j] = scanner.nextInt();

                }
            }
        }
        for (int i = 0; i < datos.length; i++) {
            System.out.print("Datos del empleado nº " + (i + 1) + ":\t");
            for (int j = 0; j < datos[i].length; j++) {
                if (j == 0) {
                    System.out.print("Sexo :");
                    if (datos[i][j] == 0) {
                        System.out.print("\tHombre\t");
                        sumaH = sumaH + datos[i][j + 1];
                        contadorH++;
                    }
                    if (datos[i][j] == 1) {
                        System.out.print("\tMujer\t");
                        sumaM = sumaM + datos[i][j + 1];
                        contadorM++;
                    }
                }
                if (j == 1) {
                    System.out.print("Suledo :");
                    System.out.print("\t" + datos[i][j] + "\t");
                }
            }
            System.out.println();
        }
        mediaH = sumaH / contadorH;
        mediaM = sumaM / contadorH;

        System.out.println("Sueldo medio Hombres= " + mediaH);
        System.out.println("Sueldo medio Mujeres= " + mediaM);
    }
}
