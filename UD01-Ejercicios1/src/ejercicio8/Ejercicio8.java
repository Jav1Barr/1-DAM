package ejercicio8;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		String nombre;
		Integer edad;
		Scanner sc = new Scanner (System.in);
			System.out.println("Diga su nombre");
			nombre = sc.next();
			System.out.println("Diga su edad");
			edad = sc.nextInt();
			System.out.println("Hola "+nombre+ ", tienes "+ edad+ " años, ¡Que mayor eres!");
			sc.close();
	}

}
