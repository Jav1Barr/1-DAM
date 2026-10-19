//Realiza un programa que pida dos números enteros A y B. Luego visualiza los
//números que hay entre A y B. Si A es menor que B, entonces debe mostrar los
//números desde A hasta B. Si B es menor que A, entonces debe mostrar los números
//desde B hasta A.
package ejercicio08;
import java.util.Scanner;
public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime el número A");
		Integer inputA = sc.nextInt();
		System.out.println("Dime el número B");
		Integer inputB = sc.nextInt();
		if (inputA > inputB) {
			for (int i = inputB; i <= inputA; i++) {
				System.out.println(i);
				
			}
		} else if (inputB > inputA) {
			for (int n = inputA; n <= inputB; n++) {
				System.out.println(n);
			}
		} else {
			System.out.println("A y B son iguales");
		}
		sc.close();
	}

}
