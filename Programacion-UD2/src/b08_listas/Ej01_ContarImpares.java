package b08_listas;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 01
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve cuántos números impares hay en la lista.
 *
 * FIRMA
 *   public static Integer contarImpares(List<Integer> numeros)
 *
 * EJEMPLOS
 *   contarImpares([3, 8, 5, 2, 7])  ->  3
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej01_ContarImpares {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Integer contarImpares(List<Integer> numeros) {
		Integer res = 0;
		for (Integer e : numeros) {
			if (e % 2 != 0) { // con negativos, -3 % 2 vale -1, por eso != 0
				res++;
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("contarImpares", 3, contarImpares(List.of(3, 8, 5, 2, 7)));
	}
}
