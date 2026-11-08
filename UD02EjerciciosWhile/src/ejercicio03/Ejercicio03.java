//Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir sumando.
//Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, 
//antes de acabar, mostrará la media de los números positivos introducidos por el usuario.

package ejercicio03;
import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Integer input = 0;
		Integer contador = 0;
		Integer total = 0;
		Integer resultado = 0;
		while (input >= 0) {
			System.out.println("dime un num");
			input = sc.nextInt();
			if (input >= 0) {
				total = input + total;
				contador++;
			}
		}
		
		System.out.println(resultado);
		sc.close();

	}

}
