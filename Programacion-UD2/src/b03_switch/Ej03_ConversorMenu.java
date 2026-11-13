package b03_switch;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 3 (switch) · EJERCICIO 03
 * --------------------------------------
 * ENUNCIADO
 *   Menú: A) euros a dólares (x 1,08), B) km a millas (x 0,621), C) ºC a ºF. Pide la opción y
 *   el valor y muestra el resultado.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   A) Euros a dólares
 *   B) Km a millas
 *   C) ºC a ºF
 *   Opción: B
 *   Valor: 100
 *   62,10 millas
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej03_ConversorMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A) Euros a dólares");
		System.out.println("B) Km a millas");
		System.out.println("C) ºC a ºF");
		char opcion = Character.toUpperCase(Entrada.caracter(sc, "Opción: "));
		if (opcion < 'A' || opcion > 'C') {
			System.out.println("Opción incorrecta");
		} else {
			Double valor = Entrada.decimal(sc, "Valor: ");
			switch (opcion) {
			case 'A':
				System.out.printf("%.2f $%n", valor * 1.08);
				break;
			case 'B':
				System.out.printf("%.2f millas%n", valor * 0.621);
				break;
			case 'C':
				System.out.printf("%.1f ºF%n", valor * 9 / 5 + 32);
				break;
			}
		}
		sc.close();
	}
}
