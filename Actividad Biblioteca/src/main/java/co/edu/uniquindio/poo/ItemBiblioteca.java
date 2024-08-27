package co.edu.uniquindio.poo;

//Implementacion SOLID en la clase:
//
//-Sustitucion de Liskov: con esta clase y su heredera, Libro, permite que el sistema funcione
// aunque se sustituya la clase padre-hijo, Ej: en la interfaz GestionInventario y en registrarPrestamo

public class ItemBiblioteca {

    String titulo;
    String autor;
    int codigoItem;
    EstadoItem estado;

    public ItemBiblioteca(String titulo, String autor, int codigoItem, EstadoItem estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigoItem = codigoItem;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public EstadoItem getEstado() {
        return estado;
    }

    public void setEstado(EstadoItem estado) {
        this.estado = estado;
    }


}
