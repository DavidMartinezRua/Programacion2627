package BusquedaDelTesoro2;

import java.util.Random;

public class Tablero {

    private int[][] tablero;
    private int filaMina;
    private int columnaMina;
    private int filaTesoro;
    private int columnaTesoro;

    public Tablero(int filas, int columnas) {
        tablero = new int[filas][columnas];

        colocarMina();
        colocarTesoro();
    }

    public int getFilas() {
        return tablero.length;
    }

    public int getColumnas() {
        return tablero[0].length;
    }

    private void colocarMina() {
        Random random = new Random();

        filaMina = random.nextInt(tablero.length);
        columnaMina = random.nextInt(tablero[0].length);

        tablero[filaMina][columnaMina] = 1;
    }

    private void colocarTesoro() {
        Random random = new Random();

        do {
            filaTesoro = random.nextInt(tablero.length);
            columnaTesoro = random.nextInt(tablero[0].length);
        } while (filaTesoro == filaMina && columnaTesoro == columnaMina);

        tablero[filaTesoro][columnaTesoro] = 2;
    }

    public int comprobarCasilla(int fila, int columna) {
        return tablero[fila][columna];
    }

}
