//Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma: 
//insuficiente (de 0 a 4), suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10).

package ejercicio01;
import java.util.Scanner;
public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una nota");
		Integer nota = sc.nextInt();
		switch (nota) {
		case 0, 1 ,2 ,3 , 4 :
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7, 8:
			System.out.println("Notable");
			break;
		case 9, 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("No es una nota valida");
			break;
		}
		
		sc.close();

	}

}
