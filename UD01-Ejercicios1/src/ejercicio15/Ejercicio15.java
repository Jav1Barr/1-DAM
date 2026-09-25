package ejercicio15;
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		final double IVA = 0.21;
		double precio;
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime el precio del articulo");
		precio = sc.nextDouble();
		double PIVA = precio * IVA;
		double PF = precio + PIVA;
		System.out.println("El precio con IVA es "+ PF + " $");
		sc.close();
		
		
		
	}

}