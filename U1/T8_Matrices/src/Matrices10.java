import java.util.Random;
import java.util.Scanner;

public class Matrices10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[][] restaurante = new int[2][10];
        String[] categoria = {"Mesa nº: ", "Ocupación: "};
        int contador = 0, grupo, MAX_GRUPO, opcion = 0;

        for (int i = 0; i < restaurante.length; i++) {
            for (int j = 0; j < restaurante[i].length; j++) {
                if (i == 0) {
                    contador++;
                    restaurante[i][j] = contador;
                }
                if (i == 1) {
                    restaurante[i][j] = random.nextInt(0, 5);
                }
            }
        }

        for (int i = 0; i < restaurante.length; i++) {
            System.out.print(categoria[i]);
            for (int j = 0; j < restaurante[i].length; j++) {
                System.out.print("\t| " + restaurante[i][j] + " |\t");
            }
            System.out.println();
        }

        do {
            for (int i = 0; i < restaurante.length; i++) {
                System.out.print(categoria[i]);
                for (int j = 0; j < restaurante[i].length; j++) {
                    System.out.print("\t| " + restaurante[i][j] + " |\t");
                }
                System.out.println();
            }

            System.out.println("Cuantos son? (Introduzca -1 para salír del programa.)");
            opcion = scanner.nextInt();
            if (opcion != -1) {
                if (0 <= opcion && opcion <= 4){
                    System.out.println("se admiten grupos de "+opcion+" miembros.");
                }else {
                    System.out.println("No se admiten grupos de "+opcion+" miembros.");
                }
            }
        } while (opcion != -1);

    }
}
