package b08_listas;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 09
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve la suma de los números anteriores al primer 0 (si no hay ningún 0, la suma de toda
 *   la lista).
 *
 * FIRMA
 *   public static Integer sumaHastaCero(List<Integer> numeros)
 *
 * EJEMPLOS
 *   sumaHastaCero([5, 3, 0, 8])  ->  8
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej09_SumaHastaCero {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	// while + break.
	public static Integer sumaHastaCero(List<Integer> numeros) {
		Integer res = 0;
		int i = 0;
		while (i < numeros.size()) {
			Integer e = numeros.get(i);
			if (e == 0) {
				break;
			}
			res += e;
			i++;
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("sumaHastaCero", 8, sumaHastaCero(List.of(5, 3, 0, 8)));
	}
}
