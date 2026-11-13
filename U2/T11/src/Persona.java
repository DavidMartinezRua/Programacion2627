import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String dni;
    private LocalDate fechaDeNacemento;

    public Persona(String nombre, String dni, LocalDate fechaDeNacemento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeNacemento = fechaDeNacemento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaDeNacemento() {
        return fechaDeNacemento;
    }

    public void setFechaDeNacemento(LocalDate fechaDeNacemento) {
        this.fechaDeNacemento = fechaDeNacemento;
    }

    @Override
    public String toString() {
        return "Persona{" +  "nombre='" + nombre + '\'' +  ", dni='" + dni + '\'' +  ", fechaDeNacemento=" + fechaDeNacemento +  '}';
    }
}
