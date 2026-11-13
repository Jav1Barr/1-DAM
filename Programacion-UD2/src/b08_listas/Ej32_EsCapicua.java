package b08_listas;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 32
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve true si el número se lee igual al revés (los de una cifra lo son).
 *
 * FIRMA
 *   public static Boolean esCapicua(Integer n)
 *
 * EJEMPLOS
 *   esCapicua(1221)  ->  true
 *   esCapicua(123)  ->  false
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej32_EsCapicua {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Boolean esCapicua(Integer n) {
		Boolean res = n >= 0;
		if (res) {
			Integer resto = n;
			Integer invertido = 0;
			while (resto > 0) {
				invertido = invertido * 10 + resto % 10;
				resto = resto / 10;
			}
			res = invertido.equals(n);
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("esCapicua", true, esCapicua(1221));
		Prueba.comprueba("esCapicua", false, esCapicua(123));
	}
}
