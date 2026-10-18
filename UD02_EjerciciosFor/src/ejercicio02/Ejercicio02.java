//Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un 
//número que introducimos por teclado
package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Integer input = 0;
		Integer cuentaVeces = 0;
		input = sc.nextInt();
		for (int i = 1; i<= input; i++) {
			if (i % 3 == 0) {
				cuentaVeces+= 3;
				System.out.println(cuentaVeces);

			}
			
		}
		sc.close();
	}
}
