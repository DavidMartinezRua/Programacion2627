import java.util.Scanner;

public class Juego {
    private PalabraDoDia jueguito;
    private String opcion;
    private Scanner teclado;

    public Juego() {
        this.opcion = "S";
        jueguito = new PalabraDoDia();
        teclado = new Scanner(System.in);
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public void menu(){
        do {
            System.out.println("Quieres jugar? (S/N)");
            opcion = teclado.nextLine();
            if (opcion.equals("S")){
                jueguito.partida();
            }
        }while (!opcion.equals("N"));
    }
}
