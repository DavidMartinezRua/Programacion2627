import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class XestorDeTarefas {

    private ArrayList<Tarefa> tarefas;
    private Scanner teclado;

    public XestorDeTarefas() {
        tarefas = new ArrayList<>();
        teclado = new Scanner(System.in);
    }

    public void exemploDeTarefa() {
        Random random = new Random();
        String[] nomeTarefa = {"Jugar al Balatro", "Programar", "Participar en el Torneo", "Budokai Tenkaichi 2"};
        String[] solicitante = {"Sergio", "Mesi", "Gabriel", "Franco", "Hitler"};
        String[] responsable = {"Sergio", "Mesi", "Gabriel", "Franco", "Hitler"};
        String[] descricion = {"GOTY", "Me encantan los niños", "Salvar a España, salvar nustra casa", "Espíritu Ario", "Seguimos programando", "Me gustaria ir a casa."};
        for (int i = 0; i < 10; i++) {
            tarefas.add(new Tarefa(nomeTarefa[random.nextInt(nomeTarefa.length)], solicitante[random.nextInt(solicitante.length)], responsable[random.nextInt(responsable.length)], descricion[random.nextInt(descricion.length)]));
        }
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
                if (t.getEstado().equals(estado)) {
                    System.out.println(t);
                }
            }
            System.out.println();
        }
    }

    public void revisarTarefa() {
        boolean real = false;
        System.out.println("Nome do responsable?");
        String responsable = teclado.nextLine();

        for (Tarefa t : tarefas) {
            if (t.getResponsable().equalsIgnoreCase(responsable) && t.getEstado() == Estado.PENDENTE) {
                t.setEstado(Estado.EN_REVISIÓN);
                System.out.println("Tarefa" + t.getNomeTarefa() + " enviada a revisión." );
                real = true;
            } if(!real) {
                System.out.println("Non hai tarefas pendentes para ese responsable.");
            }
        }
    }

    public void completarTarefa() {
        boolean real = false;
        System.out.println("Nome do responsable?");
        String responsable = teclado.nextLine();

        for (Tarefa t : tarefas) {
            if (t.getResponsable().equalsIgnoreCase(responsable) && t.getEstado() == Estado.EN_REVISIÓN) {
                t.setEstado(Estado.COMPLETADA);
                System.out.println("Tarefa" + t.getNomeTarefa() + " completada!" );
                real = true;
            } if(!real) {
                System.out.println("Non hai tarefas en revisión para ese responsable.");
            }
        }
    }

    public void buscarTarefaPorDescricion(){
        String descripcion = "";

        System.out.println("Escribe o contido da descripcion da tarefa que queres buscar: ");
        descripcion = teclado.nextLine();

        for(Tarefa t : tarefas){
            if (t.getDescricion().toLowerCase().contains(descripcion.toLowerCase())) {
                System.out.println(t);
            }
        }
    }

    public void buscarTarefaPorSolicitante(){
        String solicitante = "";

        System.out.println("Escribe o solicitante da tarefa que queres buscar: ");
        solicitante = teclado.nextLine();

        for(Tarefa t : tarefas){
            if (t.getSolicitante().toLowerCase().contains(solicitante.toLowerCase())) {
                System.out.println(t);
            }
        }
    }

    public void resumoTarefas(){
        int pendentes = 0, enRevisions = 0, completadas = 0;

        for(Tarefa t : tarefas){
            if (t.getEstado().equals(Estado.PENDENTE)) {
                pendentes++;
            }
            if (t.getEstado().equals(Estado.EN_REVISIÓN)) {
                enRevisions++;
            }
            if (t.getEstado().equals(Estado.COMPLETADA)) {
                completadas++;
            }
        }

        System.out.println("Numero total de tarefas: "+ tarefas.size());
        System.out.println("Numero de tarefas pendentes: "+ pendentes);
        System.out.println("Numero de tarefas en revisión: "+ enRevisions);
        System.out.println("Numero de tarefas completadas: "+ completadas);

    }
    
}
