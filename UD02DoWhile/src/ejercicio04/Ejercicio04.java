//Realiza un programa que muestre la tabla de multiplicar de un número introducido por teclado. 
//Por ejemplo, si se introduce el número 3 se debe imprimir lo siguiente:

package ejercicio04;
import java.util.Scanner;
public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer recorrido = 1;
		Integer multiplicador = 0;
		Integer resultado = 0;
		System.out.println("Dime un num");
		multiplicador = sc.nextInt();
		do {
			resultado = multiplicador * recorrido;
			System.out.println(resultado);
			recorrido ++;
		}while(recorrido <= 10);
		sc.close();

	}

}
