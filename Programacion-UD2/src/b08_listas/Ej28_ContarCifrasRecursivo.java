package b08_listas;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 28
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve cuántas cifras tiene un número, de forma recursiva.
 *
 * FIRMA
 *   public static Integer contarCifrasRecursivo(Integer n)
 *
 * EJEMPLOS
 *   contarCifrasRecursivo(12345)  ->  5
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej28_ContarCifrasRecursivo {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	// Caso base: una sola cifra.
	public static Integer contarCifrasRecursivo(Integer n) {
		Integer res = 1;
		Integer valor = Math.abs(n);
		if (valor >= 10) {
			res = 1 + contarCifrasRecursivo(valor / 10);
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("contarCifrasRecursivo", 5, contarCifrasRecursivo(12345));
	}
}
