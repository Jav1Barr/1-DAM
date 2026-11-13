package b08_listas;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 17
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve true si la lista se lee igual de izquierda a derecha que de derecha a izquierda.
 *
 * FIRMA
 *   public static Boolean esPalindromo(List<Integer> numeros)
 *
 * EJEMPLOS
 *   esPalindromo([1, 2, 3, 2, 1])  ->  true
 *   esPalindromo([1, 2, 3])  ->  false
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej17_EsPalindromo {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	// Solo hace falta comparar la mitad de la lista.
	public static Boolean esPalindromo(List<Integer> numeros) {
		Boolean res = true;
		int n = numeros.size();
		for (int i = 0; i < n / 2; i++) {
			if (!numeros.get(i).equals(numeros.get(n - 1 - i))) {
				res = false;
				break;
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("esPalindromo", true, esPalindromo(List.of(1, 2, 3, 2, 1)));
		Prueba.comprueba("esPalindromo", false, esPalindromo(List.of(1, 2, 3)));
	}
}
