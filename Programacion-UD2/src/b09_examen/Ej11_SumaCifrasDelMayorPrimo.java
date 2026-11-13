package b09_examen;

import java.util.List;

import utiles.Prueba;
import utiles.Utiles;

/*
 * UD2 · BLOQUE 9 (tipo examen) · EJERCICIO 11
 * -------------------------------------------
 * ENUNCIADO
 *   Devuelve la suma de las cifras del mayor número primo de la lista, o -1 si no hay primos.
 *
 * FIRMA
 *   public static Integer sumaCifrasDelMayorPrimo(List<Integer> numeros)
 *
 * EJEMPLOS
 *   sumaCifrasDelMayorPrimo([10, 13, 29, 8, 15])  ->  11
 *   sumaCifrasDelMayorPrimo([4, 6, 8])  ->  -1
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej11_SumaCifrasDelMayorPrimo {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Integer sumaCifrasDelMayorPrimo(List<Integer> numeros) {
		Integer mayorPrimo = null;
		for (Integer e : numeros) {
			if (Utiles.esPrimo(e) && (mayorPrimo == null || e > mayorPrimo)) {
				mayorPrimo = e;
			}
		}
		Integer res = -1;
		if (mayorPrimo != null) {
			res = Utiles.sumaCifras(mayorPrimo);
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("sumaCifrasDelMayorPrimo", 11, sumaCifrasDelMayorPrimo(List.of(10, 13, 29, 8, 15)));
		Prueba.comprueba("sumaCifrasDelMayorPrimo sin primos", -1, sumaCifrasDelMayorPrimo(List.of(4, 6, 8)));
	}
}
