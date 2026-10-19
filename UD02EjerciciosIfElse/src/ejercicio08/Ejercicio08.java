//Escribir un programa que pida al usuario tres números enteros, y que muestre por 
//pantalla si la suma de dos de esos números da como resultado el otro número.

package ejercicio08;
import java.util.Scanner;
public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer input1; 
		Integer input2;
		Integer input3;
		System.out.println("Dime el 1º number");
		input1 = sc.nextInt();
		System.out.println("Dime el 2º number");
		input2 = sc.nextInt();
		System.out.println("Dime el 3º number");
		input3 = sc.nextInt();
		if (input1 + input2 == input3) {
			System.out.println("la suma del 1 y 2 da 3 ");
		}else if(input1 + input3 == input2){
			System.out.println("La suma de 1 y 3 da 2");
		}else if( input2 + input3 == input1 ) {
			System.out.println("La suma de 2 y 3 da 1");
		}else {
			System.out.println("Ninguno es la suma de los otros");
		}
		sc.close();
	}

}
