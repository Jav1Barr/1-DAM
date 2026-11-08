//Escribe un algoritmo que pida al usuario 10 números enteros 
//(pueden ser positivos, negativos o cero). Cuando acabe de insertar los 
//números, el algoritmo debe mostrar la suma de los números positivos, 
//la media de los números negativos y el número de ceros que ha introducido el usuario.

package ejercicio04;
import java.util.Scanner;
public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Integer input =0;
		Integer sumaTotal = 0;
		Integer mediaNegativos = 0;
		Integer contador = 0, contadorCeros = 0;
		Integer i = 0;
		while (i <= 10) {
			System.out.println("Dime un num, Nº "+ i);
			input = sc.nextInt();
			if (input > 0) {
				sumaTotal += input;
			} else if (input == 0) {
				contadorCeros++;
			} else if(input < 0) {
				mediaNegativos += input;
				contador++;
			}
			i++;
		}
		Integer negativosResultado = mediaNegativos/contador;
		System.out.println("la suma total de los positivos es " +sumaTotal);
		System.out.println("el numero de 0 es "+ contadorCeros);
		System.out.println("Y la media de los negativos es "+ negativosResultado);
		sc.close();

	}

}
