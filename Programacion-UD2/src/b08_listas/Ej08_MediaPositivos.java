package b08_listas;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 08
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve la media de los números positivos (el 0 no es positivo). Si no hay ninguno,
 *   devuelve 0.0.
 *
 * FIRMA
 *   public static Double mediaPositivos(List<Integer> numeros)
 *
 * EJEMPLOS
 *   mediaPositivos([4, -2, 6, 0, -8, 2])  ->  4.0
 *   mediaPositivos([-1, 0])  ->  0.0
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej08_MediaPositivos {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Double mediaPositivos(List<Integer> numeros) {
		Integer suma = 0;
		Integer cantidad = 0;
		for (Integer e : numeros) {
			if (e > 0) {
				suma += e;
				cantidad++;
			}
		}
		Double res = 0.0;
		if (cantidad > 0) {
			res = (double) suma / cantidad;
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("mediaPositivos", 4.0, mediaPositivos(List.of(4, -2, 6, 0, -8, 2)));
		Prueba.comprueba("mediaPositivos sin positivos", 0.0, mediaPositivos(List.of(-1, 0)));
	}
}
