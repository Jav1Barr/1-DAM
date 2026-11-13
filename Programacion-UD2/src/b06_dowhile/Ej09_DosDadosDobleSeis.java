package b06_dowhile;

import java.util.Random;

/*
 * UD2 · BLOQUE 6 (do-while) · EJERCICIO 09
 * ----------------------------------------
 * ENUNCIADO
 *   Tira dos dados hasta que salga doble seis y muestra cuántas tiradas hicieron falta.
 *
 * NOTA: usa números aleatorios, así que cada ejecución es distinta.
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej09_DosDadosDobleSeis {

	public static void main(String[] args) {
		Random rnd = new Random();
		Integer tiradas = 0;
		Integer d1;
		Integer d2;
		do {
			d1 = rnd.nextInt(6) + 1;
			d2 = rnd.nextInt(6) + 1;
			tiradas++;
			System.out.println("Tirada " + tiradas + ": " + d1 + " y " + d2);
		} while (!(d1 == 6 && d2 == 6));
		System.out.println("Doble seis tras " + tiradas + " tiradas");
	}
}
