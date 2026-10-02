//Escribe un programa que solicite un número real y muestre su valor absoluto
//y su raíz cuadrada utilizando métodos de la clase Math. Prueba el programa
//con diferentes valores positivos.


package ejercicio05;
import java.util.Scanner;
import java.math.*;
public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double inputNum;
		Double resuraiz;
		Integer resuabs;
		System.out.println("dime un número");
		inputNum = sc.nextDouble();
		resuabs = (int) Math.abs(inputNum);
		resuraiz = Math.sqrt(inputNum);
		System.out.println("El absoluto es "+ resuabs + " y la raiz es "+ resuraiz);
		sc.close();
	}

}
