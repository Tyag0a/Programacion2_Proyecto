package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;

public class Bibliotecario extends Empleado implements GestionInventario{

    Collection<ItemBiblioteca> inventario;

    public Bibliotecario(String nombre, String apellido, int identificacion) {
        super(nombre, apellido, identificacion);
        inventario = new LinkedList<>();
    }

    public Collection<ItemBiblioteca> getInventario() {
        return inventario;
    }

    public void setInventario(Collection<ItemBiblioteca> inventario) {
        this.inventario = inventario;
    }

    @Override
    public void gestionarInventario(Biblioteca biblioteca) {

        //Remover del inventario si un item esta perdido
        inventario.removeIf(item -> item.getEstado() == EstadoItem.PERDIDO);

        //Agregar los libros de la biblioteca al inventario
        for (Libro libro : biblioteca.getListaLibros()) {
            if (!inventario.contains(libro)) {
                inventario.add(libro);
            }
        }

    }

    /**
     * Metodo para verificar la disponibilidad de un libro.
     *
     * @param {Libro} libro.
     * @return {Boolean} Confirmacion booleana del estado del libro..
     */

    public boolean verificarDisponibilidadLibro(Libro libro) {
        return libro.getEstado() == EstadoItem.DISPONIBLE;

    }

    /**
     * Metodo para registrar el prestamo de un libro.
     *
     * @param {Libro} libroPrestamo.
     * @param {Miembro} miembroPrestamo.
     * @param {Biblioteca} biblioteca.
     */

    public void registrarPrestamo(Libro libro, Miembro miembro, Biblioteca biblioteca) {
        if (verificarDisponibilidadLibro(libro)) {
            Prestamo nuevoPrestamo = new Prestamo( LocalDate.now(),
                    LocalDate.now().plusDays(14), // Ejemplo: plazo de devolución de 14 días
                    libro,
                    miembro );

            libro.setEstado(EstadoItem.PRESTADO);
            miembro.getPrestamosActivos().add(nuevoPrestamo);
            biblioteca.getListaPrestamos().add(nuevoPrestamo);

            System.out.println("Préstamo registrado exitosamente.");
        } else {
            System.out.println("El libro no está disponible para préstamo.");
        }
    }

}
