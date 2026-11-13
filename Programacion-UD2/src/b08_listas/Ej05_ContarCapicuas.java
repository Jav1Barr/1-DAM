package b08_listas;

import java.util.List;

import utiles.Prueba;
import utiles.Utiles;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 05
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve cuántos números de la lista son capicúas (121, 1331...). Los de una cifra lo son.
 *
 * FIRMA
 *   public static Integer contarCapicuas(List<Integer> numeros)
 *
 * EJEMPLOS
 *   contarCapicuas([121, 45, 3, 1331, 10])  ->  3
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej05_ContarCapicuas {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Integer contarCapicuas(List<Integer> numeros) {
		Integer res = 0;
		for (Integer e : numeros) {
			if (Utiles.esCapicua(e)) {
				res++;
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("contarCapicuas", 3, contarCapicuas(List.of(121, 45, 3, 1331, 10)));
	}
}
