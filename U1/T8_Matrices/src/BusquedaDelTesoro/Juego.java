package BusquedaDelTesoro;

import java.util.Scanner;

public class Juego {
    private Tablero tablero;
    private Jugador jugador;
    private int jugadasRestantes;

    public Juego(String nombreJugador, int numeroJugadas) {
        jugador = new Jugador(nombreJugador);
        tablero = new Tablero();
        jugadasRestantes = numeroJugadas;
    }

    public void jugar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("      EN BUSCA DEL TESORO");
        System.out.println("Jugador: " + jugador.getNombre());
        System.out.println("El tablero tiene " + tablero.getFilas() +
                " filas y " + tablero.getColumnas() + " columnas.");
        System.out.println("Tienes " + jugadasRestantes + " jugadas.");
        System.out.println("Las coordenadas empiezan en 0.");
        System.out.println();

        while (jugadasRestantes > 0) {

            System.out.println("Jugadas restantes: " + jugadasRestantes);

            System.out.print("Introduce la fila: ");
            int fila = sc.nextInt();

            System.out.print("Introduce la columna: ");
            int columna = sc.nextInt();

            // Comprobar que las coordenadas sean válidas
            if (fila < 0 || fila >= tablero.getFilas()
                    || columna < 0 || columna >= tablero.getColumnas()) {

                System.out.println("Coordenadas no válidas.");
                System.out.println("Debes introducir valores entre 0 y 4.");
                continue;
            }

            jugadasRestantes--;

            // Comprobar si ha encontrado la mina
            if (tablero.esMina(fila, columna)) {
                System.out.println();
                System.out.println("💥 ¡BOOM!");
                System.out.println("Has encontrado la mina.");
                System.out.println("¡Has perdido!");
                return;
            }

            // Comprobar si ha encontrado el tesoro
            if (tablero.esTesoro(fila, columna)) {
                System.out.println();
                System.out.println("💰 ¡ENHORABUENA!");
                System.out.println("Has encontrado el tesoro.");
                System.out.println("¡Has ganado!");
                return;
            }

            // No ha encontrado ni mina ni tesoro
            System.out.println("No hay nada en esa posición.");
            System.out.println("¡Sigue buscando!");
            System.out.println();
        }

        System.out.println();
        System.out.println("Se han agotado todas las jugadas.");
        System.out.println("¡Has perdido!");
    }
}