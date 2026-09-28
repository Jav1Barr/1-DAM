package ejercicio14;

import java.util.Scanner;
import java.math.*;
public class Ejercicio14 {

	public static void main(String[] args) {
		Double N1, N2, N3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la nota del 1 trimestre");
		N1 = sc.nextDouble();
		System.out.println("Dime la nota del 2 trimestre");
		N2 = sc.nextDouble();
		System.out.println("Dime la nota del 3 trimestre");
		N3 = sc.nextDouble();
		Double boletin = (N1 + N2 + N3)/ 3;
		System.out.println("Tu nota de boletin es "+ Math.round(boletin) + " Y tu nota de expediente es "+ Math.round(boletin*100)/100.0);
		sc.close();
	}

}