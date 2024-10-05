
package prueba.transportes;


public class datosTransportes {
String empresa;
String medio;
int costo;
int cantidadPersonas;
String duracion;

    public datosTransportes(String empresa, String medio, int costo, int cantidadPersonas, String duracion) {
        this.empresa = empresa;
        this.medio = medio;
        this.costo = costo;
        this.cantidadPersonas = cantidadPersonas;
        this.duracion = duracion;
    }

public void mostrarDetalles() {
        System.out.println("Empresa recomendada: " + empresa + " medio: " + medio + " costo: " + costo
                + " personas admitidas " + cantidadPersonas + " total meses: " + duracion);
}
}
