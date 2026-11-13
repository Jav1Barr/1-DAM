package b02_condicionales;

import java.util.Random;
import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 2 (condicionales) · EJERCICIO 04
 * ---------------------------------------------
 * ENUNCIADO
 *   El ordenador elige dos números aleatorios del 1 al 12 y te pregunta su producto. Indica si
 *   has acertado.
 *
 * NOTA: usa números aleatorios, así que cada ejecución es distinta.
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej04_JuegoMultiplicacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		Integer a = rnd.nextInt(12) + 1; // 1..12
		Integer b = rnd.nextInt(12) + 1;
		Integer respuesta = Entrada.entero(sc, a + " x " + b + " = ");
		if (respuesta.equals(a * b)) {
			System.out.println("¡Correcto!");
		} else {
			System.out.println("Incorrecto, el resultado es " + (a * b));
		}
		sc.close();
	}
}
