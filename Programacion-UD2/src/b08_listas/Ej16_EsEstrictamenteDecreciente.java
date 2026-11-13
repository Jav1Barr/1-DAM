package b08_listas;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 16
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve true si cada elemento es estrictamente menor que el anterior. Una lista vacía o de
 *   un solo elemento cuenta como decreciente.
 *
 * FIRMA
 *   public static Boolean esEstrictamenteDecreciente(List<Integer> numeros)
 *
 * EJEMPLOS
 *   esEstrictamenteDecreciente([9, 7, 5, 2])  ->  true
 *   esEstrictamenteDecreciente([9, 7, 7, 2])  ->  false
 *   esEstrictamenteDecreciente([])  ->  true
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej16_EsEstrictamenteDecreciente {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	// Con 0 o 1 elementos es true (el bucle no llega a ejecutarse).
	public static Boolean esEstrictamenteDecreciente(List<Integer> numeros) {
		Boolean res = true;
		for (int i = 1; i < numeros.size(); i++) {
			if (numeros.get(i) >= numeros.get(i - 1)) {
				res = false;
				break;
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("esEstrictamenteDecreciente", true, esEstrictamenteDecreciente(List.of(9, 7, 5, 2)));
		Prueba.comprueba("esEstrictamenteDecreciente", false, esEstrictamenteDecreciente(List.of(9, 7, 7, 2)));
		Prueba.comprueba("esEstrictamenteDecreciente vacía", true, esEstrictamenteDecreciente(List.of()));
	}
}
