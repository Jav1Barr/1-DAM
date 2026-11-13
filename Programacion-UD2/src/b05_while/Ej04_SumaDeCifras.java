package b05_while;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 5 (while) · EJERCICIO 04
 * -------------------------------------
 * ENUNCIADO
 *   Pide un entero positivo y suma sus cifras (453 -> 12).
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Entero positivo: 453
 *   Suma de cifras: 12
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej04_SumaDeCifras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.entero(sc, "Entero positivo: ");
		Integer suma = 0;
		while (n > 0) {
			suma += n % 10;
			n = n / 10;
		}
		System.out.println("Suma de cifras: " + suma);
		sc.close();
	}
}
