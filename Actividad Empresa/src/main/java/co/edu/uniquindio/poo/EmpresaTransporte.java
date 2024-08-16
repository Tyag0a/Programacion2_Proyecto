package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class EmpresaTransporte {

    public Collection<Propietario> propietarios;
    public Collection <VehiculoTransporte> vehiculosTransporte;
    public Collection <VehiculoCarga> vehiculosCarga;
    public Collection <Usuario> usuarios;

    public EmpresaTransporte() {
        this.propietarios = new LinkedList<>();
        this.vehiculosTransporte = new LinkedList<>();
        this.vehiculosCarga = new LinkedList<>();
        this.usuarios = new LinkedList<>();

    }

    public Collection<VehiculoTransporte> getVehiculosTransporte() {
        return vehiculosTransporte;
    }

    public Collection<VehiculoCarga> getVehiculosCarga() {
        return vehiculosCarga;
    }

    public Collection<Propietario> getPropietarios() {
        return propietarios;
    }

    public Collection<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setPropietarios(Collection<Propietario> propietarios) {
        this.propietarios = propietarios;
    }

    public void setUsuarios(Collection<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void setVehiculosCarga(Collection<VehiculoCarga> vehiculosCarga) {
        this.vehiculosCarga = vehiculosCarga;
    }

    public void setVehiculosTransporte(Collection<VehiculoTransporte> vehiculosTransporte) {
        this.vehiculosTransporte = vehiculosTransporte;
    }
}
