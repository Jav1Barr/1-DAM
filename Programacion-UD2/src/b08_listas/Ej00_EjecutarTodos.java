package b08_listas;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJECUTAR TODOS
 * ---------------------------------------------------------------
 * Ejecuta de una vez los ejemplos de TODOS los ejercicios de este bloque y muestra al final
 * el total de fallos (debe salir 0). Para probar un solo ejercicio, ejecuta su archivo.
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej00_EjecutarTodos {

	public static void main(String[] args) {
		System.out.println("\n--- Contadores ---");
		Ej01_ContarImpares.probar();
		Ej02_ContarMayoresQue.probar();
		Ej03_ContarMultiplosDe.probar();
		Ej04_ContarPalabrasLargas.probar();
		Ej05_ContarCapicuas.probar();
		System.out.println("\n--- Sumas y medias ---");
		Ej06_SumaCuadrados.probar();
		Ej07_SumaPosicionesPares.probar();
		Ej08_MediaPositivos.probar();
		Ej09_SumaHastaCero.probar();
		Ej10_SumaDespuesDelPrimerNegativo.probar();
		System.out.println("\n--- Búsqueda (existe) ---");
		Ej11_ContieneNegativo.probar();
		Ej12_PosicionUltimoPar.probar();
		Ej13_PrimerMultiploDe.probar();
		Ej14_HayConsecutivosIguales.probar();
		System.out.println("\n--- Comprobación (para todo) ---");
		Ej15_TodosPositivos.probar();
		Ej16_EsEstrictamenteDecreciente.probar();
		Ej17_EsPalindromo.probar();
		System.out.println("\n--- Selección ---");
		Ej18_SeleccionaMayoresQue.probar();
		Ej19_EliminaNegativos.probar();
		Ej20_Dobles.probar();
		Ej21_SeleccionaPosicionesImpares.probar();
		System.out.println("\n--- Máximo y mínimo ---");
		Ej22_Minimo.probar();
		Ej23_DiferenciaMaxMin.probar();
		Ej24_PosicionDelMaximo.probar();
		Ej25_SegundoMayor.probar();
		System.out.println("\n--- Recursividad y cifras ---");
		Ej26_SumaRecursiva.probar();
		Ej27_PotenciaRecursiva.probar();
		Ej28_ContarCifrasRecursivo.probar();
		Ej29_Mcd.probar();
		Ej30_CuentaAtrasCohete.probar();
		Ej31_InvertirNumero.probar();
		Ej32_EsCapicua.probar();
		Ej33_SumaCifrasPares.probar();
		Prueba.resumen();
	}
}
