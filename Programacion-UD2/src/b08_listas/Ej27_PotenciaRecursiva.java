package b08_listas;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 27
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve base elevado a exp (exp >= 0) de forma recursiva.
 *
 * FIRMA
 *   public static Integer potenciaRecursiva(Integer base, Integer exp)
 *
 * EJEMPLOS
 *   potenciaRecursiva(2, 5)  ->  32
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej27_PotenciaRecursiva {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	// Caso base: exp == 0.
	public static Integer potenciaRecursiva(Integer base, Integer exp) {
		Integer res = 1;
		if (exp > 0) {
			res = base * potenciaRecursiva(base, exp - 1);
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("potenciaRecursiva", 32, potenciaRecursiva(2, 5));
	}
}
