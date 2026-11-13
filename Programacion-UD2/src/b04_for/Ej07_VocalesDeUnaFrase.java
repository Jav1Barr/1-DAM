package b04_for;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 4 (for) · EJERCICIO 07
 * -----------------------------------
 * ENUNCIADO
 *   Pide una frase y cuenta cuántas vocales tiene.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Frase: Hola mundo
 *   Vocales: 4
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej07_VocalesDeUnaFrase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = Entrada.texto(sc, "Frase: ").toLowerCase();
		Integer vocales = 0;
		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vocales++;
			}
		}
		System.out.println("Vocales: " + vocales);
		sc.close();
	}
}
