package BusquedaDelTesoro2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el número de filas: ");
        int filas = teclado.nextInt();

        System.out.print("Introduce el número de columnas: ");
        int columnas = teclado.nextInt();


        while ((filas + columnas) < 3) {
            System.out.println("El tablero debe tener al menos 3 casillas.");

            System.out.print("Introduce el número de filas: ");
            filas = teclado.nextInt();

            System.out.print("Introduce el número de columnas: ");
            columnas = teclado.nextInt();
        }
            Juego juego = new Juego(filas, columnas);
            juego.jugar();
    }
}