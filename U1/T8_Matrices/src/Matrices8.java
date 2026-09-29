import java.util.Random;

public class Matrices8 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[10][10];
        int[] diagonal = new int[10];
        int maximo = Integer.MIN_VALUE, minimo = Integer.MAX_VALUE, suma = 0, media = 0, contador = 0, j, i;

        System.out.println("Matriz normal:");
        for ( i = 0; i < matriz.length; i++) {
            for ( j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(200, 301);
                System.out.print("\t" + matriz[i][j] + "\t");

                if (i == j) {
                    diagonal[contador] = matriz[i][j];
                    contador++;
                }
            }
            System.out.println();
        }

        System.out.println("Diagonal: ");
        for ( i = 0; i < diagonal.length; i++) {

            System.out.print("\t" + diagonal[i] + "\t");
            suma = suma + diagonal[i];

            if (diagonal[i] < minimo) {
                minimo = diagonal[i];
            }
            if (diagonal[i] > maximo) {
                maximo = diagonal[i];
            }
        }
        media = suma/diagonal.length;
        System.out.println();
        System.out.println("Numero máximo: " + maximo);
        System.out.println("Numero mínimo: " + minimo);
        System.out.println("Media: "+media);
    }
}
