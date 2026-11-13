package b08_listas;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 15
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve true si todos los números de la lista son positivos (mayores que 0).
 *
 * FIRMA
 *   public static Boolean todosPositivos(List<Integer> numeros)
 *
 * EJEMPLOS
 *   todosPositivos([1, 5, 9])  ->  true
 *   todosPositivos([1, 0, 9])  ->  false
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej15_TodosPositivos {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Boolean todosPositivos(List<Integer> numeros) {
		Boolean res = true;
		for (Integer e : numeros) {
			if (e <= 0) {
				res = false;
				break;
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("todosPositivos", true, todosPositivos(List.of(1, 5, 9)));
		Prueba.comprueba("todosPositivos", false, todosPositivos(List.of(1, 0, 9)));
	}
}
