package b08_listas;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 06
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve la suma de los cuadrados de los números de la lista.
 *
 * FIRMA
 *   public static Integer sumaCuadrados(List<Integer> numeros)
 *
 * EJEMPLOS
 *   sumaCuadrados([1, 2, 3])  ->  14
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej06_SumaCuadrados {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Integer sumaCuadrados(List<Integer> numeros) {
		Integer res = 0;
		for (Integer e : numeros) {
			res += e * e;
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("sumaCuadrados", 14, sumaCuadrados(List.of(1, 2, 3)));
	}
}
