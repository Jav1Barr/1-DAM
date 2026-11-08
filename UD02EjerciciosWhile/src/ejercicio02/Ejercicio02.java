//Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir contando.
//Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, 
//antes de acabar, mostrará la cantidad de números positivos introducidos por el usuario.
package ejercicio02;
import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer input = 0;
		Integer contador = 0;
		while (input >= 0) {
			System.out.println("Dime un num");
			input = sc.nextInt();
			if (input >= 0 ) {
				contador++;
			}
		}
			System.out.println(contador);
		sc.close();

	}

}
