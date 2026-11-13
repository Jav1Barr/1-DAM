package b01_ifelse;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 1 (if-else) · EJERCICIO 03
 * ---------------------------------------
 * ENUNCIADO
 *   Pide tres números enteros y muestra el mayor.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Primero: 4
 *   Segundo: 9
 *   Tercero: 7
 *   El mayor es 9
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej03_MayorDeTres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a = Entrada.entero(sc, "Primero: ");
		Integer b = Entrada.entero(sc, "Segundo: ");
		Integer c = Entrada.entero(sc, "Tercero: ");
		Integer mayor = a;
		if (b > mayor) {
			mayor = b;
		}
		if (c > mayor) {
			mayor = c;
		}
		System.out.println("El mayor es " + mayor);
		sc.close();
	}
}
