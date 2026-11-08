//Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
package ejercicio02;

public class Ejercicio02 {

	public static void main(String[] args) {
		Integer pares = 0;
		do {
			if (pares % 2 == 0) {
				System.out.println(pares);
			}
			pares++;
		} while (pares <= 200);
	}

}
