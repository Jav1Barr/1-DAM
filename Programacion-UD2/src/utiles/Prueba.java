package utiles;

/** Comprobaciones para los ejercicios de los bloques 8 y 9: compara lo esperado con lo obtenido. */
public class Prueba {

	private static int fallos = 0;

	/** Escribe OK o FALLO según coincidan el resultado esperado y el obtenido. */
	public static void comprueba(String nombre, Object esperado, Object obtenido) {
		boolean ok = esperado == null ? obtenido == null : esperado.equals(obtenido);
		if (!ok) {
			fallos++;
		}
		System.out.println((ok ? "OK    " : "FALLO ") + nombre + " -> esperado " + esperado + ", obtenido " + obtenido);
	}

	/** Escribe el total de fallos acumulados (lo normal es que sea 0). */
	public static void resumen() {
		System.out.println("Total de fallos: " + fallos);
	}
}
