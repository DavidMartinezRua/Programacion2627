package BusquedaDelTesoro2;

import java.util.Random;

public class Tablero {

    private int[][] tablero;
    private int filaMina;
    private int columnaMina;
    private int filaTesoro;
    private int columnaTesoro;

    // Constructor
    public Tablero(int filas, int columnas) {
        tablero = new int[filas][columnas];

        colocarMina();
        colocarTesoro();
    }

    // Coloca la mina en una posición aleatoria
    private void colocarMina() {
        Random random = new Random();

        filaMina = random.nextInt(tablero.length);
        columnaMina = random.nextInt(tablero[0].length);

        tablero[filaMina][columnaMina] = 1;
    }

    // Coloca el tesoro en una posición aleatoria diferente a la mina
    private void colocarTesoro() {
        Random random = new Random();

        do {
            filaTesoro = random.nextInt(tablero.length);
            columnaTesoro = random.nextInt(tablero[0].length);
        } while (filaTesoro == filaMina && columnaTesoro == columnaMina);

        tablero[filaTesoro][columnaTesoro] = 2;
    }

    // Comprueba qué hay en una posición
    public int comprobarCasilla(int fila, int columna) {
        return tablero[fila][columna];
    }

    // Devuelve el número de filas
    public int getFilas() {
        return tablero.length;
    }

    // Devuelve el número de columnas
    public int getColumnas() {
        return tablero[0].length;
    }
}
