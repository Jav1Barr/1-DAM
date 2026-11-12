package ejercicios;
import java.util.List;

import utiles.Utiles;
public class Ejercicios {

	public static Integer precioAparcamiento(String tipo, Integer horas, Boolean abonado) {
		Integer res = 0;
		switch (tipo) {
		case "moto":
			if (horas > 0) {
				res = horas * 1;
				if (abonado == true) {
					res -= 3;
					if (horas >= 6) {
						res -= 5;
						if (res <= 0) {
							res = -1;
						}
					}
				}
			}
			break;
		case "coche":
			if (horas > 0) {
				res = horas * 2;
				if (abonado == true) {
					res -= 3;
					if (horas >= 6) {
						res -= 5;
						if (res <= 0) {
							res = -1;
						}
					}
				}
			}

			break;
		case "furgoneta":
			if (horas > 0) {
				res = horas * 4;
				if (abonado == true) {
					res -= 3;
					if (horas >= 6) {
						res -= 5;
						if (res <= 0) {
							res = -1;
						}
					}
				}
			}

			break;
		}
		return res;
	}
	public static void dibujarN(Integer lado) {
		for (int f = 0; f < lado; f++) {
			for (int c = 0; c < lado; c++) {
				if (f == c || c ==  0 || c == lado - 1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	public static Integer sumaPrimerosGemelos(Integer inicio, Integer fin) {
		Integer esGemelo = 0;
		Integer primo1 = 0;
		Integer primo2 = 0;
		for (int i = inicio; i <= fin; i ++) {
			if (Utiles.esPrimo(i)) {
				primo1 = i;
				i += 2;
				if (Utiles.esPrimo(i)) {
					primo2 = i;
					esGemelo = primo1 + primo2;
					break;
				} else {
					i -=2;
				}
			}
		}
		
		return esGemelo;
	}
	public static Integer contarCifrasImpares(Integer numero){
		Integer totalImpares = 0 ;
		if (numero == 0) {
			return 0;
		}
		if ((numero %10)% 2 != 0) {
			 return totalImpares +1 + contarCifrasImpares(numero/ 10);
		}else {
			return totalImpares + contarCifrasImpares(numero/ 10);
		}
		
	}
	
	public static Integer contarSaltosBruscos(List<Integer> temperaturas, Integer umbral) {
		Integer numeroDeSaltos = 0;
		Integer temperatura1 = 0;
		for(int i = 0 ; i < temperaturas.size() -1 ; i++ ) {
			temperatura1 = temperaturas.get(i);
			if ( temperaturas.get(i +1) - temperatura1>= umbral) {
				numeroDeSaltos ++;
			}
			
		}
		
		return numeroDeSaltos;
	}
	public static Integer primeraPosicionCapicua(List<Integer> numeros, Integer minimoCifras) {
		Integer res = -1;
		for(int i = 0; i < numeros.size(); i++) {
			Integer numero = numeros.get(i);
			Integer copia = numero;
			Integer cifras = 0;
			while( copia > 0) {
				cifras++;
				copia = copia/10;
			}
		}
		return res;
	}
}
