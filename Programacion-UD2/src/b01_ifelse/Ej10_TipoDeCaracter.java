package b01_ifelse;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 1 (if-else) · EJERCICIO 10
 * ---------------------------------------
 * ENUNCIADO
 *   Pide un carácter y di si es una vocal, una consonante, un dígito u otro símbolo.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Carácter: e
 *   Vocal
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej10_TipoDeCaracter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = Character.toLowerCase(Entrada.caracter(sc, "Carácter: "));
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println("Vocal");
		} else if (Character.isLetter(c)) {
			System.out.println("Consonante");
		} else if (Character.isDigit(c)) {
			System.out.println("Dígito");
		} else {
			System.out.println("Otro símbolo");
		}
		sc.close();
	}
}
