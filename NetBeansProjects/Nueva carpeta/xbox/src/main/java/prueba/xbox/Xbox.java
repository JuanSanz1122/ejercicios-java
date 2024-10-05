
package prueba.xbox;

import java.util.Scanner;

public class Xbox {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        datosXbox producto1 = new datosXbox(0001, "xbox clasico", "01xb23", "negro", 400.000);
        datosXbox producto2 = new datosXbox(0002, "xbox 360", "01xb45", "negro", 600.000);
        datosXbox producto3 = new datosXbox(0003, "xbox one", "04hb45", "negro", 800.000);
        datosXbox producto4 = new datosXbox(0004, "xbox series", "01hdfg45", "negro", 999.999);
        System.out.println(" ----BIENVENIDO A XBOX---- ");
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" ----Busca el ean de el productos que desea consultar---- ");
        String ean = scanner.next();
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Buscando producto con EAN: " + ean);
        try {
            Thread.sleep(2000); // 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        switch (ean){
            case "0001":
                producto1.mostrarDetalles();
                break;
            case "0002":
                producto2.mostrarDetalles();
                break;
            case "0003":
                producto3.mostrarDetalles();
                break;
            case "0004":
                producto4.mostrarDetalles();
                break;
            default:System.out.println(" no hay producto con ese EAN ");
        }
    }
}


