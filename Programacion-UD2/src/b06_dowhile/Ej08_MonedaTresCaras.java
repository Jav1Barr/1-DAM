package b06_dowhile;

import java.util.Random;

/*
 * UD2 · BLOQUE 6 (do-while) · EJERCICIO 08
 * ----------------------------------------
 * ENUNCIADO
 *   Lanza una moneda hasta que salgan 3 caras seguidas y muestra cuántos lanzamientos hicieron
 *   falta.
 *
 * NOTA: usa números aleatorios, así que cada ejecución es distinta.
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej08_MonedaTresCaras {

	public static void main(String[] args) {
		Random rnd = new Random();
		Integer seguidas = 0;
		Integer lanzamientos = 0;
		do {
			boolean cara = rnd.nextBoolean();
			lanzamientos++;
			if (cara) {
				seguidas++;
			} else {
				seguidas = 0;
			}
			System.out.println(cara ? "Cara" : "Cruz");
		} while (seguidas < 3);
		System.out.println("Lanzamientos: " + lanzamientos);
	}
}
