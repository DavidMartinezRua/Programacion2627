import java.util.Scanner;

public class Matrices6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] alumnos = {"Alumno1", "Alumno2", "Alumno3", "Alumno4"};
        String[] asignaturas = {"LIMA", "Programación", "BD", "Sistemas", "IPE"};
        int[][] notas = new int[alumnos.length][asignaturas.length];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Introduce la nota de "+alumnos[i]+ " en "+asignaturas[j]);
                notas[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.print(alumnos[i]+"|");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("\t\t"+notas[i][j]+"\t\t");
            }
            System.out.println();
        }
        System.out.print("\t");
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.print("\t\t"+asignaturas[i]+"\t");
        }
    }
}
