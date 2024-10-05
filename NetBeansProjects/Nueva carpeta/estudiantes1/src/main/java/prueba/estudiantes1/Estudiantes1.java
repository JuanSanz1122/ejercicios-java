/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prueba.estudiantes1;

/**
 *
 * @author juans
 */
public class Estudiantes1 {

    public static void main(String[] args) {
        datosEstudiantes estudiante1 = new datosEstudiantes("juan", 2019, 4.5);
        double nota = 4.5;
        estudiante1.mostrarDetalles();
        if (nota >= 5) { 
            estudiante1.aprobo();}
           else {
                estudiante1.reprobo();}
           }
  
}
