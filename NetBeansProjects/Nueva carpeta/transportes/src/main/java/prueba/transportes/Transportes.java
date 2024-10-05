

package prueba.transportes;

import java.util.Scanner;

public class Transportes {

    public static void main(String[] args) {
        datosTransportes transporte1 = new datosTransportes("avianca", "aereo", 800000, 5, "8 horas");
        datosTransportes transporte2 = new datosTransportes("velotax", "terrestre", 200000, 2, "24 horas");
        datosTransportes transporte3 = new datosTransportes("corturismo", "acuatico", 300000, 3, "36 horas");
        Scanner scanner = new Scanner (System.in);
        System.out.println(" ¿Por que medio te gustaria viajar? ");
        String medio = scanner.next();
        
        switch (medio){
            case "aereo":
                transporte1.mostrarDetalles();
                break;
            case "terrestre":
                transporte2.mostrarDetalles();
                break;
            case "acuatico":
                transporte3.mostrarDetalles();
                break;
            default:System.out.println(" no es posible viajar por ese medio ");
        }
    }
}
