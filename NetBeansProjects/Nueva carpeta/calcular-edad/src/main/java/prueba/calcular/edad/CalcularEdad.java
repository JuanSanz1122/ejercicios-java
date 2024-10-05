

package prueba.calcular.edad;

import java.util.Scanner;

public class CalcularEdad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println(" Digite su año de nacimiento ");
        int num = scanner.nextInt();
        System.out.println(" Digite el año actual ");
        int num2 = scanner.nextInt();
        int edad = num2 - num;
        System.out.println("su edad es : " + edad);
    }
}
