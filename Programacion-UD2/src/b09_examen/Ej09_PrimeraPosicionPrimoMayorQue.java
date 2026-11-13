package b09_examen;

import java.util.List;

import utiles.Prueba;
import utiles.Utiles;

/*
 * UD2 · BLOQUE 9 (tipo examen) · EJERCICIO 09
 * -------------------------------------------
 * ENUNCIADO
 *   Devuelve la posición del primer número primo estrictamente mayor que el umbral, o -1 si no
 *   hay ninguno.
 *
 * FIRMA
 *   public static Integer primeraPosicionPrimoMayorQue(List<Integer> numeros, Integer umbral)
 *
 * EJEMPLOS
 *   primeraPosicionPrimoMayorQue([4, 12, 11, 7, 20], 10)  ->  2
 *   primeraPosicionPrimoMayorQue([4, 6, 8], 1)  ->  -1
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej09_PrimeraPosicionPrimoMayorQue {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Integer primeraPosicionPrimoMayorQue(List<Integer> numeros, Integer umbral) {
		Integer res = -1;
		int i = 0;
		while (i < numeros.size()) {
			Integer e = numeros.get(i);
			if (e > umbral && Utiles.esPrimo(e)) {
				res = i;
				break;
			}
			i++;
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("primeraPosicionPrimoMayorQue", 2, primeraPosicionPrimoMayorQue(List.of(4, 12, 11, 7, 20), 10));
		Prueba.comprueba("primeraPosicionPrimoMayorQue ninguno", -1, primeraPosicionPrimoMayorQue(List.of(4, 6, 8), 1));
	}
}
