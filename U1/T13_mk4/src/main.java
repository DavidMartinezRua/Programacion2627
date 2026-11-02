import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Mar mar = new Mar();

        String coordenadas;

        int fila;
        int columna;

        System.out.println("¡HUNDIR LA FLOTA!");

        System.out.println("El ordenador ha colocado 10 barcos.");

        mar.mostrarTablero();

        // Mientras no se hundan todos los barcos
        while (!mar.todosHundidos()) {

            System.out.print("Dispara (ejemplo A0) o SALIR: ");

            coordenadas = teclado.nextLine().toUpperCase().trim();

            // Comprobar si quiere abandonar
            if (coordenadas.equals("SALIR")) {

                System.out.println("Has abandonado la partida.");

                break;
            }

            // Comprobar que las coordenadas sean correctas
            if (coordenadas.length() != 2 ||
                    coordenadas.charAt(0) < 'A' ||
                    coordenadas.charAt(0) > 'J' ||
                    coordenadas.charAt(1) < '0' ||
                    coordenadas.charAt(1) > '9') {

                System.out.println("Coordenadas incorrectas.");

                continue;
            }

            // Convertir las coordenadas
            fila = coordenadas.charAt(0) - 'A';

            columna = coordenadas.charAt(1) - '0';

            // Comprobar el disparo
            String resultado = mar.comprobarDisparo(fila, columna);

            System.out.println(resultado);

            // Mostrar el tablero actualizado
            mar.mostrarTablero();
        }

        // Comprobar si ha ganado
        if (mar.todosHundidos()) {

            System.out.println("¡ENHORABUENA!");

            System.out.println("¡Has hundido toda la flota!");

        }

        teclado.close();
    }
}