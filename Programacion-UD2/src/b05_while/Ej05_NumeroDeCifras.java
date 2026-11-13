package b05_while;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 5 (while) · EJERCICIO 05
 * -------------------------------------
 * ENUNCIADO
 *   Pide un entero positivo y cuenta cuántas cifras tiene (el 0 tiene una).
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Entero positivo: 12345
 *   Cifras: 5
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej05_NumeroDeCifras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.entero(sc, "Entero positivo: ");
		Integer cifras = 0;
		if (n == 0) {
			cifras = 1;
		}
		while (n > 0) {
			cifras++;
			n = n / 10;
		}
		System.out.println("Cifras: " + cifras);
		sc.close();
	}
}
