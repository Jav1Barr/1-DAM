package b08_listas;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 13
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve el primer número de la lista que sea múltiplo de m, o null si no hay ninguno.
 *
 * FIRMA
 *   public static Integer primerMultiploDe(List<Integer> numeros, Integer m)
 *
 * EJEMPLOS
 *   primerMultiploDe([8, 10, 14, 21], 7)  ->  14
 *   primerMultiploDe([8, 10], 7)  ->  null
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej13_PrimerMultiploDe {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Integer primerMultiploDe(List<Integer> numeros, Integer m) {
		Integer res = null;
		for (Integer e : numeros) {
			if (e % m == 0) {
				res = e;
				break;
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("primerMultiploDe", 14, primerMultiploDe(List.of(8, 10, 14, 21), 7));
		Prueba.comprueba("primerMultiploDe ninguno", null, primerMultiploDe(List.of(8, 10), 7));
	}
}
