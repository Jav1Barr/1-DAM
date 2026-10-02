//Un depósito contiene una cantidad de litros de agua y se quiere llenar botellas de una 
//capacidad determinada. Solicita ambos valores y calcula cuántas botellas completas pueden
//llenarse utilizando Math.floor().

package ejercicio09;
import java.util.Scanner;
import java.math.*;
public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Integer numliters;
		Integer numbottleliters;
		Integer totalBottles;
		System.out.println("Cuantos litros en total son");
		numliters = sc.nextInt();
		System.out.println("Dime cuanto entra en cada botella");
		numbottleliters = sc.nextInt();
		totalBottles = (int) Math.floor((double) numliters / numbottleliters);
		System.out.println(totalBottles);
		sc.close();
	}
	

}
