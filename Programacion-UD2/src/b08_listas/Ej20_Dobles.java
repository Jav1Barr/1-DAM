package b08_listas;

import java.util.ArrayList;
import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 20
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve una lista nueva con el doble de cada número.
 *
 * FIRMA
 *   public static List<Integer> dobles(List<Integer> numeros)
 *
 * EJEMPLOS
 *   dobles([1, 2, 3])  ->  [2, 4, 6]
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej20_Dobles {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static List<Integer> dobles(List<Integer> numeros) {
		List<Integer> res = new ArrayList<>();
		for (Integer e : numeros) {
			res.add(e * 2);
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("dobles", List.of(2, 4, 6), dobles(List.of(1, 2, 3)));
	}
}
