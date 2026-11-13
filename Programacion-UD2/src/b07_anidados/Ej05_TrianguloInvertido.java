package b07_anidados;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 7 (bucles anidados) · EJERCICIO 05
 * -----------------------------------------------
 * ENUNCIADO
 *   Pide n y dibuja un triángulo invertido: 12345, 1234, ... hasta 1.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   N: 5
 *   12345
 *   1234
 *   123
 *   12
 *   1
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej05_TrianguloInvertido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "N: ");
		dibujar(n);
		sc.close();
	}

	// 05. Triángulo numérico invertido: 12345, 1234, ... 1.
	static void dibujar(Integer n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j % 10);
			}
			System.out.println();
		}
	}
}
