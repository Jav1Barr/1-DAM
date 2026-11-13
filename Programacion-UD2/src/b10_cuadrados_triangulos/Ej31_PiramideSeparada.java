package b10_cuadrados_triangulos;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 10 (cuadrados y triángulos) · EJERCICIO 31
 * -------------------------------------------------------
 * ENUNCIADO
 *   Pide n y dibuja una pirámide centrada con un espacio entre cada asterisco (* * *).
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   N: 5
 *       *
 *      * *
 *     * * *
 *    * * * *
 *   * * * * *
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej31_PiramideSeparada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "N: ");
		dibujar(n);
		sc.close();
	}

	static void dibujar(Integer n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				if (j >= n - 1 - i && j <= n - 1 + i && (j - (n - 1 - i)) % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
