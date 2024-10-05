
package prueba.multiplicar;

import java.util.Scanner;

public class Multiplicar {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);    
    System.out.println(" Dogita la tabla que quieres consultar ");
    int numero = scanner.nextInt();
    
    System.out.println("tabl del " + numero + ":");
    for( int i =1; i <= 10; i++){
        System.out.println(numero + " x " + i + " = " + (numero * i));
    }
  }
}
