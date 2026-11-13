package b07_anidados;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 7 (bucles anidados) · EJERCICIO 12
 * -----------------------------------------------
 * ENUNCIADO
 *   Pide filas y columnas y dibuja franjas de 2 filas que alternan * y #.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Filas: 6
 *   Columnas: 8
 *   ********
 *   ********
 *   ########
 *   ########
 *   ********
 *   ********
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej12_Franjas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer filas = Entrada.enteroPositivo(sc, "Filas: ");
		Integer columnas = Entrada.enteroPositivo(sc, "Columnas: ");
		dibujar(filas, columnas);
		sc.close();
	}

	// 12. Franjas de 2 filas que alternan * y #.
	static void dibujar(Integer filas, Integer columnas) {
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print((i / 2) % 2 == 0 ? "*" : "#");
			}
			System.out.println();
		}
	}
}
