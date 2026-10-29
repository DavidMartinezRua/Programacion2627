import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class PalabraDoDia {
    private Random random;
    private Scanner teclado;
    private String palabraCorrecta;
    private int selector;
    private String[] intento;
    private int contador;

    public PalabraDoDia() {
        random = new Random();
        teclado = new Scanner(System.in);
        this.palabraCorrecta = "";
        this.contador = 6;
        this.intento = new String[contador];
        this.selector = 0;
    }

    public String getPalabraCorrecta() {
        return palabraCorrecta;
    }

    public void setPalabraCorrecta(String palabraCorrecta) {
        this.palabraCorrecta = palabraCorrecta;
    }

    public int getSelector() {
        return selector;
    }

    public void setSelector(int selector) {
        this.selector = selector;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String[] getIntento() {
        return intento;
    }

    public void setIntento(String[] intento) {
        this.intento = intento;
    }

    public void seleccionarDificultad() {

        System.out.println("Selecciona dificultad:");
        do {
            System.out.println("1. Fácil");
            System.out.println("2. Normal");
            System.out.println("3. Difícil");

            setSelector(teclado.nextInt());
            teclado.nextLine();
        } while (getSelector() > 3 || getSelector() < 0);
    }

    public void xenerarPalabraOcultaFacil() {
        setPalabraCorrecta(ListaPalabras.listaFacil[random.nextInt(ListaPalabras.listaFacil.length)].toUpperCase());

    }

    public void xenerarPalabraOcultaNormal() {
        setPalabraCorrecta(ListaPalabras.listaNormal[random.nextInt(ListaPalabras.listaNormal.length)].toUpperCase());

    }

    public void xenerarPalabraOcultaDificil() {
        setPalabraCorrecta(ListaPalabras.listaDificil[random.nextInt(ListaPalabras.listaDificil.length)].toUpperCase());

    }

    public void xenerarPalabraOculta() {
        palabraCorrecta = "";
        seleccionarDificultad();
        switch (getSelector()) {
            case 1 -> {
                xenerarPalabraOcultaFacil();
            }
            case 2 -> {
                xenerarPalabraOcultaNormal();
            }
            case 3 -> {
                xenerarPalabraOcultaDificil();
            }
        }
    }

    public void pedirPalabra() {
        if (contador > 0) {
            System.out.println("Introduce unha palabra:");

            do {
                intento[6 - contador] = teclado.nextLine().toUpperCase();
                if (intento[6 - contador].length() != 5) {
                    System.out.println("La palabra debe ser de 5 letras. Intentalo otra vez.");
                }
            } while (intento[6 - contador].length() != 5);

            contador--;
        } else {
            System.out.println("Non quedan intentos.");
        }
    }

    public void mostrarIntentos() {
        for (int i = 0; i < intento.length; i++) {
            for (int j = 0; j < 5; j++) {

                if (intento[i] != null) {

                    if (palabraCorrecta.charAt(j) == intento[i].charAt(j)) {
                        System.out.print("\u001B[32m" + intento[i].charAt(j) + "\u001B[0m\t");

                    } else if (palabraCorrecta.contains(intento[i].substring(j,j+1))) {
                        System.out.print("\u001B[33m" + intento[i].charAt(j) + "\u001B[0m\t");

                    } else if (!palabraCorrecta.contains(intento[i].substring(j))) {
                        System.out.print(intento[i].charAt(j) + "\t");
                    }


                    /* if (palabraCorrecta.contains(intento[i].substring(j))&&palabraCorrecta.charAt(j) != intento[i].charAt(j)){
                        System.out.print("\u001B[33m" +intento[i].charAt(j)+ "\u001B[0m\t");

                    } else if (palabraCorrecta.charAt(j) == intento[i].charAt(j)){
                        System.out.print("\u001B[32m" +intento[i].charAt(j)+ "\u001B[0m\t");

                    }else {
                        System.out.print(intento[i].charAt(j)+"\t");
                    } */

                } else {
                    System.out.print("-\t");
                }
            }
            System.out.println();
        }
        System.out.println("Quedan " + contador + " intentos.");
    }

    public void partida() {
        contador = 6;
        palabraCorrecta = "";
        xenerarPalabraOculta();
        System.out.println(palabraCorrecta);
        do {
            pedirPalabra();
            mostrarIntentos();
        } while (contador != 0);
    }

    @Override
    public String toString() {
        return "PalabraDoDia{" +
                "palabraCorrecta= '" + palabraCorrecta + "\'  intentos restantes: " + contador + '}';
    }
}
