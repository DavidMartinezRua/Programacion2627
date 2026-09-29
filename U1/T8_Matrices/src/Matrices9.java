import java.util.Random;

public class Matrices9 {
    public static void main(String[] args) {
        Random random = new Random();

        String[] pais = {"España", "Rusia", "Japón", "Austra"};
        int[][] datos = new int[pais.length][10];
        int[] media = new int[pais.length], maximo = new int[pais.length], minimo = new int[pais.length], suma = new int[pais.length];
        int contador = 0, j, i;

        for (i = 0; i < pais.length; i++) {
            media[i] = 0;
            maximo[i] = Integer.MIN_VALUE;
            minimo[i] = Integer.MAX_VALUE;
            suma[i] = 0;

        }

        for (i = 0; i < datos.length; i++) {
            for (j = 0; j < datos[i].length; j++) {
                datos[i][j] = random.nextInt(140,211);

                if (datos[i][j]<minimo[i]){
                    minimo[i] = datos[i][j];
                }
                if (datos[i][j]>maximo[i]){
                    maximo[i] = datos[i][j];
                }
                suma[i] = suma[i] + datos[i][j];
            }
        }

        for (int k = 0; k < suma.length; k++) {
            media[k] = suma[k]/datos.length;
        }

        System.out.println("\t".repeat(23) + "MED MIN MAX");

        for (i = 0; i < datos.length; i++) {
            System.out.print(pais[i]+ ":\t");
            for (j = 0; j < datos[i].length; j++) {
                System.out.print("\t" + datos[i][j] + "\t");
            }
            System.out.print("|\t"+media[i]+"\t"+minimo[i]+ "\t"+maximo[i]);
            System.out.println();
        }




    }
}
