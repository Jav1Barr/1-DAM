//Diseña una aplicación que pida una cantidad entera de segundos y la convierta en 
//horas, minutos y segundos. Para realizar la descomposición utiliza los operadores / y %.

package ejercicio02;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Integer secondsinput; 
		Integer seconds;
		Integer minutes;
		Integer hours;
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime una cantidad de segundos");
		secondsinput = sc.nextInt();
		hours = secondsinput / 3600;
		seconds  = secondsinput % 3600;
		minutes = seconds / 60; 
		seconds = seconds % 60;
		System.out.println("Las horas son "+hours + " los minutos son "+minutes+ " y los segundos son "+ seconds);
		sc.close();
	}

}
