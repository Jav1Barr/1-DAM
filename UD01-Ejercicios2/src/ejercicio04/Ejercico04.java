//Pide al usuario un número real y muestra: el entero inmediatamente inferior
//mediante Math.floor(), el entero inmediatamente superior mediante Math.ceil() 
//y el entero más cercano mediante Math.round().

package ejercicio04;
import java.math.*;
import java.util.Scanner;
public class Ejercico04 {

	public static void main(String[] args) {
		double input; 
		Integer Sup;
		Integer inf;
		Integer cercano;
		Scanner sc = new Scanner (System.in);
		System.out.println("dime un numero con decimales");
		input = sc.nextDouble();
		Sup = (int)Math.floor(input);
		inf = (int)Math.ceil(input);
		cercano = (int)Math.round(input);
		System.out.println(Sup +"  "+ inf +"  "+  cercano);
		sc.close();
	}

}
