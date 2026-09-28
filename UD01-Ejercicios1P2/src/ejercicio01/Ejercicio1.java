package ejercicio01;
import java.util.Scanner;
public class Ejercicio1 {
	//Realizar un programa que pida como entrada un número con decimales y lo muestre redondeado al entero más próximo.
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double deci;
		System.out.println("Dime un N decimal");
		deci = sc.nextDouble();

        int entero = (int) deci;
        double decimal = deci - entero;

        if (decimal >= 0.5) {
            entero++;
        }
		sc.close();
		  System.out.println("Número redondeado: " + entero);
	}

}
