import java.util.Random;
import java.util.Scanner;

public class Matrices11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[][] tablero = new String[3][3];
        int opcion = 0, jugador1, jugador2;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "+";
            }
        }

        do {
            System.out.println("Que modo quieres jugar?  J vs PNJ (1.) - J1 vs J2 (2.) - salir (-1)");

            if (opcion != -1){

            }
        }while (opcion != -1);

        for (int i = 0; i < tablero.length; i++) {
            System.out.println("_".repeat(26));
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("\t|"+tablero[i][j]+"|\t");
            }
            System.out.println();
        }
        System.out.println("_".repeat(26));
    }
}
