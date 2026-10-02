import java.util.Random;
import java.util.Scanner;

public class Matrices10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[][] restaurante = new int[2][10];
        String[] categoria = {"Mesa nº: ", "Ocupación: "};
        int contador = 0, opcion, colocados;
        int x, y;

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

        do {
            x = 0;
            y = 0;
            colocados = 0;

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
                if (0 <= opcion && opcion <= 4) {
                    do {
                        if (restaurante[1][x] == 0) {
                            restaurante[1][x] = opcion;
                            colocados = 1;
                            System.out.println("Muy bien, bienvenidos a la mesa " + restaurante[0][x] + " !");
                        }
                        x++;
                    } while (x < 10 && colocados == 0);

                    if (colocados == 0) {
                        do {
                            if (restaurante[1][y] + opcion <= 4) {
                                restaurante[1][y] = restaurante[1][y] + opcion;
                                colocados = 1;
                                System.out.println("Muy bien, bienvenidos a la mesa " + restaurante[0][y] + " !");
                            }
                            y++;
                        } while (y < 10 && colocados == 0);
                    }

                    if (colocados == 0) {
                        System.out.println("No queda sitio para grupos de " + opcion + ".");
                    }

                } else {
                    System.out.println("No se admiten grupos de " + opcion + " miembros.");
                }
            }
        } while (opcion != -1);
    }
}
