package b08_listas;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 14
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve true si hay dos elementos consecutivos iguales.
 *
 * FIRMA
 *   public static Boolean hayConsecutivosIguales(List<Integer> numeros)
 *
 * EJEMPLOS
 *   hayConsecutivosIguales([1, 3, 3, 5])  ->  true
 *   hayConsecutivosIguales([1, 3, 5, 3])  ->  false
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej14_HayConsecutivosIguales {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Boolean hayConsecutivosIguales(List<Integer> numeros) {
		Boolean res = false;
		for (int i = 1; i < numeros.size(); i++) {
			if (numeros.get(i).equals(numeros.get(i - 1))) {
				res = true;
				break;
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("hayConsecutivosIguales", true, hayConsecutivosIguales(List.of(1, 3, 3, 5)));
		Prueba.comprueba("hayConsecutivosIguales", false, hayConsecutivosIguales(List.of(1, 3, 5, 3)));
	}
}
