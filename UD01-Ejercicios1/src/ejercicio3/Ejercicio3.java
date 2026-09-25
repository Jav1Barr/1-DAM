package ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //abrimos el escaner
		int añoActual, añoNacimiento, edad; //Definimos las var
		System.out.println("Di el año en el que estamos"); // pedimos el año
		añoActual = sc.nextInt(); //nos regresa el año
		System.out.println("¿En que año naciste?"); // pedimos en que año nacio
		añoNacimiento = sc.nextInt(); // nos regresa cuando nacio
		edad = (añoActual - añoNacimiento);// Calculamos la edad
		System.out.println("Tienes " +edad +" años"); // mostramos la edad
		sc.close(); //cerramos escaner
		
		
		
	}
}
