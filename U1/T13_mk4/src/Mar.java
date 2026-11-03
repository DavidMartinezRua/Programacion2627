import java.util.ArrayList;
import java.util.Random;

public class Mar {

    private final int TAMAÑO_HOR = 10;
    private final int TAMAÑO_VER = 10;

    private final Celda[][] tablero;

    private ArrayList<Barco> flota;

    private Random random;

    public Mar() {

        tablero = new Celda[TAMAÑO_HOR][TAMAÑO_VER];

        flota = new ArrayList<>();

        random = new Random();

        inicializarTablero();

        colocarFlota();
    }

    // Inicializa todas las posiciones como agua
    private void inicializarTablero() {

        for (int i = 0; i < TAMAÑO_HOR; i++) {

            for (int j = 0; j < TAMAÑO_VER; j++) {

                tablero[i][j] = new Auga();

            }
        }
    }

    // Coloca todos los barcos
    private void colocarFlota() {

        colocarBarcos("Corbeta", 1, 4);

        colocarBarcos("Fragata", 2, 3);

        colocarBarcos("Submarino", 3, 2);

        colocarBarcos("Portaaviones", 4, 1);
    }

    // Coloca una cantidad determinada de barcos de un tamaño
    private void colocarBarcos(String nombre, int tamaño, int cantidad) {

        for (int i = 0; i < cantidad; i++) {

            boolean colocado = false;

            while (!colocado) {

                int fila = random.nextInt(TAMAÑO_HOR);

                int columna = random.nextInt(TAMAÑO_VER);

                boolean horizontal = random.nextBoolean();

                if (puedeColocarse(fila, columna, tamaño, horizontal)) {

                    Barco barco = new Barco(nombre, tamaño);

                    colocarBarco(barco, fila, columna, horizontal);

                    flota.add(barco);

                    colocado = true;
                }
            }
        }
    }

    // Comprueba si un barco puede colocarse en una posición
    private boolean puedeColocarse(int fila, int columna, int tamaño, boolean horizontal) {

        for (int i = 0; i < tamaño; i++) {

            int f = fila;
            int c = columna;

            if (horizontal) {
                c += i;
            } else {
                f += i;
            }

            // Comprobar que no salga del tablero
            if (f >= TAMAÑO_HOR || c >= TAMAÑO_VER) {
                return false;
            }

            // Comprobar que no haya otro barco alrededor
            for (int x = f - 1; x <= f + 1; x++) {

                for (int y = c - 1; y <= c + 1; y++) {

                    if (x >= 0 && x < TAMAÑO_HOR &&
                            y >= 0 && y < TAMAÑO_VER) {

                        if (tablero[x][y].hayBarco()) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    // Coloca las celdas de un barco en el tablero
    private void colocarBarco(Barco barco, int fila, int columna,
                              boolean horizontal) {

        for (int i = 0; i < barco.getTamaño(); i++) {

            int f = fila;
            int c = columna;

            if (horizontal) {
                c += i;
            } else {
                f += i;
            }

            tablero[f][c].setBarco(barco);
        }
    }

    // Muestra el tablero
    public void mostrarTablero() {

        System.out.println();

        System.out.print("   ");

        for (int j = 0; j < TAMAÑO_VER; j++) {
            System.out.print(" " + j + " ");
        }

        System.out.println();

        for (int i = 0; i < TAMAÑO_HOR; i++) {

            System.out.print((char) ('A' + i) + " |");

            for (int j = 0; j < TAMAÑO_VER; j++) {

                Celda celda = tablero[i][j];

                if (!celda.isBombardeada()) {

                    System.out.print(" ~ |");

                } else if (celda.hayBarco()) {

                    System.out.print(" # |");

                } else {

                    System.out.print(" * |");

                }
            }

            System.out.println();
        }

        System.out.println();
    }

    // Comprueba un disparo
    public String comprobarDisparo(int fila, int columna) {

        Celda celda = tablero[fila][columna];

        if (celda.isBombardeada()) {
            return "Posición alcanzada previamente";
        }

        celda.disparar();

        if (!celda.hayBarco()) {
            return "Agua";
        }

        Barco barco = celda.getBarco();

        if (barco.estaHundido()) {
            return "Hundido: " + barco.getNombre();
        }

        return "Tocado: " + barco.getNombre();
    }

    // Comprueba si todos los barcos están hundidos
    public boolean todosHundidos() {

        for (Barco barco : flota) {

            if (!barco.estaHundido()) {
                return false;
            }
        }

        return true;
    }
}