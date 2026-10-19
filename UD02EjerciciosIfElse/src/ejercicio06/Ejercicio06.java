//Escribir una aplicación que indique cuántas cifras tiene un número introducido 
//por teclado, que está comprendido entre 0 y 99999. 
package ejercicio06;
import java.util.Scanner;
public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("dime un num entre 0 y 99999");
		Integer input = sc.nextInt();
		if (input >= 0 && input <= 99999) {
			if (input < 10) {
				System.out.println("Tiene 1 cifra");
			} else if (input <100) {
				System.out.println("Tiene 2 cifras");
			} else if (input < 1000) {
				System.out.println("Tiene 3 cifras");
			}else if (input < 10000) {
				System.out.println("tiene 4 cifras");
			}else {
				System.out.println("TIene 5 cifras");
			}
		} else {
			System.out.println("No esta en el rango");
		}
		sc.close();
	}

}
