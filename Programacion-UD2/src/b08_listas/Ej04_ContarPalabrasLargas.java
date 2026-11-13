package b08_listas;

import java.util.ArrayList;
import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 04
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve cuántas palabras tienen al menos «minimo» letras. La lista puede contener nulos,
 *   que se ignoran.
 *
 * FIRMA
 *   public static Integer contarPalabrasLargas(List<String> palabras, Integer minimo)
 *
 * EJEMPLOS
 *   contarPalabrasLargas([sol, casa, null, programacion, pez], 4)  ->  2
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej04_ContarPalabrasLargas {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	// Se ignoran los nulos antes de pedir la longitud.
	public static Integer contarPalabrasLargas(List<String> palabras, Integer minimo) {
		Integer res = 0;
		for (String p : palabras) {
			if (p != null && p.length() >= minimo) {
				res++;
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		List<String> palabras = new ArrayList<>();
		palabras.add("sol");
		palabras.add("casa");
		palabras.add(null);
		palabras.add("programacion");
		palabras.add("pez");
		Prueba.comprueba("contarPalabrasLargas", 2, contarPalabrasLargas(palabras, 4));
	}
}
