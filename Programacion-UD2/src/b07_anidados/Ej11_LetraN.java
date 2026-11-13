package b07_anidados;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 7 (bucles anidados) · EJERCICIO 11
 * -----------------------------------------------
 * ENUNCIADO
 *   Pide n y dibuja una letra N: primera columna, última columna y diagonal principal.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   N: 5
 *   *   *
 *   **  *
 *   * * *
 *   *  **
 *   *   *
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej11_LetraN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "N: ");
		dibujar(n);
		sc.close();
	}

	// 11. Letra N.
	static void dibujar(Integer n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
