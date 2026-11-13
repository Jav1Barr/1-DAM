package b08_listas;

import java.util.ArrayList;
import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 18
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Devuelve una lista nueva con los números mayores que el umbral, en el mismo orden.
 *
 * FIRMA
 *   public static List<Integer> seleccionaMayoresQue(List<Integer> numeros, Integer umbral)
 *
 * EJEMPLOS
 *   seleccionaMayoresQue([4, 9, 12, 7, 3], 6)  ->  [9, 12, 7]
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej18_SeleccionaMayoresQue {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static List<Integer> seleccionaMayoresQue(List<Integer> numeros, Integer umbral) {
		List<Integer> res = new ArrayList<>();
		for (Integer e : numeros) {
			if (e > umbral) {
				res.add(e);
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("seleccionaMayoresQue", List.of(9, 12, 7), seleccionaMayoresQue(List.of(4, 9, 12, 7, 3), 6));
	}
}
