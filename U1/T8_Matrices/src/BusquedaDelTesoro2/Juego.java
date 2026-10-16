package BusquedaDelTesoro2;

import java.util.Scanner;

public class Juego {

    private Tablero tablero;
    private Scanner teclado;

    public Juego(int filas, int columnas) {
        tablero = new Tablero(filas, columnas);
        teclado = new Scanner(System.in);
    }

    public void jugar() {

        int jugadasMaximas = 5;
        int jugadas = 0;
        int fila, columna, resultado;

        boolean juegoTerminado = false;

        System.out.println("¡Comienza el juego!");
        System.out.println("Debes encontrar el tesoro sin pisar la mina.");

        while (!juegoTerminado && jugadas < jugadasMaximas) {

            System.out.println("\nJugadas restantes: " + (jugadasMaximas - jugadas));

            System.out.print("Introduce la fila: ");
            fila = teclado.nextInt();
            while(fila < 0 || fila >= tablero.getFilas()){
                System.out.print("Numero de fila invalido, introduce la fila: ");
                fila = teclado.nextInt();
            }

            System.out.print("Introduce la columna: ");
            columna = teclado.nextInt();
            while (columna < 0 || columna >= tablero.getColumnas()) {
                System.out.print("Numero de columna invalido, introduce la fila: ");
                fila = teclado.nextInt();
            }

            resultado = tablero.comprobarCasilla(fila, columna);

            if (resultado == 1) {
                System.out.println("Has encontrado la mina.");
                System.out.println("Has perdido.");
                juegoTerminado = true;

            } else if (resultado == 2) {
                System.out.println("Has encontrado el tesoro.");
                System.out.println("¡HAS GANADO!");
                juegoTerminado = true;

            } else {
                System.out.println("Aquí no hay nada.");
                jugadas++;
            }
        }

        if (!juegoTerminado) {
            System.out.println("\nTe has quedado sin jugadas.");
            System.out.println("¡Has perdido!");
        }
    }
}