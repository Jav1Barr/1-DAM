//Escribir una aplicación para aprender a contar, 
//que pedirá un número n y mostrará todos los números del 1 al n.
package ejercicio01;
import java.util.Scanner;
public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Integer num = 0;
		System.out.println("di un num");
		num = sc.nextInt();
		int i;
		for ( i = 1; i <= num; i++) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
