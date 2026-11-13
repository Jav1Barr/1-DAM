package b08_listas;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 10
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve la suma de los números que van después del primer negativo (el negativo no se
 *   suma). Sin negativos, devuelve 0.
 *
 * FIRMA
 *   public static Integer sumaDespuesDelPrimerNegativo(List<Integer> numeros)
 *
 * EJEMPLOS
 *   sumaDespuesDelPrimerNegativo([4, 2, -1, 5, 6])  ->  11
 *   sumaDespuesDelPrimerNegativo([4, 2])  ->  0
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej10_SumaDespuesDelPrimerNegativo {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Integer sumaDespuesDelPrimerNegativo(List<Integer> numeros) {
		Integer res = 0;
		boolean encontrado = false;
		for (Integer e : numeros) {
			if (encontrado) {
				res += e;
			} else if (e < 0) {
				encontrado = true;
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("sumaDespuesDelPrimerNegativo", 11, sumaDespuesDelPrimerNegativo(List.of(4, 2, -1, 5, 6)));
		Prueba.comprueba("sumaDespuesDelPrimerNegativo sin negativos", 0, sumaDespuesDelPrimerNegativo(List.of(4, 2)));
	}
}
