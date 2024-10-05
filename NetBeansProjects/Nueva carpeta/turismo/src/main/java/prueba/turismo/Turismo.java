
package prueba.turismo;

import java.util.Scanner;

public class Turismo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        datosTurismo paquete1 = new datosTurismo("mexico", 999.999, 2, "si", "si");
        datosTurismo paquete2 = new datosTurismo("canada", 899.999, 1, "si", "no");
        datosTurismo paquete3 = new datosTurismo("panama", 799.999, 1, "si", "si");
        datosTurismo paquete4 = new datosTurismo("peru", 699.999, 2, "no", "no");
        System.out.println(" ----BIENVENIDO A DESPEGAR---- ");
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" ----¿Que paquete desea consultar---- ");
        String medio = scanner.next();
        try {
            Thread.sleep(2000); // 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Buscando paquete: " + medio);
        try {
            Thread.sleep(2000); // 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        switch (medio){
            case "1":
                paquete1.mostrarDetalles();
                break;
            case "2":
                paquete2.mostrarDetalles();
                break;
            case "3":
                paquete3.mostrarDetalles();
                break;
            case "4":
                paquete4.mostrarDetalles();
                break;
            default:System.out.println(" no es posible viajar por ese medio ");
        }
    }
}
