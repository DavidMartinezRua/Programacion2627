public class Barco extends Celda{

        private final char aspecto = '*';
        private String nombre;
        private int tamaño;
        private int impactos;

        public Barco(String nombre, int tamano) {
            this.nombre = nombre;
            this.tamaño = tamano;
            this.impactos = 0;
        }
        public String getNombre() {
            return nombre;
        }
        public int getTamano() {
            return tamaño;
        }
        public int getImpactos() {
            return impactos;
        }
        public void recibirImpacto() {
            impactos++;
        }
        public boolean estaHundido() {
            return impactos == tamaño;
        }
    }
