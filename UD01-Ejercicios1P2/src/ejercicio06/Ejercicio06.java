//Solicita al usuario tres distancias:
//La primera, medida en milímetros.
//La segunda, medida en centímetros.
//La última, medida en metros.
//Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en centímetros).
package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer firstMM, secondCM, thirdM;
		System.out.println("Dime la primera medida en mm");
		firstMM = sc.nextInt();
		System.out.println("Dime la segunda medida en cm");
		secondCM = sc.nextInt();
		System.out.println("Dime la tercera medida en m");
		thirdM = sc.nextInt(); 
		Integer resultado = (firstMM /10)+ secondCM + (thirdM*10);
		System.out.println("La suma total en cm es "+ resultado+" cm");
		sc.close();
	}

}
