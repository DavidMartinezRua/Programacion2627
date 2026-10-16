package POO5;

public class main {
    public static void main(String[] args) {
        Punto p1 = new Punto(1,1);
        Punto p2 = new Punto(1,3);
        Punto p3 = new Punto(2,1);
        Punto p4 = new Punto(p1.getX() - p2.getX(),p2.getY() - p3.getY() );

        System.out.println(p4);


    }
}
