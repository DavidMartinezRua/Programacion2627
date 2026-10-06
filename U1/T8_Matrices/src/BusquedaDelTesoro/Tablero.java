package BusquedaDelTesoro;

import java.util.Scanner;

class Tablero {
    private final int FILAS = 5;
    private final int COLUMNAS = 5;

    private int minaFila;
    private int minaColumna;
    private int tesoroFila;
    private int tesoroColumna;

    public Tablero() {
        colocarElementos();
    }

    // Coloca aleatoriamente la mina y el tesoro
    private void colocarElementos() {
        minaFila = (int) (Math.random() * FILAS);
        minaColumna = (int) (Math.random() * COLUMNAS);

        do {
            tesoroFila = (int) (Math.random() * FILAS);
            tesoroColumna = (int) (Math.random() * COLUMNAS);
        } while (tesoroFila == minaFila && tesoroColumna == minaColumna);
    }

    public boolean esMina(int fila, int columna) {
        return fila == minaFila && columna == minaColumna;
    }

    public boolean esTesoro(int fila, int columna) {
        return fila == tesoroFila && columna == tesoroColumna;
    }

    public int getFilas() {
        return FILAS;
    }

    public int getColumnas() {
        return COLUMNAS;
    }
}

