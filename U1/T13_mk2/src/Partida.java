public class Partida {
    Mar mar ;

    public Partida() {
        mar = new Mar();
    }

    public void jugar(){
        mar.mostrarTablero();
        mar.bombardear();
        mar.mostrarTablero();
    }
}
