package b08_listas;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 29
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve el máximo común divisor de a y b con el algoritmo de Euclides, de forma recursiva.
 *
 * FIRMA
 *   public static Integer mcd(Integer a, Integer b)
 *
 * EJEMPLOS
 *   mcd(12, 18)  ->  6
 *   mcd(7, 5)  ->  1
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej29_Mcd {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	// Euclides: mcd(a, b) = mcd(b, a % b); caso base b == 0.
	public static Integer mcd(Integer a, Integer b) {
		Integer res = a;
		if (b != 0) {
			res = mcd(b, a % b);
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("mcd", 6, mcd(12, 18));
		Prueba.comprueba("mcd", 1, mcd(7, 5));
	}
}
