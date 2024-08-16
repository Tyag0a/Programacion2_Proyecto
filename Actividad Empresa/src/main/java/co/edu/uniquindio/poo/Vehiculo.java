package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Vehiculo {

    String marca;
    String modelo;
    String placa;
    String color;
    Propietario propietario;
    public Collection<Propietario> propietarios;

    public Vehiculo(String marca, String modelo, String placa, String color, Propietario propietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.propietario = propietario;
        this.propietarios = new LinkedList<>();

    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
