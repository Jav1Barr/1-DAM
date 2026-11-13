package b05_while;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 5 (while) · EJERCICIO 07
 * -------------------------------------
 * ENUNCIADO
 *   Pide notas (0-10) hasta que se escriba -1. Las notas fuera de rango se ignoran. Muestra la
 *   media, los aprobados (5 o más), los suspensos y la nota máxima.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Nota (-1 para terminar): 7
 *   Nota (-1 para terminar): 4,5
 *   Nota (-1 para terminar): 11
 *   Nota errónea, se ignora
 *   Nota (-1 para terminar): 9
 *   Nota (-1 para terminar): -1
 *   Media: 6,83  Aprobados: 2  Suspensos: 1  Máxima: 9,0
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej07_NotasHastaMenosUno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double suma = 0.0;
		Integer cantidad = 0;
		Integer aprobados = 0;
		Double maxima = 0.0;
		Double nota = Entrada.decimal(sc, "Nota (-1 para terminar): ");
		while (nota != -1) {
			if (nota < 0 || nota > 10) {
				System.out.println("Nota errónea, se ignora");
			} else {
				suma += nota;
				cantidad++;
				if (nota >= 5) {
					aprobados++;
				}
				if (cantidad == 1 || nota > maxima) {
					maxima = nota;
				}
			}
			nota = Entrada.decimal(sc, "Nota (-1 para terminar): ");
		}
		if (cantidad == 0) {
			System.out.println("Sin datos");
		} else {
			System.out.printf("Media: %.2f  Aprobados: %d  Suspensos: %d  Máxima: %.1f%n",
					suma / cantidad, aprobados, cantidad - aprobados, maxima);
		}
		sc.close();
	}
}
