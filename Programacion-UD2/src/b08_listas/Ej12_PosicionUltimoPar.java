package b08_listas;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 12
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve la posición del último número par, o -1 si no hay ninguno.
 *
 * FIRMA
 *   public static Integer posicionUltimoPar(List<Integer> numeros)
 *
 * EJEMPLOS
 *   posicionUltimoPar([3, 8, 5, 6, 7])  ->  3
 *   posicionUltimoPar([3, 5])  ->  -1
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej12_PosicionUltimoPar {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	// Se recorre entera y nos quedamos con la última posición que cumple.
	public static Integer posicionUltimoPar(List<Integer> numeros) {
		Integer res = -1;
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) % 2 == 0) {
				res = i;
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("posicionUltimoPar", 3, posicionUltimoPar(List.of(3, 8, 5, 6, 7)));
		Prueba.comprueba("posicionUltimoPar sin pares", -1, posicionUltimoPar(List.of(3, 5)));
	}
}
