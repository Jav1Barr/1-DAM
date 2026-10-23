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
		Integer numA = 0, numB = 0;
		System.out.println("Dime el numero del dado en texto");
		String inputA = sc.next();
		System.out.println("Dime el numero del dado en texto");
		String inputB = sc.next();
		switch (inputA) {
		case "uno":
			 numA = 1;
			break;
		case "dos":
			 numA = 2;
			break;
		case "tres":
			 numA = 3;
			break;
		case "cuatro":
			 numA = 4;
			break;
		case "cinco":
			 numA = 5;
			break;
		case "seis":
			 numA = 6;
			break;
		default:
			System.out.println("No valido");
			break;
		}
		
		switch (inputB) {
		case "uno":
			 numB = 1;
			break;
		case "dos":
			 numB = 2;
			break;
		case "tres":
			 numB = 3;
			break;
		case "cuatro":
			 numB = 4;
			break;
		case "cinco":
			 numB = 5;
			break;
		case "seis":
			 numB = 6;
			break;
		default:
			System.out.println("No valido");
			break;
		}
		Integer sumaTotal = numA + numB;
		System.out.println(sumaTotal);
		sc.close();
	}
}
