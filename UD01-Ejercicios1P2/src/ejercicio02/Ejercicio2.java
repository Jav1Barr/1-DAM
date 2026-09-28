//Escribe un programa que tome como entrada un número entero e indique qué cantidad 
//hay que sumarle para que sea múltiplo de 7. Por ejemplo, a 2 hay que sumarle 5 
//para que sea múltiplo de 7. En el caso de 13 habría que sumarle 1. Usa el operador módulo (%) para calcularlo.


package ejercicio02;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num, veces = 0;
		System.out.println("dime un número entero");
		num = sc.nextInt();
		while (num % 7 != 0) {
			num++;
			veces++;
		}
		System.out.println(veces);
		sc.close();
	}

}
