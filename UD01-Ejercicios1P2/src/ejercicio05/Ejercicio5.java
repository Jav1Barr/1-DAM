//Diseña una aplicación que solicite al usuario que introduzca 
//una cantidad de segundos. La aplicación debe mostrar cuántas horas, 
//minutos y segundos hay en el número de segundos introducidos por el usuario.
package ejercicio05;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer hour, minutes, seconds, inputUser;
		System.out.println("Dime una cantidad de segundos");
		inputUser = sc.nextInt();
		hour = inputUser / 3600;
		minutes = (inputUser % 3600) / 60;
		seconds = (inputUser % 3600) % 60;
		System.out.println("Son "+hour+" horas "+minutes+" minutos "+seconds+" Segudos");
		
		sc.close();
	}

}
