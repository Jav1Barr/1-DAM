package b08_listas;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 24
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve la posición del máximo (la primera, si se repite), o -1 si la lista está vacía.
 *
 * FIRMA
 *   public static Integer posicionDelMaximo(List<Integer> numeros)
 *
 * EJEMPLOS
 *   posicionDelMaximo([3, 9, 2, 9])  ->  1
 *   posicionDelMaximo([])  ->  -1
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej24_PosicionDelMaximo {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	// Con > (y no >=) nos quedamos con la primera aparición.
	public static Integer posicionDelMaximo(List<Integer> numeros) {
		Integer res = -1;
		for (int i = 0; i < numeros.size(); i++) {
			if (res == -1 || numeros.get(i) > numeros.get(res)) {
				res = i;
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("posicionDelMaximo", 1, posicionDelMaximo(List.of(3, 9, 2, 9)));
		Prueba.comprueba("posicionDelMaximo vacía", -1, posicionDelMaximo(List.of()));
	}
}
