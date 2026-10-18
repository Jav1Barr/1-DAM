//Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se denota 5! y
//es igual a 5x4x3x2x1 = 120.
package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Integer inputNum = 0;
		Integer total = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número");
		inputNum = sc.nextInt();
		for (int i = 1; i <= inputNum; i++) {
			total *= i;

		}
		System.out.println("El factorial es "+ total);
		sc.close();
	}

}
