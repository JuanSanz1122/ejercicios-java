
package prueba.mayor.menor;

import java.util.Scanner;

public class MayorMenor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println(" Digite su edad ");
        int num = scanner.nextInt();
        if (num >= 18) { 
            System.out.print("eres mayor de edad");}
           else {
                System.out.print("eres menor de edad");}
           }
    }

