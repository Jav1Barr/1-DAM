package ejercicios;

import utiles.Utiles;

public class Ejercicios {
	public static Integer precioEntrada(Integer edad, String dia, Boolean socio) {
		Integer precioFinal = 0;
		Integer precioLJ = 8;
		Integer precioV = 10;
		Integer precioSD = 12;
		Integer descuentoEdad = 3;
		Integer descuentoSocio = 2;
		switch (dia) {
		case "LUNES","MARTES","MIERCOLES","JUEVES":
			if (edad <= 12 || edad >= 65 && socio == true) {
				precioFinal = precioLJ - descuentoEdad - descuentoSocio;
			} else if (edad <= 12 || edad >= 65) {
				precioFinal = precioLJ - descuentoEdad ;
			} else if (socio == true) {
				precioFinal = precioLJ - descuentoSocio;
			} else if (edad < 0) {
				System.out.println("-1");
			} else {
				precioFinal = precioLJ;
			}
			break;
		case "VIERNES":
			if (edad <= 12 || edad >= 65 && socio == true) {
				precioFinal = precioV - descuentoEdad - descuentoSocio;
			} else if (edad <= 12 || edad >= 65) {
				precioFinal = precioV - descuentoEdad;
			} else if (socio == true) {
				precioFinal = precioV - descuentoSocio;
			} else if (edad < 0) {
				System.out.println("-1");
			} else {
				precioFinal = 10;
			}
			break;
		case "SABADO", "DOMINGO":
			if (edad <= 12 || edad >= 65 && socio == true) {
				precioFinal = precioSD - descuentoSocio - descuentoEdad;
			} else if (edad <= 12 || edad >= 65) {
				precioFinal = precioSD - descuentoEdad;
			} else if (socio == true) {
				precioFinal = precioSD - descuentoSocio;
			} else if (edad < 0) {
				System.out.println("-1");
			} else {
				precioFinal = precioSD;
			}
		break;
		}
		return precioFinal;
	}
	public static void dibujarZ(Integer lado) {
		for (int f = 0; f < lado; f++)  { //bucle for que escribe las filas 
			for (int c = 0; c < lado; c++) { // bucle for que escribe las columnas
				if(c == lado - f - 1 || f == 0 || f == lado - 1) { //if que determina donde se pinta
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}
	}
	public static Integer sumaPrimerosEspeciales(Integer inicio, Integer fin, Integer
			cantidad) {
			Integer sumaFinal = 0;
			Integer veces = 1;
			for(int i = inicio; i <= fin; i++) {
				if(Utiles.esPrimo(i) || Utiles.esPerfecto(i)) {
					sumaFinal += i;
					veces++;
					if(veces > cantidad) {
						break;
					}
				}
				
			}
			
			return sumaFinal;
	}
	
	public static Integer factorialConSaltos(Integer numero, Integer salto) {
		Integer res =1;
		if (numero <= 0) { // si n es menos o igual que 0 se corta el bucle
			res =1;
		}else {
			res = numero * factorialConSaltos(numero - salto, salto); // mientras numero se multiplica por si mismo menos el valor de saltos y se repite saltos para pasar los mismos valores que pides
		}
		return res;
	}
	// public static Integer contarPicos(List<Integer> alturas, Integer diferenciaMinima) {
	// 	Integer totalPicos = 0;
	// 	for () {
			
	// 	}
	// 	return totalPicos;
	// } 
}

 
