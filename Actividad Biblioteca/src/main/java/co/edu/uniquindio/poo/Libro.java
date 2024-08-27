package co.edu.uniquindio.poo;

//Implementacion SOLID en la clase:
//
//-Principio de responsabilidad unica, Solo es su responsabilidad encapsular sus atributos y
// comportamientos propios, no recibir metodos como agregarLibro ya que no es lo que hace un libro.
//
//-Sustitucion de Liskov: cumple con LSP ya que hereda de ItemBiblioteca y
// puede ser utilizado donde se espera un ItemBiblioteca

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
