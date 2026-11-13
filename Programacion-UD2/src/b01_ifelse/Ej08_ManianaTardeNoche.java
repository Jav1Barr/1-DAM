package b01_ifelse;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 1 (if-else) · EJERCICIO 08
 * ---------------------------------------
 * ENUNCIADO
 *   Pide la hora (0-23): mañana de 6 a 11, tarde de 12 a 19 y noche el resto. Fuera de rango,
 *   muestra «Hora errónea».
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Hora (0-23): 15
 *   Tarde
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej08_ManianaTardeNoche {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer hora = Entrada.entero(sc, "Hora (0-23): ");
		if (hora < 0 || hora > 23) {
			System.out.println("Hora errónea");
		} else if (hora >= 6 && hora <= 11) {
			System.out.println("Mañana");
		} else if (hora >= 12 && hora <= 19) {
			System.out.println("Tarde");
		} else {
			System.out.println("Noche");
		}
		sc.close();
	}
}
