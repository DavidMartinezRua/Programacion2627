public class Matrices2 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int contador = 1;


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = contador++;
                //System.out.print("\t"+j+"\t");
                System.out.print("\t" + matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
