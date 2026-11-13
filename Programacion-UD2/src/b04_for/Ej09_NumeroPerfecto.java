package b04_for;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 4 (for) · EJERCICIO 09
 * -----------------------------------
 * ENUNCIADO
 *   Pide n y di si es un número perfecto: la suma de sus divisores propios (los menores que él)
 *   es el propio número (6 = 1 + 2 + 3).
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   n: 28
 *   28 es perfecto
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej09_NumeroPerfecto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.entero(sc, "n: ");
		Integer suma = 0;
		for (int d = 1; d <= n / 2; d++) {
			if (n % d == 0) {
				suma += d;
			}
		}
		if (n > 1 && suma.equals(n)) {
			System.out.println(n + " es perfecto");
		} else {
			System.out.println(n + " no es perfecto");
		}
		sc.close();
	}
}
