//4. Diseñar un programa que muestre la suma de los 10 primeros números impares
package ejercicio04;

public class Ejercicio04 {

	public static void main(String[] args) {
		Integer sumaTotal = 0;
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0 ) {
				sumaTotal += i;	
				}
		}
		System.out.println("La suma total es "+sumaTotal);
	}

}
