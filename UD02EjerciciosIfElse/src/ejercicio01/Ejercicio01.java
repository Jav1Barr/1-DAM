//Diseñar una aplicación que solicite al usuario un número e indique si es par o impar.

package ejercicio01;
import java.util.Scanner;
public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime un number");
		Integer input = sc.nextInt();
		if (input % 2 == 0 ) {
			System.out.println("Es par");
			
		}else if (input % 2 != 0 ) {
			System.out.println("No es par ");
			
		}else {
			System.out.println("q cojones?");
		}
		
		sc.close();
		
	}

}
