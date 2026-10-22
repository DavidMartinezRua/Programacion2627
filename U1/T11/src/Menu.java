import java.util.Scanner;

public class Menu {
    private XestorDeTarefas xestor;

    public Menu() {
        this.xestor = new XestorDeTarefas();
    }

    public void menuDeOpcions() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        System.out.println("Benvido ao Xestor de Tarefas!");
        do {
            System.out.println("Escolla unha opción: ");
            System.out.println("1: Engadir tarefas");
            System.out.println("2: Listar tarefas");
            System.out.println("3: Revisar tarefas");
            System.out.println("4: Completar tarefas");
            System.out.println("5: Buscar tarefas(por descrición)");
            System.out.println("6: Buscar tarefas(por solicitante)");
            System.out.println("7: Resumo");
            System.out.println("8: Exemplo de tarefas");
            System.out.println("0: Salir do Xestor");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1 ->{
                    xestor.engadirTarefa();
                }
                case 2 ->{
                    xestor.listarTarefas();
                }
                case 3 ->{
                    xestor.revisarTarefa();
                }
                case 4 ->{
                    xestor.completarTarefa();
                }
                case 5 ->{
                    xestor.buscarTarefaPorDescricion();
                }
                case 6 ->{}
                case 7 ->{}
                case 8 ->{
                    xestor.exemploDeTarefa();
                }
                case 0 ->{}
                default -> {
                    System.out.println("Opción invalida.");
                }
            }

        }while (opcion != 0);

    }
}
