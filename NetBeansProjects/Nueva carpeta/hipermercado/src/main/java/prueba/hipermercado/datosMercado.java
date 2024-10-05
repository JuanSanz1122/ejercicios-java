
package prueba.hipermercado;


public class datosMercado {
    int ean;
    String nombre;
    String marca;
    String color;
    Double precio;

    public datosMercado(int ean, String nombre, String marca, String color, Double precio) {
        this.ean = ean;
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }
    
    public void mostrarDetalles() {
        System.out.println("Detalles del producto : ean:" + ean + ", nombre: " + nombre + ", marca: " + marca
                + ", color: " + color + ", precio: " + color);
        
}
}
