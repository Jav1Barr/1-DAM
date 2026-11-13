package b01_ifelse;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 1 (if-else) · EJERCICIO 06
 * ---------------------------------------
 * ENUNCIADO
 *   Pide dos números enteros y di si uno es múltiplo del otro (cuidado: no se puede dividir
 *   entre 0).
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Primero: 3
 *   Segundo: 12
 *   12 es múltiplo de 3
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej06_Multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a = Entrada.entero(sc, "Primero: ");
		Integer b = Entrada.entero(sc, "Segundo: ");
		if (a != 0 && b % a == 0) {
			System.out.println(b + " es múltiplo de " + a);
		} else if (b != 0 && a % b == 0) {
			System.out.println(a + " es múltiplo de " + b);
		} else {
			System.out.println("Ninguno es múltiplo del otro");
		}
		sc.close();
	}
}
