package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
			int edad;
			Scanner sc = new Scanner (System.in);
				System.out.println("Diga su edad");
				edad = sc.nextInt();
				boolean mayor = edad >= 18;
				if (mayor == true ) {
					System.out.println("Eres mayor de edad");
					
				}
				else {
					System.out.println("No eres mayor de edad");
				}
					
				sc.close();
	}

}
