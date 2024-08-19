package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Propietario {

    String nombre;
    String cedula;
    String email;
    String telefono;
    Vehiculo vehiculoAsociado;
    public Collection<Vehiculo> vehiculosAsociados;

    public Propietario(String nombre, String cedula, String email, String telefono, Vehiculo vehiculoAsociado) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.telefono = telefono;
        this.vehiculoAsociado = vehiculoAsociado;
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

    public Vehiculo getVehiculoAsociado() {
        return vehiculoAsociado;
    }

    public void setVehiculoAsociado(Vehiculo vehiculoAsociado) {
        this.vehiculoAsociado = vehiculoAsociado;
    }

    public void asociarVehiculo_Propietario(Vehiculo vehiculo) {
        this.vehiculoAsociado = vehiculo;
        this.vehiculosAsociados.add(vehiculo);
        vehiculo.setPropietarioAsociado(this);
    }
}
