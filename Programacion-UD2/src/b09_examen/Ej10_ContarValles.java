package b09_examen;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 9 (tipo examen) · EJERCICIO 10
 * -------------------------------------------
 * ENUNCIADO
 *   Cuenta los valles: elementos menores que sus dos vecinos. El primero y el último no
 *   cuentan.
 *
 * FIRMA
 *   public static Integer contarValles(List<Integer> alturas)
 *
 * EJEMPLOS
 *   contarValles([5, 2, 6, 3, 8, 1, 4])  ->  3
 *   contarValles([1, 2, 3])  ->  0
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej10_ContarValles {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Integer contarValles(List<Integer> alturas) {
		Integer res = 0;
		for (int i = 1; i < alturas.size() - 1; i++) {
			Integer e = alturas.get(i);
			if (e < alturas.get(i - 1) && e < alturas.get(i + 1)) {
				res++;
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("contarValles", 3, contarValles(List.of(5, 2, 6, 3, 8, 1, 4)));
		Prueba.comprueba("contarValles", 0, contarValles(List.of(1, 2, 3)));
	}
}
