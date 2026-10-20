//Idear un programa que solicite al usuario un número comprendido entre 1 y 7, 
//correspondiente a un día de la semana. Se debe mostrar el nombre del día de la 
//semana al que corresponde. Por ejemplo, el número 1 corresponde a “Lunes” y el 6 a “Sábado”.

package ejercicio02;
import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero de 1 a 7");
		Integer numDiaSemana = sc.nextInt();
		switch (numDiaSemana) {
		case 1:
			System.out.println("Es lunes");
			break;
		case 2:
			System.out.println("Es Martes");
			break;
		case 3:
			System.out.println("Es Miercoles");
			break;
		case 4:
			System.out.println("Es Jueves");
			break;
		case 5:
			System.out.println("Es Viernes");
			break;
		case 6:
			System.out.println("Es Sabado");
			break;
		case 7:
			System.out.println("Es Domingo");
			break;

		default:
			System.out.println("No es un numero valido");
			break;
		}
		
		sc.close();

	}

}
