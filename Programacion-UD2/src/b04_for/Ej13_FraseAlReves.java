package b04_for;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 4 (for) · EJERCICIO 13
 * -----------------------------------
 * ENUNCIADO
 *   Pide una frase y muéstrala al revés.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Frase: Hola mundo
 *   odnum aloH
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej13_FraseAlReves {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = Entrada.texto(sc, "Frase: ");
		String alReves = "";
		for (int i = frase.length() - 1; i >= 0; i--) {
			alReves += frase.charAt(i);
		}
		System.out.println(alReves);
		sc.close();
	}
}
