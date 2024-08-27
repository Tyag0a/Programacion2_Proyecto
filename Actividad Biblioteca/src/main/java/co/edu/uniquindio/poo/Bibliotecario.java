package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

//Implementacion SOLID en la clase:
//
//-Principio responsabilidad unica, es responsabilidad de un bilbiotecario gestionar el inventario,
// Asi como manejar el registro de prestamos y devoluciones y tener acceso a ellos.
//
//-Abierto-Cerrado, con la interfaz GestionInventario,la clase esta abierta a la extension
//de funcionalidades y cerrada a la modificacion de lo existente

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

    /**
     * Metodo que se implementa para gestionar el inventario.
     *
     * @param {Biblioteca} biblioteca.
     */

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
     * Metodo que se implementa para agregar un item al inventario.
     *
     * @param {ItemBiblioteca} item
     */

    @Override
    public void agregarItem(ItemBiblioteca item){
        if (!inventario.contains(item)) {
            inventario.add(item);
            System.out.println("Item agregado al inventario: " + item.getTitulo());
        } else {
            System.out.println("El item ya esta en el inventario.");
        }
    }

    /**
     * Metodo que se implementa para eliminar un item del inventario.
     *
     * @param {ItemBiblioteca} item.
     */

    @Override
    public void eliminarItem(ItemBiblioteca item){
        if (inventario.contains(item)) {
            inventario.remove(item);
            System.out.println("Item eliminado del inventario: " + item.getTitulo());
        } else {
            System.out.println("El item no se encontró en el inventario.");
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
            Prestamo nuevoPrestamo = new Prestamo( LocalDate.now(),null,
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

    /**
     * Metodo para registrar la devolucion de un libro.
     *
     * @param {Biblioteca} biblioteca.
     * @param {Libro} libro.
     * @param {Miembro} miembro.
     *
     */

    public void registrarDevolucion(Biblioteca biblioteca, Libro libro, Miembro miembro) {

        // Buscar el préstamo correspondiente
        Prestamo prestamoADevolver = null;
        for (Prestamo prestamo : biblioteca.getListaPrestamos()) {
            if (prestamo.getLibroPrestamo().equals(libro) && prestamo.getMiembroPrestamo().equals(miembro)) {
                prestamoADevolver = prestamo;
                break;
            }
        }

        if (prestamoADevolver != null) {
            // Actualizar el estado del libro a DISPONIBLE
            libro.setEstado(EstadoItem.DISPONIBLE);

            // Eliminar el préstamo de la lista de préstamos activos del miembro
            miembro.getPrestamosActivos().remove(prestamoADevolver);

            // Eliminar el préstamo de la lista de préstamos de la biblioteca
            biblioteca.getListaPrestamos().remove(prestamoADevolver);

            System.out.println("Devolución registrada con exito.");
        } else {
            System.out.println("No se encontro un prestamo activo para este libro y miembro.");
        }
    }

}
