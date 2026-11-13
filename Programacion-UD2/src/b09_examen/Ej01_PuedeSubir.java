package b09_examen;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 9 (tipo examen) · EJERCICIO 01
 * -------------------------------------------
 * ENUNCIADO
 *   Atracción del parque: se puede subir con 120 cm o más; entre 100 y 119 cm, solo si va
 *   acompañado; con menos de 100 cm, no.
 *
 * FIRMA
 *   public static Boolean puedeSubir(Integer altura, Boolean acompanado)
 *
 * EJEMPLOS
 *   puedeSubir(125, false)  ->  true
 *   puedeSubir(110, true)  ->  true
 *   puedeSubir(110, false)  ->  false
 *   puedeSubir(90, true)  ->  false
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej01_PuedeSubir {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Boolean puedeSubir(Integer altura, Boolean acompanado) {
		Boolean res;
		if (altura >= 120) {
			res = true;
		} else if (altura >= 100) {
			res = acompanado;
		} else {
			res = false;
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("puedeSubir 125", true, puedeSubir(125, false));
		Prueba.comprueba("puedeSubir 110 acompañado", true, puedeSubir(110, true));
		Prueba.comprueba("puedeSubir 110 solo", false, puedeSubir(110, false));
		Prueba.comprueba("puedeSubir 90", false, puedeSubir(90, true));
	}
}
