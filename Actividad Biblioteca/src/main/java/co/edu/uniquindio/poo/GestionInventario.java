package co.edu.uniquindio.poo;

//Implementacion SOLID en la clase:
//
//-Segregacion de interfaces, la interfaz define comportamientos especificos y unicos para que
//Bibliotecario los implemente, asegurando que implemente solo lo que se necesite

public interface GestionInventario {

    public void gestionarInventario(Biblioteca biblioteca);

    public void agregarItem(ItemBiblioteca item);

    public void eliminarItem(ItemBiblioteca item);
}
