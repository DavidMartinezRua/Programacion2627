import java.util.Scanner;

public class Matrices4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int filas, columnas, cPositivo = 0, cNegativo = 0, cCero = 0;

        do {
            System.out.println("Introduce el número de filas:");
            filas = scanner.nextInt();
        } while (filas < 1);
        do {
            System.out.println("Introduce el número de columnas:");
            columnas = scanner.nextInt();
        } while (columnas < 1);

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.println("Introduce el número en la posición " + i + " - " + j);

                matriz[i][j] = scanner.nextInt();

                if (matriz[i][j] < 0) {
                    cNegativo++;
                }
                if (matriz[i][j] > 0) {
                    cPositivo++;
                }
                if (matriz[i][j] == 0) {
                    cCero++;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("\t" + matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Numeros positivos: " + cPositivo);
        System.out.println("Numeros negativos: " + cNegativo);
        System.out.println("Ceros: " + cCero);


    }
}
