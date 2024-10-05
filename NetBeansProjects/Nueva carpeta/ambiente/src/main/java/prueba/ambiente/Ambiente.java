

package prueba.ambiente;

import java.util.Scanner;

public class Ambiente {

    public static void main(String[] args) {
        datosAmbiente aprendiz1 = new datosAmbiente("juan", "sanz", 18, 292201, 1010176830);
        datosAmbiente aprendiz2 = new datosAmbiente("brayan", "reyes", 17, 2922016, 1029985396);
        Scanner scanner = new Scanner (System.in);
        System.out.println("¿que aprendiz desea investigar 1 o 2?");
        String deseo = scanner.next();
        switch(deseo){
            case "1":
                aprendiz1.mostrarDetalles();
                break;
            case "2":
                aprendiz2.mostrarDetalles();
                break;
            default:
                System.out.println("no hay aprendiz con ese numero");
        }
        
    }
}
