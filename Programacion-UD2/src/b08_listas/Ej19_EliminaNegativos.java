package b08_listas;

import java.util.ArrayList;
import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 19
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve una lista nueva sin los números negativos.
 *
 * FIRMA
 *   public static List<Integer> eliminaNegativos(List<Integer> numeros)
 *
 * EJEMPLOS
 *   eliminaNegativos([3, -1, 4, -5])  ->  [3, 4]
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej19_EliminaNegativos {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static List<Integer> eliminaNegativos(List<Integer> numeros) {
		List<Integer> res = new ArrayList<>();
		for (Integer e : numeros) {
			if (e >= 0) {
				res.add(e);
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("eliminaNegativos", List.of(3, 4), eliminaNegativos(List.of(3, -1, 4, -5)));
	}
}
