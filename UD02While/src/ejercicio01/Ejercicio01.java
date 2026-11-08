package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Integer suma = 0;
		Integer input = 0;
		Scanner sc = new Scanner(System.in);
		while (input >= 0) {
			System.out.println("Dime un num");
			input = sc.nextInt();
			if (input >= 0) {
				suma = suma + input;}

		}

		System.out.println("La suma es " + suma);

		sc.close();
	}

}
