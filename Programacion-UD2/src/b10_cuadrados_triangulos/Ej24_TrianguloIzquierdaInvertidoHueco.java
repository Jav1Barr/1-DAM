package b10_cuadrados_triangulos;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 10 (cuadrados y triángulos) · EJERCICIO 24
 * -------------------------------------------------------
 * ENUNCIADO
 *   Pide n y dibuja solo el contorno de un triángulo invertido pegado a la izquierda.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   N: 6
 *   ******
 *   *   *
 *   *  *
 *   * *
 *   **
 *   *
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej24_TrianguloIzquierdaInvertidoHueco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "N: ");
		dibujar(n);
		sc.close();
	}

	static void dibujar(Integer n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 - i || i == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
