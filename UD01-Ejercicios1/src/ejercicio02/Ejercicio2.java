package ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Abrimos el escaner
		int edad; //Definimos la variable edad
		System.out.println("Introduzca su edad"); // pedimos la edad
		edad = sc.nextInt(); // leemos la edad 
		System.out.println("Su edad es " + edad); // mostramos la edad 
		edad++; // le sumamos 1 a la edad
		System.out.println("Tu edad el año que viene sera "+ edad); // mostramos la edad del proximo año
		sc.close(); // cerramos escaner
	}

}
