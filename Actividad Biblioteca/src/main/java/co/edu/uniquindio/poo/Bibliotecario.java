package co.edu.uniquindio.poo;

public class Bibliotecario extends Empleado implements GestionInventario{

    public Bibliotecario(String nombre, String apellido, int identificacion) {
        super(nombre, apellido, identificacion);
    }

    @Override
    public void gestionarInventario() {

    }
}
