package b05_while;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 5 (while) · EJERCICIO 11
 * -------------------------------------
 * ENUNCIADO
 *   Pide un entero positivo y cuenta cuántas veces se puede dividir entre 2 mientras sea par
 *   (40 -> 3).
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Entero positivo: 40
 *   Veces: 3
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej11_DividirEntreDos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.entero(sc, "Entero positivo: ");
		Integer veces = 0;
		while (n > 0 && n % 2 == 0) {
			n = n / 2;
			veces++;
		}
		System.out.println("Veces: " + veces);
		sc.close();
	}
}
