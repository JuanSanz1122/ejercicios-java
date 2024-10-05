
package prueba.turismo;


public class datosTurismo {
String destino;
Double precio;
int personas;
String desayuno;
String tour;

    public datosTurismo(String destino, Double precio, int personas, String desayuno, String tour) {
        this.destino = destino;
        this.precio = precio;
        this.personas = personas;
        this.desayuno = desayuno;
        this.tour = tour;
    }

public void mostrarDetalles() {
        System.out.println("Detalles del paquete : destino:" + destino + ", precio: " + precio + ", personas admitidas: " + personas
                + ", incluye desayuno: " + desayuno + ", incluye tour: " + tour);
}

}
