
package prueba.xbox;


public class datosXbox {
    int ean;
    String nombre;
    String lote;
    String color;
    Double precio;

    public datosXbox(int ean, String nombre, String lote, String color, Double precio) {
        this.ean = ean;
        this.nombre = nombre;
        this.lote = lote;
        this.color = color;
        this.precio = precio;
    }
    
    public void mostrarDetalles() {
        System.out.println("Detalles del producto : ean:" + ean + ", nombre: " + nombre + ", lote: " + lote
                + ", color: " + color + ", precio: " + color);
}
}