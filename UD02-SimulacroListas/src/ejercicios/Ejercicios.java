package ejercicios;

import java.util.List;
import utiles.Utiles;

public class Ejercicios {

	// 1. Sumar una lista mediante for-each.
	public static Integer suma1(List<Integer> numeros) {
		Integer suma = 0;

		for (Integer numero : numeros) {
			suma += numero;
		}

		return suma;
	}

	// 2. Sumar una lista mediante for clásico (con índice).
	public static Integer suma2(List<Integer> numeros) {
		Integer suma = 0;

		for (int i = 0; i < numeros.size(); i++) {
			suma += numeros.get(i);
		}

		return suma;
	}

	// 3. Sumar una lista mediante while.
	public static Integer suma3(List<Integer> numeros) {
		Integer suma = 0;
		int i = 0;

		while (i < numeros.size()) {
			suma += numeros.get(i);
			i++;
		}

		return suma;
	}

	// 4. Contar los números pares, incluido el 0.
	public static Integer contarPares(List<Integer> numeros) {
		Integer contador = 0;

		for (Integer numero : numeros) {
			if (numero % 2 == 0) {
				contador++;
			}
		}

		return contador;
	}

	// 5. Contar los números primos mediante la clase Utiles.
	public static Integer contarPrimos(List<Integer> numeros) {
		Integer contador = 0;

		for (Integer numero : numeros) {
			if (Utiles.esPrimo(numero)) {
				contador++;
			}
		}

		return contador;
	}

	// 6. Contar los números perfectos mediante la clase Utiles.
	public static Integer contarPerfectos(List<Integer> numeros) {
		Integer contador = 0;

		for (Integer numero : numeros) {
			if (Utiles.esPerfecto(numero)) {
				contador++;
			}
		}

		return contador;
	}

	// 7. Calcular la media mediante for-each.
	public static Double media1(List<Integer> numeros) {

		Integer suma = 0;
		for (Integer numero : numeros) {
			suma += numero;
		}

		return (double) suma / numeros.size();
	}

	// 8. Calcular la media mediante for clásico.
	public static Double media2(List<Integer> numeros) {

		Integer suma = 0;
		for (int i = 0; i < numeros.size(); i++) {
			suma += numeros.get(i);
		}

		return (double) suma / numeros.size();
	}

	// 9. Calcular la media mediante while.
	public static Double media3(List<Integer> numeros) {

		Integer suma = 0;
		int i = 0;
		while (i < numeros.size()) {
			suma += numeros.get(i);
			i++;
		}

		return (double) suma / numeros.size();
	}

	// TODO Hacer aquí los ejercicios del examen
	// los haremos con distintos bucles

	// 10. Control de acceso al Baile de los Monstruos
	public static boolean puedeEntrar(Integer edad, boolean acompanado, String criatura) {

		Boolean puede = false;

		if (criatura == "vampiro") {
			puede = true;
		} else if (edad < 18 && acompanado == true) {
			puede = true;
		} else if (edad < 18 && acompanado == false) {
			puede = false;
		} else if (edad >= 18) {
			puede = true;
		}

		return puede;

	}

	// 11.Clasificador de caramelos

	public static Integer cuentaCaramelos(List<String> caramelos, String tipo) {
		int contador = 0;

		for (String caramelo : caramelos) {
			if (caramelo != null && caramelo.equals(tipo)) {
				contador++;
			}
		}
		return contador;
	}

	// 12.Contador de pasos en el Laberinto
	public static Integer pasosLaberinto(List<Integer> pasos) {
		Integer total = 0;
		Integer i = 0;
		while (i < pasos.size()) {
			Integer paso = pasos.get(i);
			if (paso < 0) {
				break; 
			}
			total += paso;
			i++;
		}
		return total;
	}
	
	// 13. Nivel medio de magia en las calabazas
	public static Double promedioMagia(List<Integer> niveles) {
        Integer suma = 0;
        Integer contador = 0;
        for (Integer nivel : niveles) {
            if (nivel >= 5) {
                suma += nivel;
                contador++;
            }
        }
        Double promedio = 0.0; 
        if (contador > 0) {
            promedio = (double) suma / contador;
        }
        return promedio;
    }
	
	//14.  Recursividad: Cuenta Atrás de Sustos
	public static void cuentaAtrasSustos(Integer n) {
	    if (n == 0) {                         
	        System.out.println("¡Susto final!");
	    } else {
	        System.out.println("Boo " + n);
	        cuentaAtrasSustos(n - 1);         
	    }
	}
	
	//15. La suma entre los dos ceros
	 public static Integer sumaEntreCeros(List<Integer> lista) {
	        Integer suma = 0;
	        
	        Integer primero = lista.indexOf(0);
	        Integer ultimo = lista.lastIndexOf(0);
	      
	        for (int i = primero +1; i < ultimo; i++) {
	            suma += lista.get(i);
	        }
	        return suma;
	    }

}
