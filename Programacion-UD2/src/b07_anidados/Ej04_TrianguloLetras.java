package b07_anidados;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 7 (bucles anidados) · EJERCICIO 04
 * -----------------------------------------------
 * ENUNCIADO
 *   Pide n y dibuja un triángulo de letras: A, AB, ABC...
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   N: 5
 *   A
 *   AB
 *   ABC
 *   ABCD
 *   ABCDE
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej04_TrianguloLetras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "N: ");
		dibujar(n);
		sc.close();
	}

	// 04. Triángulo de letras: A, AB, ABC...
	static void dibujar(Integer n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print((char) ('A' + j % 26));
			}
			System.out.println();
		}
	}
}
