
package prueba.cuentabancaria;

import java.util.Scanner;

public class CuentaBancaria {

    public static void main(String[] args) {
        datosbanco cuenta1 = new datosbanco("Juan Sanz", 20000);
        Scanner scanner = new Scanner (System.in);
        int saldo = 20000;
        System.out.print("¿Desea retirar, depositar o consultar saldo?");
        String deseo = scanner.next();
        switch(deseo){
            case "retirar":
                System.out.print("¿Cuanto desea retira?");
                int ret = scanner.nextInt();
                System.out.print("Saldo actual: " + (saldo-ret));
                cuenta1.setSaldo(saldo);
            break;
            case "depositar":
                System.out.print("¿Cuanto desea depositar?");
                int dep = scanner.nextInt();   
                System.out.print("Saldo actual: " + (saldo+dep));
                cuenta1.setSaldo(saldo);
            break;
            case "consultar saldo":
                System.out.print(saldo);
            break;
            default: 
                cuenta1.mostrarSaldo();
        }
    }
}
