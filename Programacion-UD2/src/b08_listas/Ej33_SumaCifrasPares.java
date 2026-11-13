package b08_listas;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 33
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve la suma de las cifras pares de un entero positivo (4826 -> 20).
 *
 * FIRMA
 *   public static Integer sumaCifrasPares(Integer n)
 *
 * EJEMPLOS
 *   sumaCifrasPares(4826)  ->  20
 *   sumaCifrasPares(135)  ->  0
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej33_SumaCifrasPares {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	// Solo suma las cifras pares (el 0 suma 0, da igual).
	public static Integer sumaCifrasPares(Integer n) {
		Integer resto = n;
		Integer suma = 0;
		while (resto > 0) {
			Integer cifra = resto % 10;
			if (cifra % 2 == 0) {
				suma += cifra;
			}
			resto = resto / 10;
		}
		return suma;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("sumaCifrasPares", 20, sumaCifrasPares(4826));
		Prueba.comprueba("sumaCifrasPares", 0, sumaCifrasPares(135));
	}
}
