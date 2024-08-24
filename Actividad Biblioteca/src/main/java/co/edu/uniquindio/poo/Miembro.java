package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Miembro {

    String nombre;
    String apellido;
    int idMiembro;
    Collection<Prestamo> prestamosActivos;

    public Miembro(String nombre, String apellido, int idMiembro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idMiembro = idMiembro;
        prestamosActivos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdMiembro() {
        return idMiembro;
    }

    public void setIdMiembro(int idMiembro) {
        this.idMiembro = idMiembro;
    }

    public Collection<Prestamo> getPrestamosActivos() {
        return prestamosActivos;
    }

    public void setPrestamosActivos(Collection<Prestamo> prestamosActivos) {
        this.prestamosActivos = prestamosActivos;
    }

}
