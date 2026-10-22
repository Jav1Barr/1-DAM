//Dibuja una pirámide de N niveles. 
//Ejemplo de entrada: N = 5
//Salida esperada:
//    *
//   ***
//  *****
// *******
//*********

package ex07;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime N");
		Integer n = sc.nextInt();
		for (int f = 0; f < n; f++) {
			for (int c = 0; c < n*2-1; c++) {
				if (c >= n - 1 - f && c <= n - 1 + f) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		
		sc.close();
	}

}
