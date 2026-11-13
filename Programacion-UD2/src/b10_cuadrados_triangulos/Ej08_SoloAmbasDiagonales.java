package b10_cuadrados_triangulos;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 10 (cuadrados y triángulos) · EJERCICIO 08
 * -------------------------------------------------------
 * ENUNCIADO
 *   Pide n y dibuja un cuadrado vacío en el que solo se ven las dos diagonales, formando una X.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Lado: 5
 *   *   *
 *    * *
 *     *
 *    * *
 *   *   *
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej08_SoloAmbasDiagonales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "Lado: ");
		dibujar(n);
		sc.close();
	}

	static void dibujar(Integer n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
