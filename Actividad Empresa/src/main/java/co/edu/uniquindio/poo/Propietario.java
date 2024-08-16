package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Propietario {

    String nombre;
    String cedula;
    String email;
    String telefono;
    Vehiculo vehiculo;
    public Collection<Vehiculo> vehiculosAsociados;

    public Propietario(String nombre, String cedula, String email, String telefono, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.telefono = telefono;
        this.vehiculo = vehiculo;
        this.vehiculosAsociados = new LinkedList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Collection <Vehiculo> getVehiculosAsociados() {
        return vehiculosAsociados;
    }
    public void setVehiculosAsociados(Collection <Vehiculo> vehiculos) {
        this.vehiculosAsociados = vehiculos;
    }
}
