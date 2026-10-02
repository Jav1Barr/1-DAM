//7.Utiliza la clase Random para generar y mostrar tres valores: 
//un número entero aleatorio entre 1 y 100, un número real aleatorio 
//y un valor booleano aleatorio (true o false).

package ejercicio07;
import java.math.*;
public class Ejercicio07 {

	public static void main(String[] args) {
		Integer num1 = 0;
		Double num2 = 0.0;
		boolean num3 = false;
		int num33; // para poder asignar un 1 o 0 y hacer el booleano num3 
		
		num1 = (int)(Math.random()* 100)+1;
		num2 = Math.random();
		num33 = (int)(Math.random()*2);
		if (num33 == 1) {
			num3 = true; 
		}
		else num3 = false;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}

}
