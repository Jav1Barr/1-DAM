//3. Pedir diez números por teclado y mostrar la media.
package ejercicio03;
import java.util.Scanner;
import java.math.*;
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int input1 = 0;
		int input2 = 0;
		int input3 = 0;
		System.out.println("Dime 3 números enteros");
		input1 = sc.nextInt();
		input2 = sc.nextInt();
		input3 = sc.nextInt();
		Double media = (double)(input1+input2+input3)/3;
		System.out.println(Math.round(media*100)/100.0);
		sc.close();
	}

}
