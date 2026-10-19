//Escribir un programa que pida al usuario tres números enteros, y que muestre por pantalla 
//el mayor de los 3. Supondremos que los tres números son distintos.

package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el 1 number");
		Integer num1 = sc.nextInt();
		System.out.println("Dime el 2 number");
		Integer num2 = sc.nextInt();
		System.out.println("Dime el 3 number");
		Integer num3 = sc.nextInt();
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1);
		}else if (num2 > num1 && num2 > num3 ) {
			System.out.println(num2);
		}else if (num3 > num1 && num3 > num1 ) {
			System.out.println(num3);
		}else {
			System.out.println("te jodes");
			
		}
		sc.close();
	}
}
