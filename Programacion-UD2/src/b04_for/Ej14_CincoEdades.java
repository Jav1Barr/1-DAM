package b04_for;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 4 (for) · EJERCICIO 14
 * -----------------------------------
 * ENUNCIADO
 *   Pide 5 edades y muestra cuántas son de mayores de edad y cuál es la edad más baja.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Edad 1: 15
 *   Edad 2: 22
 *   Edad 3: 70
 *   Edad 4: 17
 *   Edad 5: 30
 *   Mayores de edad: 3  Edad más baja: 15
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej14_CincoEdades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer mayores = 0;
		Integer minima = 0;
		for (int i = 1; i <= 5; i++) {
			Integer edad = Entrada.entero(sc, "Edad " + i + ": ");
			if (edad >= 18) {
				mayores++;
			}
			if (i == 1 || edad < minima) {
				minima = edad;
			}
		}
		System.out.println("Mayores de edad: " + mayores + "  Edad más baja: " + minima);
		sc.close();
	}
}
