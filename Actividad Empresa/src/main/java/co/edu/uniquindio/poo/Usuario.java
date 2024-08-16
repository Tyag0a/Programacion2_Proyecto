package co.edu.uniquindio.poo;

public class Usuario {

    String nombre;
    String edad;
    VehiculoTransporte VehiculoTransporte;

    public Usuario(String nombre, String edad, VehiculoTransporte VehiculoTransporte) {
        this.nombre = nombre;
        this.edad = edad;
        this.VehiculoTransporte = VehiculoTransporte;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEdad() {
        return edad;
    }
}
