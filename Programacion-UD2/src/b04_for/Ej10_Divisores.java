package b04_for;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 4 (for) · EJERCICIO 10
 * -----------------------------------
 * ENUNCIADO
 *   Pide un número positivo y muestra todos sus divisores y cuántos tiene.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   n (positivo): 12
 *   1
 *   2
 *   3
 *   4
 *   6
 *   12
 *   Total de divisores: 6
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej10_Divisores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.entero(sc, "n (positivo): ");
		Integer cantidad = 0;
		for (int d = 1; d <= n; d++) {
			if (n % d == 0) {
				System.out.println(d);
				cantidad++;
			}
		}
		System.out.println("Total de divisores: " + cantidad);
		sc.close();
	}
}
