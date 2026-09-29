public class Matrices1 {
    public static void main(String[] args) {

        int[][] matriz = new int[3][5];
        int contador = 1;

        matriz[0][0] = 0;
        matriz[2][2] = 9;
        matriz[2][4] = 11;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("\t"+matriz[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
