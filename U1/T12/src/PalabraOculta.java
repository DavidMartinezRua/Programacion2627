import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PalabraOculta {
    private Random random;
    private Scanner teclado;
    private String palabraCorrecta;
    private char[] palabraCorrectaDividida;
    private int selector;

    public PalabraOculta() {
        random = new Random();
        teclado = new Scanner(System.in);
        this.palabraCorrecta = "";
        palabraCorrectaDividida = palabraCorrecta.toCharArray();
        this.selector = 0;
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

    public int getSelector() {
        return selector;
    }

    public void setSelector(int selector) {
        this.selector = selector;
    }

    public void seleccionarDificultad(){

        System.out.println("Selecciona dificultad:");
        do {
            System.out.println("1. Fácil");
            System.out.println("2. Normal");
            System.out.println("3. Difícil");

            setSelector(teclado.nextInt());
        }while (getSelector() > 3 || getSelector() < 0);
    }

    public void xenerarPalabraOculta(){
        seleccionarDificultad();
        switch (getSelector()){
            case 1 ->{xenerarPalabraOcultaFacil();}
            case 2 ->{xenerarPalabraOcultaNormal();}
            case 3 ->{xenerarPalabraOcultaDificil();}
        }
    }

    public void xenerarPalabraOcultaFacil(){
        setPalabraCorrecta(ListaPalabras.listaFacil[random.nextInt(ListaPalabras.listaFacil.length)]);
        setPalabraCorrectaDividida(getPalabraCorrecta().toCharArray());
    }
    public void xenerarPalabraOcultaNormal(){
        setPalabraCorrecta(ListaPalabras.listaNormal[random.nextInt(ListaPalabras.listaNormal.length)]);
        setPalabraCorrectaDividida(getPalabraCorrecta().toCharArray());
    }

    public void xenerarPalabraOcultaDificil(){
        setPalabraCorrecta(ListaPalabras.listaDificil[random.nextInt(ListaPalabras.listaDificil.length)]);
        setPalabraCorrectaDividida(getPalabraCorrecta().toCharArray());
    }


    @Override
    public String toString() {
        return "Palabra: [palabraCorrectaDividida=" + Arrays.toString(palabraCorrectaDividida) + "]";
    }

}


