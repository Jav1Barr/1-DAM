package b08_listas;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 07
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve la suma de los elementos que ocupan las posiciones 0, 2, 4...
 *
 * FIRMA
 *   public static Integer sumaPosicionesPares(List<Integer> numeros)
 *
 * EJEMPLOS
 *   sumaPosicionesPares([10, 20, 30, 40, 50])  ->  90
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej07_SumaPosicionesPares {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Integer sumaPosicionesPares(List<Integer> numeros) {
		Integer res = 0;
		for (int i = 0; i < numeros.size(); i += 2) {
			res += numeros.get(i);
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("sumaPosicionesPares", 90, sumaPosicionesPares(List.of(10, 20, 30, 40, 50)));
	}
}
