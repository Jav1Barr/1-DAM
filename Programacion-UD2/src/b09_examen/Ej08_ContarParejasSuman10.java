package b09_examen;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 9 (tipo examen) · EJERCICIO 08
 * -------------------------------------------
 * ENUNCIADO
 *   Cuenta las parejas de posiciones consecutivas que suman 10. Las parejas no se solapan: si
 *   una pareja suma 10, se salta a la siguiente posición.
 *
 * FIRMA
 *   public static Integer contarParejasSuman10(List<Integer> numeros)
 *
 * EJEMPLOS
 *   contarParejasSuman10([4, 6, 5, 5, 3])  ->  2
 *   contarParejasSuman10([5, 5, 5])  ->  1
 *   contarParejasSuman10([1, 2, 3])  ->  0
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej08_ContarParejasSuman10 {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Integer contarParejasSuman10(List<Integer> numeros) {
		Integer res = 0;
		for (int i = 0; i < numeros.size() - 1; i++) {
			if (numeros.get(i) + numeros.get(i + 1) == 10) {
				res++;
				i++; // salta la segunda posición de la pareja
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("contarParejasSuman10", 2, contarParejasSuman10(List.of(4, 6, 5, 5, 3)));
		Prueba.comprueba("contarParejasSuman10", 1, contarParejasSuman10(List.of(5, 5, 5)));
		Prueba.comprueba("contarParejasSuman10", 0, contarParejasSuman10(List.of(1, 2, 3)));
	}
}
