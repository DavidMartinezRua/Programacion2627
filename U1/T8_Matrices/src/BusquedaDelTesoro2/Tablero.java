package BusquedaDelTesoro2;

public class Tablero {
    private int[][] mapa;

    public Tablero(int[][] mapa) {
        this.mapa = mapa;
    }

    public int[][] getMapa() {
        return mapa;
    }

    public void setMapa(int[][] mapa) {
        this.mapa = mapa;
    }
}
