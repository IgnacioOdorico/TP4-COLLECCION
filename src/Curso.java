import java.util.Objects;

public class Curso {
    private String nombre;
    private String docente;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }


    public Curso(String nombre, String docente) {
        this.nombre = nombre;
        this.docente = docente;
    }

    public Curso() {
    }


    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", docente='" + docente + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Curso curso)) return false;
        return Objects.equals(nombre, curso.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }
}
