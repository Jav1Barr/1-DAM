package b10_cuadrados_triangulos;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 10 (cuadrados y triángulos) · EJERCICIO 12
 * -------------------------------------------------------
 * ENUNCIADO
 *   Pide n y dibuja cuadrados metidos unos dentro de otros, alternando asterisco y hueco.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Lado: 9
 *   *********
 *   *       *
 *   * ***** *
 *   * *   * *
 *   * * * * *
 *   * *   * *
 *   * ***** *
 *   *       *
 *   *********
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej12_CuadradosConcentricos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "Lado: ");
		dibujar(n);
		sc.close();
	}

	static void dibujar(Integer n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j)) % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
