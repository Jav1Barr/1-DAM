package ejercicio7;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String nombre, dir; 
		long numTelf; 
		System.out.println("Introduzca su nombre");
		nombre = sc.next();
		System.out.println("Introduzca su dirreción");
		sc.nextLine();
		dir = sc.nextLine();
		System.out.println("Introduzca su número de teléfono");
		numTelf = sc.nextLong();
		System.out.println("Nombre: "+ nombre);
		System.out.println("Dirreción: "+ dir);
		System.out.println("Teléfono: "+ numTelf);
		sc.close();
	}

}
