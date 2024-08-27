package co.edu.uniquindio.poo;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainBiblioteca {
    public static void main(String[] args) {

        /**
         * Creamos datos de prueba
         */

        // Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Crear algunos libros
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 12, EstadoItem.DISPONIBLE, "382482");
        Libro libro2 = new Libro("1984", "George Orwell", 14, EstadoItem.DISPONIBLE, "0248834");
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez", 15, EstadoItem.DISPONIBLE, "183722");
        Libro libro4 = new Libro("Algebra baldor", "Don baldor", 16, EstadoItem.DISPONIBLE, "2948242");


        // Agregar libros a la biblioteca
        biblioteca.getListaLibros().add(libro1);
        biblioteca.getListaLibros().add(libro2);
        biblioteca.getListaLibros().add(libro3);
        biblioteca.getListaLibros().add(libro4);

        // Crear algunos miembros
        Miembro miembro1 = new Miembro("Juan", "Perez", 10100987);
        Miembro miembro2 = new Miembro("Mari", "Carmen", 10235745);
        Miembro miembro3 = new Miembro("Pepe", "Lopez", 10323942);

        // Agregar miembros a la biblioteca
        biblioteca.getListaMiembros().add(miembro1);
        biblioteca.getListaMiembros().add(miembro2);
        biblioteca.getListaMiembros().add(miembro3);

        // Crear un bibliotecario
        Bibliotecario bibliotecario = new Bibliotecario("Ana", "García", 201);

        // Menú para seleccionar libro y miembro
        String[] librosArray = biblioteca.getListaLibros().stream().map(Libro::getTitulo).toArray(String[]::new);
        String libroSeleccionado = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione un libro para el préstamo:",
                "Registro de Préstamo",
                JOptionPane.PLAIN_MESSAGE,
                null,
                librosArray,
                librosArray[0]
        );

        String[] miembrosArray = biblioteca.getListaMiembros().stream().map(Miembro::getNombre).toArray(String[]::new);
        String miembroSeleccionado = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione un miembro:",
                "Registro de Préstamo",
                JOptionPane.PLAIN_MESSAGE,
                null,
                miembrosArray,
                miembrosArray[0]
        );

        // Buscar el libro y miembro seleccionados
        Libro libro = biblioteca.getListaLibros().stream()
                .filter(l -> l.getTitulo().equals(libroSeleccionado))
                .findFirst().orElse(null);

        Miembro miembro = biblioteca.getListaMiembros().stream()
                .filter(m -> m.getNombre().equals(miembroSeleccionado))
                .findFirst().orElse(null);

        // Registrar el préstamo si el libro y miembro son válidos
        if (libro != null && miembro != null) {
            bibliotecario.registrarPrestamo(libro, miembro, biblioteca);
            JOptionPane.showMessageDialog(null, "Préstamo registrado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar el préstamo.");
        }

        // Mostrar detalles de los préstamos del miembro seleccionado
        StringBuilder prestamosDetalles = new StringBuilder("Préstamos Activos de " + miembro.getNombre() + ":\n");
        for (Prestamo prestamo : miembro.getPrestamosActivos()) {
            prestamosDetalles.append(prestamo.getLibroPrestamo().getTitulo())
                    .append(" - Fecha de Préstamo: ").append(prestamo.getFechaPrestamo())
                    .append("\n");
        }
        JOptionPane.showMessageDialog(null, prestamosDetalles.toString());

    }
}
