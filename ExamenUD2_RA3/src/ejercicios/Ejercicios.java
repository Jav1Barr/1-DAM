package ejercicios;

import java.util.List;

public class Ejercicios {
	public static String clasificarTriangulo(Integer a, Integer b, Integer c) {
		Integer mayor = 0;
		Integer menor1 = 0;
		Integer menor2 = 0;
		String res = "invalido";
		if (a >= b && a >= c) {
			mayor = a;
			menor1 = b;
			menor2 = c;
		} else if (b >= a && b >= c) {
			mayor = b;
			menor1 = a;
			menor2 = c;
		} else {
			mayor = c;
			menor1 = a;
			menor2 = b;
		}
		if (mayor < menor1 + menor2 && menor1 < mayor + menor2 && menor2 < menor1 + mayor) {
			if ((mayor * mayor) == (menor1 * menor1) + (menor2 * menor2)) {
				res = "RECTANGULO";
			} else if (mayor == menor1 && mayor == menor2 && menor1 == menor2) {
				res = "EQUILATERO";
			} else if (mayor == menor1 && mayor != menor2 || mayor == menor2 && mayor != menor1
					|| menor1 == menor2 && menor1 != mayor) {
				res = "ISOSCELES";
			} else if (mayor != menor1 && mayor != menor2 && menor1 != menor2) {
				res = "ESCALENO";
			}
		}
		return res;
	}

	public static void trianguloAlterno(Integer n) {
		for (int f = 0; f < n; f++) { // bucle que recorre las filas
			for (int c = 0; c <= f; c++) { // bucle que recorre las columnas
				if ((f + c) % 2 == 0) { // si la suma de fila y columna es par
					System.out.print("1"); // pintamos 1
				} else {
					System.out.print("0"); // Si no pintamos 0
				}
			}
			System.out.println();
		}

	}

	public static Integer primeroConDivisores(Integer inicio, Integer fin, Integer minimoDivisores) {
		Integer res = -1;
		for (int n = inicio; n <= fin; n++) {
			Integer cantidadDivisores = 0;
			for (int divisor = 1; divisor < n; divisor++) {
				if (n % divisor == 0) {
					cantidadDivisores++;

				}
			}
			if (cantidadDivisores >= minimoDivisores) {
				res = n;
				break;
			}
		}
		return res;

	}

	public static Integer tribonacci(Integer n) {
		Integer res;
		if (n == 0) {// caso base
			res = 0;
		} else if (n == 1) {// caso base
			res = 1;
		} else if (n == 2) {// caso base
			res = 1;
		} else {// caso recursivo
			res = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
		}
		return res;
	}

	public static Boolean esCasiCreciente(List<Integer> datos) {
		Boolean res = false;
		Integer cuentaRuptura = 0;
		for (int i = 1; i < datos.size(); i++) {
			if (datos.get(i - 1) >= datos.get(i)) {
				cuentaRuptura++;
			}
		}
		if (cuentaRuptura < 2) {
			res = true;
		}
		return res;
	}

	public static Boolean alternatesEvenOdd(List<Integer> numbers) {
		Boolean solution = false;
		Integer count = 0;
		if (numbers.size() <= 1) {
			solution = true;
		}
		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(i - 1) % 2 == 0 && numbers.get(i) % 2 != 0
					|| numbers.get(i - 1) % 2 != 0 && numbers.get(i) % 2 == 0) {
				count++;
			}
		}
		if (count == (numbers.size() - 1)) {
			solution = true;
		}
		return solution;
	}
}
