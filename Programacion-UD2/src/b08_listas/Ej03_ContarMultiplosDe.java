package b08_listas;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 03
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve cuántos números de la lista son múltiplos de m.
 *
 * FIRMA
 *   public static Integer contarMultiplosDe(List<Integer> numeros, Integer m)
 *
 * EJEMPLOS
 *   contarMultiplosDe([6, 10, 15, 9, 4], 3)  ->  3
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej03_ContarMultiplosDe {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Integer contarMultiplosDe(List<Integer> numeros, Integer m) {
		Integer res = 0;
		for (Integer e : numeros) {
			if (e % m == 0) {
				res++;
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("contarMultiplosDe", 3, contarMultiplosDe(List.of(6, 10, 15, 9, 4), 3));
	}
}
