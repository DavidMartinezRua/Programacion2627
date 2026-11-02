public class Celda {

    private Barco barco;
    private boolean bombardeada;

    public Celda() {
        this.barco = null;
        this.bombardeada = false;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public boolean isBombardeada() {
        return bombardeada;
    }

    public void disparar() {
        bombardeada = true;

        if (barco != null) {
            barco.recibirImpacto();
        }
    }

    public boolean hayBarco() {
        return barco != null;
    }
}