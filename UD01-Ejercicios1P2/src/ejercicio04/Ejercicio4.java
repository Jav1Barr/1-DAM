//Dado el siguiente polinomio de segundo grado:
//y=ax2+bx+c
//Crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor correspondiente de y.
package ejercicio04;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer y, x, a, b, c;
		System.out.println("Introduce en orden  X, A, B, C");
		x = sc.nextInt();
		a = sc.nextInt(); 
		b = sc.nextInt();
		c = sc.nextInt();
		
		y = a*(x*x) +b*x+c;
		System.out.println("El resultado es "+y);
		sc.close();
	}

}
