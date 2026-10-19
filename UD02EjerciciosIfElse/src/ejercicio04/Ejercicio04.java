//Implementar un programa que pida por teclado un número decimal e indique si es 
//un número casi-cero, que son aquellos, positivos o negativos, que se acercan a 0 
//por menos de 1 unidad, aunque curiosamente el 0 no se considera un número casi-cero. 
//Es decir, un número casi-cero es el que se encuentra en el intervalo (-1, 1), donde se excluye el -1, el 0 y el 1.

package ejercicio04;
import java.util.Scanner;
public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double input; 
		System.out.println("dime un number decimal");
		input = sc.nextDouble();
		if (input <=0.9 && input >= -0.9 && input != 0) {
			System.out.println("es casi cero");
		}else   {
			System.out.println("no es casi cero");
		}
		
		sc.close();

	}

}
