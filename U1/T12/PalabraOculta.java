package U1.T12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PalabraOculta {
    private Random random;
    private Scanner teclado;
    private String palabraCorrecta;
    private char[] palabraCorrectaDividida;

    public PalabraOculta() {
        random = new Random();
        teclado = new Scanner(System.in);
        this.palabraCorrecta = palabraCorrecta;
        palabraCorrectaDividida = palabraCorrecta.toCharArray();
    }

    public String getPalabraCorrecta() {
        return palabraCorrecta;
    }

    public void setPalabraCorrecta(String palabraCorrecta) {
        this.palabraCorrecta = palabraCorrecta;
    }

    public char[] getPalabraCorrectaDividida() {
        return palabraCorrectaDividida;
    }

    public void setPalabraCorrectaDividida(char[] palabraCorrectaDividida) {
        this.palabraCorrectaDividida = palabraCorrectaDividida;
    }

    public void xenerarPalabraOcultaFacil(){
        setPalabraCorrecta(ListaPalabras.lisatFacil[random.nextInt(ListaPalabras.lisatFacil.length)]);
        setPalabraCorrectaDividida(getPalabraCorrecta().toCharArray());
    }

    @Override
    public String toString() {
        return "PalabraOculta [palabraCorrectaDividida=" + Arrays.toString(palabraCorrectaDividida) + "]";
    }
    
    
}


