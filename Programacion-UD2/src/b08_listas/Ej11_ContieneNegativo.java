package b08_listas;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 11
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve true si la lista contiene algún número negativo.
 *
 * FIRMA
 *   public static Boolean contieneNegativo(List<Integer> numeros)
 *
 * EJEMPLOS
 *   contieneNegativo([3, 5, -1, 2])  ->  true
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej11_ContieneNegativo {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Boolean contieneNegativo(List<Integer> numeros) {
		Boolean res = false;
		for (Integer e : numeros) {
			if (e < 0) {
				res = true;
				break;
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("contieneNegativo", true, contieneNegativo(List.of(3, 5, -1, 2)));
	}
}
