import java.util.ArrayList;
import java.util.Scanner;

public class XestorDeTarefas {

    private ArrayList<Tarefa> tarefas;
    private Scanner teclado;

    public XestorDeTarefas() {
        tarefas = new ArrayList<>();
        teclado = new Scanner(System.in);
    }

    public void engadirTarefa() {
        String nomeTarefa, solicitante, responsable, descricion;

        System.out.println("Nome da tarefa?");
        nomeTarefa = teclado.nextLine();
        System.out.println("Nome do solicitante?");
        solicitante = teclado.nextLine();
        System.out.println("Nome do responsable?");
        responsable = teclado.nextLine();
        System.out.println("Descricion da tarefa?");
        descricion = teclado.nextLine();

        tarefas.add(new Tarefa(nomeTarefa, solicitante, responsable, descricion));
    }

    public void listarTarefas() {
        for (Estado estado : Estado.values()) {
            System.out.println("---" + estado + "---");
            for (Tarefa t : tarefas) {
                if (t.getEstado().equals(estado)){
                    System.out.println(t);
                }
            }
        }
    }

    public void revisarTarefa() {

    }
}
