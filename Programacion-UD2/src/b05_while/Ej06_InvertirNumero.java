package b05_while;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 5 (while) · EJERCICIO 06
 * -------------------------------------
 * ENUNCIADO
 *   Pide un entero positivo y muestra sus cifras al revés (1234 -> 4321).
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Entero positivo: 1234
 *   Invertido: 4321
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej06_InvertirNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.entero(sc, "Entero positivo: ");
		Integer invertido = 0;
		while (n > 0) {
			invertido = invertido * 10 + n % 10;
			n = n / 10;
		}
		System.out.println("Invertido: " + invertido);
		sc.close();
	}
}
