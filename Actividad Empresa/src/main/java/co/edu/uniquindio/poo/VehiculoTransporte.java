package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class VehiculoTransporte extends Vehiculo {

    int maxPasajeros;
    public Collection<Usuario> usuarios;
    Usuario usuarioAsociado;

    public VehiculoTransporte(String marca, String modelo, String placa, String color, int maxPasajeros, Propietario propietario, Usuario usuarioAsociado) {
        super(marca, modelo, placa, color, propietario);
        this.maxPasajeros = maxPasajeros;
        this.usuarios = new LinkedList<>();
        this.usuarioAsociado = usuarioAsociado;
    }
    public int getMaxPasajeros(){
        return maxPasajeros;
    }
    public void setMaxPasajeros(int maxPasajeros){
        this.maxPasajeros = maxPasajeros;
    }

    public Collection<Propietario> getPropietarios() {
        return super.getPropietarios();
    }

    public Collection<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setPropietarios(Collection<Propietario> propietarios) {
        super.setPropietarios(propietarios);
    }
    public Propietario getPropietarioAsociado() {
        return super.getPropietarioAsociado();
    }

    public void setPropietarioAsociado(Propietario propietario) {
        super.setPropietarioAsociado(propietario);
    }

    public void setUsuarios(Collection<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
