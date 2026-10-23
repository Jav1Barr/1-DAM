//Ejemplo de entrada: N = 5
//Salida esperada:
//*********
// *******
//  *****
//   ***
//    *

package ex08;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime n");
		Integer n = sc.nextInt();
		for (int f = 0; f < n; f++) {
			for (int c = 0; c < n*2-1; c++) {
				if (c < f) {
					System.out.print(" ");
				} else if (c < 2 * n - 1 - f) {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}

		sc.close();

	}

}
