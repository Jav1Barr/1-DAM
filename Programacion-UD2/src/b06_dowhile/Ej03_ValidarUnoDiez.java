package b06_dowhile;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 6 (do-while) · EJERCICIO 03
 * ----------------------------------------
 * ENUNCIADO
 *   Pide un número entre 1 y 10 hasta que sea válido. Al final muestra cuántos intentos
 *   fallidos hubo.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Número (1-10): 15
 *   Número (1-10): 0
 *   Número (1-10): 7
 *   Número válido: 7 (intentos fallidos: 2)
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej03_ValidarUnoDiez {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n;
		Integer fallos = -1;
		do {
			n = Entrada.entero(sc, "Número (1-10): ");
			fallos++;
		} while (n < 1 || n > 10);
		System.out.println("Número válido: " + n + " (intentos fallidos: " + fallos + ")");
		sc.close();
	}
}
