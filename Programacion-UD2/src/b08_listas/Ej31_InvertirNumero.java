package b08_listas;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 31
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve las cifras de un entero positivo al revés (123 -> 321).
 *
 * FIRMA
 *   public static Integer invertir(Integer n)
 *
 * EJEMPLOS
 *   invertir(123)  ->  321
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej31_InvertirNumero {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Integer invertir(Integer n) {
		Integer resto = n;
		Integer invertido = 0;
		while (resto > 0) {
			invertido = invertido * 10 + resto % 10;
			resto = resto / 10;
		}
		return invertido;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("invertir", 321, invertir(123));
	}
}
