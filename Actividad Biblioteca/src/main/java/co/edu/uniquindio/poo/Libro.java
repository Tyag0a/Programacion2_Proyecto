package co.edu.uniquindio.poo;

public class Libro extends ItemBiblioteca {

    String isbn;


    public Libro(String titulo, String autor, int codigoItem,  EstadoItem estado, String isbn) {
        super(titulo, autor, codigoItem, estado);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
