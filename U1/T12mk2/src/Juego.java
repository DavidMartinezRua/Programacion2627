public class Juego {
    private int contador;
    private String[] intento;

    public Juego() {
        this.contador = 6;
        this.intento = new String[contador];
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

    public void mostrarPalabra(){

    }
}
