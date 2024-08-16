package co.edu.uniquindio.poo;

public class VehiculoCarga extends Vehiculo {

    double capacidad;
    int nEjes;

    public VehiculoCarga (String marca, String modelo, String placa, String color, double capacidad, int nEjes, Propietario propietario) {
        super(marca, modelo, placa, color, propietario);
    }

    public double getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    public int getnEjes() {
        return nEjes;
    }
    public void setnEjes(int nEjes) {
        this.nEjes = nEjes;
    }
}
