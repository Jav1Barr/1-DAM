package b04_for;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 4 (for) · EJERCICIO 11
 * -----------------------------------
 * ENUNCIADO
 *   Pide n y muestra los números primos entre 1 y n.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   n: 30
 *   2 3 5 7 11 13 17 19 23 29
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej11_PrimosHastaN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.entero(sc, "n: ");
		for (int i = 2; i <= n; i++) {
			boolean primo = true;
			for (int d = 2; d * d <= i; d++) {
				if (i % d == 0) {
					primo = false;
					break;
				}
			}
			if (primo) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		sc.close();
	}
}
