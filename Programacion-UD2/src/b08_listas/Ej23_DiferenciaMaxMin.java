package b08_listas;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 23
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve la diferencia entre el máximo y el mínimo de la lista (0 si está vacía).
 *
 * FIRMA
 *   public static Integer diferenciaMaxMin(List<Integer> numeros)
 *
 * EJEMPLOS
 *   diferenciaMaxMin([4, 9, 1, 7])  ->  8
 *   diferenciaMaxMin([])  ->  0
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej23_DiferenciaMaxMin {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Integer diferenciaMaxMin(List<Integer> numeros) {
		Integer res = 0;
		if (!numeros.isEmpty()) {
			Integer max = numeros.get(0);
			Integer min = numeros.get(0);
			for (Integer e : numeros) {
				if (e > max) {
					max = e;
				}
				if (e < min) {
					min = e;
				}
			}
			res = max - min;
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("diferenciaMaxMin", 8, diferenciaMaxMin(List.of(4, 9, 1, 7)));
		Prueba.comprueba("diferenciaMaxMin vacía", 0, diferenciaMaxMin(List.of()));
	}
}
