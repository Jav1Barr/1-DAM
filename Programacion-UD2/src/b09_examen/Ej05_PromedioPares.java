package b09_examen;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 9 (tipo examen) · EJERCICIO 05
 * -------------------------------------------
 * ENUNCIADO
 *   Devuelve la media de los números pares de la lista; si no hay ninguno, 0.0.
 *
 * FIRMA
 *   public static Double promedioPares(List<Integer> numeros)
 *
 * EJEMPLOS
 *   promedioPares([3, 8, 5, 4, 10])  ->  7.33 (media de 8, 4 y 10)
 *   promedioPares([3, 5])  ->  0.0
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej05_PromedioPares {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Double promedioPares(List<Integer> numeros) {
		Integer suma = 0;
		Integer cantidad = 0;
		for (Integer e : numeros) {
			if (e % 2 == 0) {
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
		Double media = promedioPares(List.of(3, 8, 5, 4, 10));
		Prueba.comprueba("promedioPares (2 decimales)", "7.33", String.format(java.util.Locale.US, "%.2f", media));
		Prueba.comprueba("promedioPares sin pares", 0.0, promedioPares(List.of(3, 5)));
	}
}
