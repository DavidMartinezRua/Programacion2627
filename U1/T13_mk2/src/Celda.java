public class Celda {

    private Barco barco;
    private String bombardeada;

    public Celda() {
        this.bombardeada = bombardeada;
        this.barco = barco;
    }

    public void corbeta(){
        String nome = "corbeta";
        int tamño = 1;
        this.barco = new Barco(nome,tamño);
    }
}
