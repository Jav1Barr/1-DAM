package b10_cuadrados_triangulos;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 10 (cuadrados y triángulos) · EJERCICIO 33
 * -------------------------------------------------------
 * ENUNCIADO
 *   Pide n y dibuja solo el contorno de un rombo.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   N: 4
 *      *
 *     * *
 *    *   *
 *   *     *
 *    *   *
 *     * *
 *      *
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej33_RomboHueco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "N: ");
		dibujar(n);
		sc.close();
	}

	static void dibujar(Integer n) {
		for (int i = 0; i < 2 * n - 1; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				if (Math.abs(j - (n - 1)) == n - 1 - Math.abs(i - (n - 1))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
