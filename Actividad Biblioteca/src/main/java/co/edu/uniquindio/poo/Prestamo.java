package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;

//Implementacion SOLID en la clase:
//
//-Responsabilidad unica, relacionar un miembro y un libro, ademas encapsular la informacion
//del prestamo.

public class Prestamo {

    LocalDate fechaPrestamo;
    LocalDate fechaDevolucion;
    Libro libroPrestamo;
    Miembro miembroPrestamo;

    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion, Libro libroPrestamo, Miembro miembroPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.libroPrestamo = libroPrestamo;
        this.miembroPrestamo = miembroPrestamo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibroPrestamo() {
        return libroPrestamo;
    }

    public void setLibroPrestamo(Libro libroPrestamo) {
        this.libroPrestamo = libroPrestamo;
    }

    public Miembro getMiembroPrestamo() {
        return miembroPrestamo;
    }

    public void setMiembroPrestamo(Miembro miembroPrestamo) {
        this.miembroPrestamo = miembroPrestamo;
    }
}
