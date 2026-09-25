package ejercicio11;
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		final int ptas = 166;
		int dinero;
		Scanner sc = new Scanner (System.in);
		System.out.println("Conversor a pesetas, dime la cantidad de €");
		dinero = sc.nextInt();
		int convertido = dinero * ptas;
		System.out.println("En pesetas es "+ convertido);
		sc.close();
	}

}
