//Simula el lanzamiento de un dado. Genera mediante Math.random() 
//un número entero aleatorio comprendido entre 1 y 6, ambos incluidos. 
//Recuerda que será necesario realizar una conversión de tipo (cast).


package ejercicio06;
import java.math.*;
public class Ejercicio06 {

	public static void main(String[] args) {
		 Integer num;
		num = (int)(Math.random()*6) + 1;
		System.out.println(num);
	}

}
