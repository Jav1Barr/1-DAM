package b08_listas;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 02
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve cuántos números de la lista son estrictamente mayores que el umbral.
 *
 * FIRMA
 *   public static Integer contarMayoresQue(List<Integer> numeros, Integer umbral)
 *
 * EJEMPLOS
 *   contarMayoresQue([4, 9, 12, 7, 3], 6)  ->  3
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej02_ContarMayoresQue {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Integer contarMayoresQue(List<Integer> numeros, Integer umbral) {
		Integer res = 0;
		for (Integer e : numeros) {
			if (e > umbral) {
				res++;
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("contarMayoresQue", 3, contarMayoresQue(List.of(4, 9, 12, 7, 3), 6));
	}
}
