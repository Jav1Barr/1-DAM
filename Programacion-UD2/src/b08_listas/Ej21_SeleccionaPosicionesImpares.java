package b08_listas;

import java.util.ArrayList;
import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 21
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve una lista nueva con los elementos de las posiciones 1, 3, 5...
 *
 * FIRMA
 *   public static List<Integer> seleccionaPosicionesImpares(List<Integer> numeros)
 *
 * EJEMPLOS
 *   seleccionaPosicionesImpares([10, 20, 30, 40])  ->  [20, 40]
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej21_SeleccionaPosicionesImpares {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static List<Integer> seleccionaPosicionesImpares(List<Integer> numeros) {
		List<Integer> res = new ArrayList<>();
		for (int i = 1; i < numeros.size(); i += 2) {
			res.add(numeros.get(i));
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("seleccionaPosicionesImpares", List.of(20, 40), seleccionaPosicionesImpares(List.of(10, 20, 30, 40)));
	}
}
