package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		double N1, N2, N3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la nota del 1 trimestre");
		N1 = sc.nextDouble();
		System.out.println("Dime la nota del 2 trimestre");
		N2 = sc.nextDouble();
		System.out.println("Dime la nota del 3 trimestre");
		N3 = sc.nextDouble();
		int boletin = ((int)N1 +(int) N2 + (int)N3)/ 3;
		double exp = (N1 + N2 + N3)/3;
		System.out.println("Tu nota de boletin es "+ boletin+ " Y tu nota de expediente es "+ exp);
		sc.close();
	}

}