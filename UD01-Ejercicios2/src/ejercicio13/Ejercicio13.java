//Pide al usuario una cantidad de dinero con decimales. Mediante un cast a int
//obtén la cantidad de euros enteros. A partir de la parte decimal, calcula 
//también los céntimos y redondéalos correctamente.

package ejercicio13;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		double saldo;
		Integer eurosEnteros;
		Integer centimos;
		System.out.println("Cuanto dinero tienes");
		saldo = sc.nextDouble();
		eurosEnteros = (int) saldo;
		centimos = (int) Math.round((saldo - eurosEnteros) * 100);
		System.out.println("Euros: " + eurosEnteros);
		System.out.println("Céntimos: " + centimos);
		sc.close();
	}

}
