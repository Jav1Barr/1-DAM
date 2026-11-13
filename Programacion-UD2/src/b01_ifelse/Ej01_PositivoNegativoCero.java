package b01_ifelse;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 1 (if-else) · EJERCICIO 01
 * ---------------------------------------
 * ENUNCIADO
 *   Pide un número entero y muestra si es positivo, negativo o cero.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Número: -4
 *   Negativo
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej01_PositivoNegativoCero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.entero(sc, "Número: ");
		if (n > 0) {
			System.out.println("Positivo");
		} else if (n < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Cero");
		}
		sc.close();
	}
}
