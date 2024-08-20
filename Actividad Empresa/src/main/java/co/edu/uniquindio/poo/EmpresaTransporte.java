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

    /**
     * Metodo para obtener el numero de usuarios de un vehiculo de transporte por la placa.
     *
     * @param {string} placa.
     * @returns {Object} - numero de usuarios por vehiculo.
     */

    public int obtenerNumeroUsuariosPorVehiculo(String placa) {
        for (VehiculoTransporte vehiculo : vehiculosTransporte) {
            if (vehiculo.getPlaca().equalsIgnoreCase(placa)) { //EqualsIgnoreCase solo va a comparar
                return vehiculo.getUsuarios().size();          //el contenido textual de los string, ignora mayus. y minusculas
            }
        }
        return 0; // Si no se encuentra el vehículo con la placa ingresada
    }

    /**
     * Metodo para obtener el número de usuarios que son mayores de 40 años.
     * @return int - El número de usuarios mayores de 40 años.
     */

    public int obtenerNumeroUsuariosMayoresDe40() {
        int contador = 0;

        // Recorrer la colección de usuarios
        for (Usuario usuario : usuarios) {
            // Verificar si la edad del usuario es mayor de 40
            if (usuario.getEdad() > 40) {
                contador++;
            }
        }

        return contador;
    }
    
    /**
     * Metodo para obtener el numero de usuarios que se encuentran en un determinado rango de edad
     * @param edadMin
     * @param edadMax
     * @return
     */
    public int contarUsuariosEnRangoDeEdad(int edadMin, int edadMax) {
        int contador = 0;
        
        for (Usuario usuario : usuarios) {
            if (usuario.getEdad() >= edadMin && usuario.getEdad() <= edadMax) {
                contador++;
            }
        }
         return contador;
    }
}
