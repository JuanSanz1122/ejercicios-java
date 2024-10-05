
package prueba.libro;

import java.util.Scanner;

public class Libro {

    public static void main(String[] args) {
        datosLibro libro1 = new datosLibro ("como ser youtuber", "Gregf", 100);
        Scanner scanner = new Scanner (System.in);
        System.out.println("Desea leer, cerrar o ver detalles del libro");
        String deseo = scanner.next();
        switch (deseo){
            case "leer":
                libro1.leerPagina();
            break;
            case "cerrar":
                libro1.cerraLibro();
            break;
            case "ver detalles":
                libro1.mostrarDetalles();
            default: System.out.println("no es posible realizar lo que desea");
                    
        }
    }
}
