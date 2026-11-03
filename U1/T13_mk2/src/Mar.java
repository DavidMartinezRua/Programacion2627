import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Mar {
    private final int TAMAÑO_HOR = 10;
    private final int TAMAÑO_VER = 10;

    private final Celda[][] tablero;

    private ArrayList<Barco> flota;

    private Random random;
    private Scanner teclado;

    public Mar() {

        tablero = new Celda[TAMAÑO_HOR][TAMAÑO_VER];

        flota = new ArrayList<>();

        random = new Random();
        teclado = new Scanner(System.in);

        inicializarTablero();


    }

    public void inicializarTablero() {

        for (int i = 0; i < TAMAÑO_HOR; i++) {

            for (int j = 0; j < TAMAÑO_VER; j++) {

                tablero[i][j] = new Auga();

            }
        }
    }

    public void colocarBarcos() {

    }

    public void mostrarTablero() {
        System.out.println();
        for (int i = 0; i < TAMAÑO_HOR; i++) {
            for (int j = 0; j < TAMAÑO_VER; j++) {

                if (!tablero[i][j].isBombardeada()) {
                    System.out.print(" ~ |");
                }else {
                    System.out.print(" * |");
                }

            }
            System.out.println();
        }
    }

    public void bombardear() {
        int corH = 0, corV = 0;

        System.out.println("Indica las coordenadas a bombardear:");
        do {
            System.out.println("Indica las coordenadas horizontales (1-10):");
            corH = teclado.nextInt() - 1;
        } while (corH > 9 || corH < 0);

        do {
            System.out.println("Indica las coordenadas verticales (1-10):");
            corV = teclado.nextInt() - 1;
        } while (corV > 9 || corV < 0);

        System.out.println("Bombardeando " + corH + " - " + corV + " ...");

        tablero[corH][corV].disparar();

    }

}