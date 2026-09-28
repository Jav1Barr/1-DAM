package ejercicio5;
import java.lang.Math;
import java.util.Scanner;
public class Ejercicio5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double r, lon = 0, area = 0; // definimos las variables 
	System.out.println("Introduzca el radio");
	r= sc.nextDouble(); // input del radio 
	lon = 2*Math.PI*r; // calculamos la longitud 
	area = Math.PI*(r*r); // calculamos el área 
	System.out.print("La longitud es "+ lon );
	System.out.println("y el área es "+ area);
	sc.close();
	
}
}
