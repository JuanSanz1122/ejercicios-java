

package prueba.hipermercado;

import java.util.Scanner;

public class Hipermercado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        datosMercado producto1 = new datosMercado(0001, "mouse", "logitech", "azul", 70.000);
        datosMercado producto2 = new datosMercado(0002, "teclado", "seisa", "negro", 40.000);
        datosMercado producto3 = new datosMercado(0003, "pantalla", "samnsung", "negro", 790.000);
        datosMercado producto4 = new datosMercado(0004, "nevera", "lg", "girs", 990.000);
        System.out.println(" ----BIENVENIDO A TIENDAS EXITO---- ");
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
        System.out.println("Buscando paquete: " + ean);
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
