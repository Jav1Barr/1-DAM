package b07_anidados;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 7 (bucles anidados) · EJERCICIO 03
 * -----------------------------------------------
 * ENUNCIADO
 *   Pide n y dibuja un triángulo en el que la fila i tiene i veces el número i.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   N: 5
 *   1
 *   22
 *   333
 *   4444
 *   55555
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej03_TrianguloNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "N: ");
		dibujar(n);
		sc.close();
	}

	// 03. Triángulo de números repetidos: la fila i tiene i veces el número i.
	static void dibujar(Integer n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}
}
