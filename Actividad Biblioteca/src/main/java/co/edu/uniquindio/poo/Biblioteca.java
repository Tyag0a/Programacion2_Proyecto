package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

//Implementacion SOLID en la clase:
//
//-Principio responsabilidad unica, esta encargada unicamente de manejar las listas de miembros,
// libros, empleados y prestamos, ademas de tener acceso a modificiaciones de estas.

public class Biblioteca {

    String nombre;
    Collection<Miembro> listaMiembros;
    Collection<Empleado> listaEmpleados;
    Collection<Libro> listaLibros;
    Collection<Prestamo> listaPrestamos;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        listaMiembros = new LinkedList<>();
        listaEmpleados = new LinkedList<>();
        listaLibros = new LinkedList<>();
        listaPrestamos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Miembro> getListaMiembros() {
        return listaMiembros;
    }

    public void setListaMiembros() {
        this.listaMiembros = new LinkedList<>();
    }

    public Collection<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados() {
        this.listaEmpleados = new LinkedList<>();
    }

    public Collection<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros() {
        this.listaLibros = new LinkedList<>();
    }

    public Collection<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos() {
        this.listaPrestamos = new LinkedList<>();
    }

    public void setListaEmpleados(Collection<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void setListaLibros(Collection<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void setListaPrestamos(Collection<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public void setListaMiembros(Collection<Miembro> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    /**
     * Metodo para agregar un miembro a la lista de la biblioteca.
     *
     * @param {Miembro} miembro.
     */

    public void agregarMiembro(Miembro miembro) {
        if (miembro != null && !listaMiembros.contains(miembro)) {
            listaMiembros.add(miembro);
            System.out.println("Miembro agregado: " + miembro.getNombre());
        } else {
            System.out.println("El miembro ya existe o es inválido.");
        }
    }

    /**
     * Metodo para agregar un libro a la biblioteca.
     *
     * @param {Libro} libro.
     */

    public void agregarLibro(Libro libro) {
        if (libro != null && !listaLibros.contains(libro)) {
            listaLibros.add(libro);
            System.out.println("Libro agregado: " + libro.getTitulo());
        } else {
            System.out.println("El libro ya existe o es inválido.");
        }
    }

    /**
     * Metodo para buscar un libro en la base de datos por su titulo.
     *
     * @param {String} titulo.
     * @return {Collection<Libro>} lista de libros encontrados con ese titulo.
     */

    public Collection<Libro> buscarLibroPorTitulo(String titulo) {
        Collection<Libro> resultados = new LinkedList<>();

        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                resultados.add(libro);
            }
        }

        return resultados;
    }
    
}
