package ejercicio13;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		Boolean lluvia = false, tareas = false, biblio = false;
		Scanner sc = new Scanner (System.in);
		System.out.println("¿Esta lloviendo? (true/false)");
		lluvia = sc.nextBoolean();
		System.out.println("¿Has terminado las tareas?(true/false");
		tareas = sc.nextBoolean();
		System.out.println("¿Vas a la biblioteca?(True/False)");
		biblio = sc.nextBoolean();
		if (biblio == true) {
			System.out.println("puedes salir");	
		}
		else if (lluvia == false && tareas == true) {
			System.out.println("Puedes salir");
		}
		else {
			System.out.println("no puedes salir");
			sc.close();
		}
	}

}