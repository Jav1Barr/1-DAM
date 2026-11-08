//Un centro de investigación de la flora urbana necesita una aplicación que 
//muestre cuál es el árbol más alto. Para ello se introducirá por teclado la
//altura (en centímetros) de cada árbol (terminando la introducción de datos 
//cuando se utilice -1 como altura). La aplicación debe devolver la 
//altura del árbol más alto.

package ejercicio06;
import java.util.Scanner;
public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Integer input = 0;
		Integer arbolMax = 0;
		while (input >= 0) {
			System.out.println("dime la altura del arbol en cm");
			input = sc.nextInt();
			if (input > arbolMax) {
				arbolMax = input;
			}
		}
		System.out.println("el arbol mas grande mide " + arbolMax);
		sc.close();

	}

}
