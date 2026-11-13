package b08_listas;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 25
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Reto: devuelve el segundo valor DISTINTO más grande de la lista, o null si no existe.
 *
 * FIRMA
 *   public static Integer segundoMayor(List<Integer> numeros)
 *
 * EJEMPLOS
 *   segundoMayor([4, 9, 7, 9])  ->  7
 *   segundoMayor([5, 5])  ->  null
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej25_SegundoMayor {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Integer segundoMayor(List<Integer> numeros) {
		Integer max = null;
		Integer segundo = null;
		for (Integer e : numeros) {
			if (max == null || e > max) {
				segundo = max;
				max = e;
			} else if (e < max && (segundo == null || e > segundo)) {
				segundo = e;
			}
		}
		return segundo;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("segundoMayor", 7, segundoMayor(List.of(4, 9, 7, 9)));
		Prueba.comprueba("segundoMayor no existe", null, segundoMayor(List.of(5, 5)));
	}
}
