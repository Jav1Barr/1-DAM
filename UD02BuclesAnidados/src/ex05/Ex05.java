//Utiliza espacios iniciales para alinear los asteriscos a la derecha.
//Ejemplo de entrada: N = 5
//Salida esperada:
//    *
//   **
//  ***
// ****
//*****

package ex05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime N");
		Integer n = sc.nextInt();
		for (int f = 0; f < n; f++) {
			for (int c = 0; c < n; c++) {
				if (c < n - f - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println(" ");

		}

		sc.close();

	}

}
