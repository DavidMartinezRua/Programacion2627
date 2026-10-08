package BusquedaDelTesoro2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el número de filas: ");
        int filas = teclado.nextInt();

        System.out.print("Introduce el número de columnas: ");
        int columnas = teclado.nextInt();

        // Comprobamos que el tablero pueda contener mina y tesoro
        if (filas < 1 || columnas < 2) {
            System.out.println(
                "El tablero debe tener al menos 1 fila y 2 columnas."
            );
        } else {

            Juego juego = new Juego(filas, columnas);
            juego.jugar();
        }

        teclado.close();
    }
}