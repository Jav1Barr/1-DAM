package b07_anidados;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 7 (bucles anidados) · EJERCICIO 16
 * -----------------------------------------------
 * ENUNCIADO
 *   Pide n y dibuja las n primeras filas del triángulo de Pascal.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   N: 6
 *   1
 *   1 1
 *   1 2 1
 *   1 3 3 1
 *   1 4 6 4 1
 *   1 5 10 10 5 1
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej16_TrianguloPascal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "N: ");
		dibujar(n);
		sc.close();
	}

	// 16. Reto: triángulo de Pascal. Cada término = anterior * (i-j) / (j+1).
	static void dibujar(Integer n) {
		for (int i = 0; i < n; i++) {
			Long c = 1L;
			for (int j = 0; j <= i; j++) {
				System.out.print(c + (j < i ? " " : ""));
				c = c * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}
