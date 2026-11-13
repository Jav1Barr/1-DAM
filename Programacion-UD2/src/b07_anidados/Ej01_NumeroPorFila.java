package b07_anidados;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 7 (bucles anidados) · EJERCICIO 01
 * -----------------------------------------------
 * ENUNCIADO
 *   Pide filas y columnas y dibuja una figura en la que cada fila repite su número (a partir de
 *   la fila 10 se usa solo la última cifra).
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Filas: 4
 *   Columnas: 6
 *   111111
 *   222222
 *   333333
 *   444444
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej01_NumeroPorFila {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer filas = Entrada.enteroPositivo(sc, "Filas: ");
		Integer columnas = Entrada.enteroPositivo(sc, "Columnas: ");
		dibujar(filas, columnas);
		sc.close();
	}

	// 01. Cada fila lleva su número repetido.
	static void dibujar(Integer filas, Integer columnas) {
		for (int i = 1; i <= filas; i++) {
			for (int j = 1; j <= columnas; j++) {
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}
}
