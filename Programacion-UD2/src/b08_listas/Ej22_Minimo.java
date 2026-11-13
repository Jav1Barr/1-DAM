package b08_listas;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 22
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve el mínimo de la lista, o null si está vacía.
 *
 * FIRMA
 *   public static Integer minimo(List<Integer> numeros)
 *
 * EJEMPLOS
 *   minimo([7, 8, 3, 2])  ->  2
 *   minimo([])  ->  null
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej22_Minimo {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	// Se parte de null para que funcione con listas vacías.
	public static Integer minimo(List<Integer> numeros) {
		Integer res = null;
		for (Integer e : numeros) {
			if (res == null || e < res) {
				res = e;
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("minimo", 2, minimo(List.of(7, 8, 3, 2)));
		Prueba.comprueba("minimo vacía", null, minimo(List.of()));
	}
}
