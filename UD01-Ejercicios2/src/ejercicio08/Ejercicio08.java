//Una empresa guarda productos en cajas con una capacidad determinada.
//Pide al usuario el número de productos y la capacidad de cada caja.
//Calcula cuántas cajas son necesarias para guardar todos los productos utilizando Math.ceil().
//El resultado final debe mostrarse como un número entero.


package ejercicio08;
import java.util.Scanner;
import java.math.*;
public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Integer numCrates;
		Integer numProducts;
		Integer capacityCrate;
		System.out.println("Cuantos productos son");
		numProducts = sc.nextInt();
		System.out.println("Dime cuanto entra en cada caja");
		capacityCrate = sc.nextInt();
		numCrates = (int) Math.ceil((double) numProducts / capacityCrate);
		System.out.println(numCrates);
		sc.close();
	}

}
