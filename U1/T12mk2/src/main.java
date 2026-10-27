public class main {
    public static void main(String[] args) {

        PalabraDoDia palabraDoDia = new PalabraDoDia();

        palabraDoDia.xenerarPalabraOculta();

        System.out.println(palabraDoDia);

        palabraDoDia.pedirPalabra();

        System.out.println(palabraDoDia);

        palabraDoDia.pedirPalabra();

        System.out.println(palabraDoDia);

        palabraDoDia.pedirPalabra();

        palabraDoDia.mostrarIntentos();
    }
}
