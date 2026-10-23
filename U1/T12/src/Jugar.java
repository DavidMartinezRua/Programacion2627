public class Jugar {

    private int intentos = 6;
    private PalabraOculta palabraOculta;

    public Jugar() {
        this.palabraOculta = new PalabraOculta();
    }

    public int getIntentos() {
        return intentos;
    }

    public void partida(){
        intentos--;
    }

}
