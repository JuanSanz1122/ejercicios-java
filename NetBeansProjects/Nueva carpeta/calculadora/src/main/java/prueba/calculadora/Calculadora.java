
package prueba.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("digite el primer numero");
    int num1= scanner.nextInt();
    System.out.println("digite su segundo numero");
    int num2= scanner.nextInt();
    System.out.println(" desea sumar, restar, multiplicar o dividir ");
    String op = scanner.next();
    switch (op){
        case "sumar":
            System.out.print("El resultado es: " + (num1 + num2));
            break;
        case "restar":
            System.out.print("El resultado es: " + (num1 - num2));
            break;
        case "multiplicar":
            System.out.print("El resultado es: " + (num1 * num2));
            break;
        case "dividir":
            System.out.print("El resultado es: " + (num1 + num2));
            break;
        default: System.out.print("no es posible realizar la operacion"); 
                    
        
    }
  }
}

