package b03_switch;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 3 (switch) · EJERCICIO 07
 * --------------------------------------
 * ENUNCIADO
 *   Pide tres tiradas de dado escritas como texto (UNO ... SEIS), suma sus valores y muestra la
 *   suma. Si supera 12, muestra «¡Buena racha!».
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Tirada 1: CINCO
 *   Tirada 2: SEIS
 *   Tirada 3: DOS
 *   Suma: 13
 *   ¡Buena racha!
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej07_TresTiradasDado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer suma = 0;
		boolean valido = true;
		for (int i = 1; i <= 3; i++) {
			Integer v = valorDado(Entrada.texto(sc, "Tirada " + i + ": "));
			if (v == 0) {
				valido = false;
			}
			suma += v;
		}
		if (!valido) {
			System.out.println("Alguna tirada no es válida (UNO...SEIS)");
		} else {
			System.out.println("Suma: " + suma);
			if (suma > 12) {
				System.out.println("¡Buena racha!");
			}
		}
		sc.close();
	}

	// Auxiliar: "UNO".."SEIS" -> 1..6 (0 si no es válido).
	static Integer valorDado(String texto) {
		Integer valor;
		switch (texto.trim().toUpperCase()) {
		case "UNO": valor = 1; break;
		case "DOS": valor = 2; break;
		case "TRES": valor = 3; break;
		case "CUATRO": valor = 4; break;
		case "CINCO": valor = 5; break;
		case "SEIS": valor = 6; break;
		default: valor = 0;
		}
		return valor;
	}
}
