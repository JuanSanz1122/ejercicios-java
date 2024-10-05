
package prueba.libro;

public class datosLibro {
    String titulo;
    String autor;
    int numeroPaginas;

    public datosLibro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    public void leerPagina() {
        System.out.println("Leyendo pagina 1");
    }
    public void cerraLibro() {
        System.out.println("El libro esta cerrado");
    }
    public void mostrarDetalles() {
        System.out.println("Detalles del libro: titulo " + titulo + " autor: " + " numero de paginas");
    }
}
