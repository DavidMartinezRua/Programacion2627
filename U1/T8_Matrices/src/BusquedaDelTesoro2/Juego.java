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

        int jugadasMaximas = tablero.getFilas() * tablero.getColumnas() - 2;
        int jugadas = 0;

        boolean juegoTerminado = false;

        System.out.println("\n¡Comienza el juego!");
        System.out.println("Debes encontrar el tesoro sin pisar la mina.");
        System.out.println("Las coordenadas empiezan en 0.");

        while (!juegoTerminado && jugadas < jugadasMaximas) {

            System.out.println("\nJugadas restantes: "
                    + (jugadasMaximas - jugadas));

            System.out.print("Introduce la fila: ");
            int fila = teclado.nextInt();

            System.out.print("Introduce la columna: ");
            int columna = teclado.nextInt();

            // Comprobar que las coordenadas son válidas
            if (fila < 0 || fila >= tablero.getFilas()
                    || columna < 0 || columna >= tablero.getColumnas()) {

                System.out.println("Coordenadas no válidas.");
                continue;
            }

            int resultado = tablero.comprobarCasilla(fila, columna);

            if (resultado == 1) {
                System.out.println("¡BOOM! Has encontrado la mina.");
                System.out.println("Has perdido.");
                juegoTerminado = true;

            } else if (resultado == 2) {
                System.out.println("¡Felicidades! Has encontrado el tesoro.");
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