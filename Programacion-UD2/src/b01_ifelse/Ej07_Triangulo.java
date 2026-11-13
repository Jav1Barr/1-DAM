package b01_ifelse;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 1 (if-else) · EJERCICIO 07
 * ---------------------------------------
 * ENUNCIADO
 *   Pide los tres lados de un triángulo. Comprueba que existe (lados positivos y cada lado
 *   menor que la suma de los otros dos) y clasifícalo en equilátero, isósceles o escaleno.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Lado 1: 3
 *   Lado 2: 4
 *   Lado 3: 5
 *   Triángulo escaleno
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej07_Triangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double a = Entrada.decimal(sc, "Lado 1: ");
		Double b = Entrada.decimal(sc, "Lado 2: ");
		Double c = Entrada.decimal(sc, "Lado 3: ");
		boolean positivos = a > 0 && b > 0 && c > 0;
		if (positivos && a < b + c && b < a + c && c < a + b) {
			if (a.equals(b) && b.equals(c)) {
				System.out.println("Triángulo equilátero");
			} else if (a.equals(b) || a.equals(c) || b.equals(c)) {
				System.out.println("Triángulo isósceles");
			} else {
				System.out.println("Triángulo escaleno");
			}
		} else {
			System.out.println("Esos lados no forman un triángulo");
		}
		sc.close();
	}
}
