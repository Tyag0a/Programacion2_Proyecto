package co.edu.uniquindio.poo;

public class Usuario {

    String nombre;
    int edad;
    double peso;
    VehiculoTransporte VehiculoTransporteAsociado;

    public Usuario(String nombre, int edad,double peso, VehiculoTransporte VehiculoTransporteAsociado) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.VehiculoTransporteAsociado = VehiculoTransporteAsociado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public VehiculoTransporte getVehiculoTransporteAsociado() {
        return VehiculoTransporteAsociado;
    }

    public void setVehiculoTransporteAsociado(VehiculoTransporte vehiculoTransporteAsociado) {
        VehiculoTransporteAsociado = vehiculoTransporteAsociado;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
