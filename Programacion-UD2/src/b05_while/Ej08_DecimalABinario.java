package b05_while;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 5 (while) · EJERCICIO 08
 * -------------------------------------
 * ENUNCIADO
 *   Pide un entero positivo y muéstralo en binario (13 -> 1101).
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Entero positivo: 13
 *   Binario: 1101
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej08_DecimalABinario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.entero(sc, "Entero positivo: ");
		String binario = "";
		if (n == 0) {
			binario = "0";
		}
		while (n > 0) {
			binario = (n % 2) + binario; // los restos salen de derecha a izquierda
			n = n / 2;
		}
		System.out.println("Binario: " + binario);
		sc.close();
	}
}
