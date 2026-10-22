import java.util.Scanner;

public class Tarefa {
    private String nomeTarefa;
    private String solicitante;
    private Estado estado;
    private String responsable;
    private String descricion;

    public Tarefa(String nomeTarefa, String solicitante, String responsable, String descricion) {
        this.nomeTarefa = nomeTarefa;
        this.solicitante = solicitante;
        this.estado = Estado.PENDENTE;
        this.responsable = responsable;
        this.descricion = descricion;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    @Override
    public String toString() {
        return nomeTarefa + " | Solicitada por: " + solicitante + " | Estado: " + estado + " | Responsable: " + responsable;
    }
}
