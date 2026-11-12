package test;
import java.util.List;

import ejercicios.Ejercicios;
public class Test {

	public static void main(String[] args) {
		System.out.println("El precio final del parkin es de "+ Ejercicios.precioAparcamiento("coche", 3, false));
		System.out.println("El precio final del parkin es de "+ Ejercicios.precioAparcamiento("furgoneta", 8, true));
		System.out.println("El precio final del parkin es de "+ Ejercicios.precioAparcamiento("moto", 7, true));
		System.out.println("El precio final del parkin es de "+ Ejercicios.precioAparcamiento("bici", 2, false));
		System.out.println("El precio final del parkin es de "+ Ejercicios.precioAparcamiento("coche", 0, false));
		System.out.println("Ejercicipo 2 ###########");
		Ejercicios.dibujarN(5);
		System.out.println("Ejercicipo 3 ###########");
		System.out.println("la suma de los primos gemelos es "+ Ejercicios.sumaPrimerosGemelos(1, 10));
		System.out.println("la suma de los primos gemelos es "+ Ejercicios.sumaPrimerosGemelos(6, 20));
		System.out.println("la suma de los primos gemelos es "+ Ejercicios.sumaPrimerosGemelos(3, 5));
		System.out.println("la suma de los primos gemelos es "+ Ejercicios.sumaPrimerosGemelos(14, 16));
		System.out.println("Ejercicipo 4 ###########");
		System.out.println("El numero de impares es "+ Ejercicios.contarCifrasImpares(12345));
		System.out.println("Ejercicipo 5 ###########");
		System.out.println("El numero de saltos es "+ Ejercicios.contarSaltosBruscos(List.of(20, 25, 24, 31, 30), 5));
	}

}
