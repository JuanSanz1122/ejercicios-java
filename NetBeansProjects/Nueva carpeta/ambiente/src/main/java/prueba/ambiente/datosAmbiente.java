
package prueba.ambiente;


public class datosAmbiente {
    String nombre;
    String apellido;
    int edad;
    int ficha;
    int identificacion;

    public datosAmbiente(String nombre, String apellido, int edad, int ficha, int identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ficha = ficha;
        this.identificacion = identificacion;
    }
    
     
    
    public void mostrarDetalles() {
        System.out.println("Detalles del aprendiz: nombre: " + nombre + " apellido: " + apellido + " edad: " + edad + 
                " ficha: " + ficha + " numero de identificacion: " + identificacion);
    }
}
