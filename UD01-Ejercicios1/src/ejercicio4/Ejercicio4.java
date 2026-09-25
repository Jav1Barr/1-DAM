package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double nota1, nota2,notaFinal; // definimos las variables
		System.out.println("Dime la primera nota");
		nota1 = sc.nextDouble(); // pedimos la primera nota
		System.out.println("Dime la segunda nota");
		nota2 = sc.nextDouble(); // pedimos la segunda nota
		notaFinal = (nota1+nota2)/2; // hacemos la media 
		System.out.println("tu nota media es " + notaFinal); // mostramos la nota final 
		sc.close();
	}
}
