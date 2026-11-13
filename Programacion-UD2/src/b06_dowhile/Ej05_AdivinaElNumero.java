package b06_dowhile;

import java.util.Random;
import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 6 (do-while) · EJERCICIO 05
 * ----------------------------------------
 * ENUNCIADO
 *   El ordenador elige un número del 1 al 50. Tienes 7 intentos y en cada uno te dice si el
 *   secreto es mayor o menor.
 *
 * NOTA: usa números aleatorios, así que cada ejecución es distinta.
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej05_AdivinaElNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer secreto = new Random().nextInt(50) + 1;
		Integer intentos = 0;
		Integer intento;
		do {
			intento = Entrada.entero(sc, "Intento " + (intentos + 1) + " (1-50): ");
			intentos++;
			if (intento < secreto) {
				System.out.println("Es mayor");
			} else if (intento > secreto) {
				System.out.println("Es menor");
			}
		} while (!intento.equals(secreto) && intentos < 7);
		if (intento.equals(secreto)) {
			System.out.println("¡Acertaste en " + intentos + " intentos!");
		} else {
			System.out.println("Sin intentos. Era el " + secreto);
		}
		sc.close();
	}
}
