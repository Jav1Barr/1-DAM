//Escribe un algoritmo para sumar dos tiradas de un dado de seis caras que tiraría el usuario. El algoritmo pregunta al usuario 
//cuánto ha sacado en la primera tirada y el usuario le dará esa información pero en formato cadena (“UNO”, “DOS” … “SEIS”).
//Después el algoritmo volverá a preguntar al usuario cuánto ha sacado en la segunda tirada y el usuario también dará 
//esa información en formato cadena.
//Por último, el algoritmo mostrará por pantalla la suma de las dos tiradas en formato numérico.
package ejercicio04;
import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el resultado de la primera tirada");
		String inputA = sc.next();
		System.out.println("Dime el resultado de la segunda tirada");
		String inputB = sc.next();
		switch (inputA) {
		case "UNO":
			Integer numA = 1;
			System.out.println(numA);
			break;

		default:
			break;
		}
		sc.close();
	}
}
