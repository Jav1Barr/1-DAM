//olicita tres números enteros a, b y c. Calcula y muestra el resultado de 
//las expresiones a + b * c y (a + b) * c. Comprueba que los resultados pueden
//ser distintos y explica mediante un comentario en el código el motivo.

package ejercicio15;
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer c;
		Integer resul1;
		Integer resul2;
		Scanner sc = new Scanner (System.in);
		System.out.println("dime a");	
		a = sc.nextInt();
		System.out.println("dime b");	
		b = sc.nextInt();
		System.out.println("dime c");	
		c = sc.nextInt();
		resul1 = a + b * c;
		resul2 = (a +b) * c;
		System.out.println(resul1);
		System.out.println(resul2);
	}

}
