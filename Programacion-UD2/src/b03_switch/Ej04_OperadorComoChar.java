package b03_switch;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 3 (switch) · EJERCICIO 04
 * --------------------------------------
 * ENUNCIADO
 *   Pide dos números y un operador (+ - * / %) y muestra el resultado. Controla la división y
 *   el resto entre 0.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Primer número: 8
 *   Segundo número: 2
 *   Operador (+ - * / %): /
 *   4.0
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej04_OperadorComoChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double a = Entrada.decimal(sc, "Primer número: ");
		Double b = Entrada.decimal(sc, "Segundo número: ");
		char op = Entrada.caracter(sc, "Operador (+ - * / %): ");
		switch (op) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			if (b == 0) {
				System.out.println("No se puede dividir entre 0");
			} else {
				System.out.println(a / b);
			}
			break;
		case '%':
			if (b == 0) {
				System.out.println("No se puede calcular el resto entre 0");
			} else {
				System.out.println(a % b);
			}
			break;
		default:
			System.out.println("Operador incorrecto");
		}
		sc.close();
	}
}
