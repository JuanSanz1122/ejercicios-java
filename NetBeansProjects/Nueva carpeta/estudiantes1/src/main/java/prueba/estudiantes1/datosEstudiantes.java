
package prueba.estudiantes1;


public class datosEstudiantes {
    String nombre;
    int matricula;
    double nota;

    public datosEstudiantes(String nombre, int matricula, double nota) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.nota = nota;
    }
    
    public void aprobo() {
        System.out.println("Aprobo");
    }
    public void reprobo() {
        System.out.println("reprobo");
    }
    public void mostrarDetalles() {
        System.out.println("Detalles del estudiante: nombre: " + nombre + " matrcicula: " + matricula + " nota: " + nota);
    }
}
