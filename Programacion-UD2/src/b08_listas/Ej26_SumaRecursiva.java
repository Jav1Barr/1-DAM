package b08_listas;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 26
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve la suma de 1 a n de forma recursiva.
 *
 * FIRMA
 *   public static Integer sumaRecursiva(Integer n)
 *
 * EJEMPLOS
 *   sumaRecursiva(4)  ->  10
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej26_SumaRecursiva {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	// Caso base: n <= 0.
	public static Integer sumaRecursiva(Integer n) {
		Integer res = 0;
		if (n > 0) {
			res = n + sumaRecursiva(n - 1);
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("sumaRecursiva", 10, sumaRecursiva(4));
	}
}
