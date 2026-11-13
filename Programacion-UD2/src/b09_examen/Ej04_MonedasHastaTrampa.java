package b09_examen;

import java.util.List;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 9 (tipo examen) · EJERCICIO 04
 * -------------------------------------------
 * ENUNCIADO
 *   Cofres del dragón: suma las monedas de los cofres hasta encontrar uno con 0 (la trampa); a
 *   partir de ahí no se cuenta nada más.
 *
 * FIRMA
 *   public static Integer monedasHastaTrampa(List<Integer> cofres)
 *
 * EJEMPLOS
 *   monedasHastaTrampa([5, 10, 0, 20])  ->  15
 *   monedasHastaTrampa([5, 10])  ->  15
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej04_MonedasHastaTrampa {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	// while + break.
	public static Integer monedasHastaTrampa(List<Integer> cofres) {
		Integer total = 0;
		int i = 0;
		while (i < cofres.size()) {
			if (cofres.get(i) == 0) {
				break;
			}
			total += cofres.get(i);
			i++;
		}
		return total;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("monedasHastaTrampa", 15, monedasHastaTrampa(List.of(5, 10, 0, 20)));
		Prueba.comprueba("monedasHastaTrampa sin trampa", 15, monedasHastaTrampa(List.of(5, 10)));
	}
}
