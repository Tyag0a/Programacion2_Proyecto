package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class VehiculoTransporte extends Vehiculo {

    int maxPasajeros;
    public Collection<Usuario> usuarios;
    Usuario usuario;

    public VehiculoTransporte(String marca, String modelo, String placa, String color, int maxPasajeros, Propietario propietario, Usuario usuario) {
        super(marca, modelo, placa, color, propietario);
        this.maxPasajeros = maxPasajeros;
        this.usuarios = new LinkedList<>();
        this.usuario = usuario;
    }
    public int getMaxPasajeros(){
        return maxPasajeros;
    }
    public void setMaxPasajeros(int maxPasajeros){
        this.maxPasajeros = maxPasajeros;
    }
}
