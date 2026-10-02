//Diseña un programa que determine si una persona puede alquilar un vehículo. Solicita su
//edad y dos valores booleanos que indiquen si posee permiso de conducir y si tiene una 
//sanción que le impida conducir. Podrá alquilarlo si es mayor de edad, tiene permiso y
//no tiene dicha sanción. Muestra únicamente el resultado booleano.

package ejercicio11;

import java.util.Scanner;
import java.math.*;

public class Ejercicio11 {
	public static void main(String[] args) {
		Boolean edad = false;
		Boolean carnet = false;
		Boolean sancion = false;
		Boolean alquilar = false;
		Integer edadValor;
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos años tienes");
		edadValor = sc.nextInt();
		edad = edadValor>= 18 ? true :  false;
		System.out.println("Tienes carnet (true/false)");
		carnet = sc.nextBoolean();
		System.out.println("Tienes alguna sancion(true/false");
		sancion = sc.nextBoolean();
		if (edad == true && carnet == true && sancion == false ) {
			alquilar = true;
		}
		else {
			alquilar = false;
		}
		System.out.println(alquilar);
		sc.close();
		
	}
}
