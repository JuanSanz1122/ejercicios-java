
package prueba.autos;


public class auto {
    String marca;
    String modelo;
    int año;

    public auto(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    public void frenar() {
        System.out.println("El auto frena");
    }
    public void acelera() {
        System.out.println("El auto acelera");
    }
    public void mostrarDatos() {
        System.out.println("Datos del vehiculo: marca " + marca + " modelo " + modelo + " año " + año );
    }
}
