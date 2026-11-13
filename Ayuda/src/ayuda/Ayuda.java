package ayuda;

public class Ayuda {
	// ==========================================
	// PÁGINA 1: BUCLE FOR
	// ==========================================
	// BUCLE FOR
	//
	// for (int i = 0; i < 5; i++) {
//	         1        2      3
//	     System.out.println("El valor de i: " + i);
	// }
	//
	// 1 -> Valor inicial de i o la variable.
	// 2 -> Hasta cuando nuestro valor sera verdadero y se pintará.
	// 3 -> Código para sumarle a nuestra variable un dígito.


	// ==========================================
	// PÁGINA 2: BUCLE WHILE
	// ==========================================
	// BUCLE WHILE
	//
	// int i = 0;
	// while (i < 5) {
//	     System.out.println("Este es el valor: " + i);
//	     i++;
	// }
	//
	// Ej: contar números pares
	// int par = 0;
	// while (par <= 20) {
//	     syso(par); // System.out.println(par);
//	     par = par + 2;
	// }


	// ==========================================
	// PÁGINA 3: BUCLE DO-WHILE
	// ==========================================
	// BUCLE DO-WHILE
	//
	// -> Este bucle se va a repetir mínimo una vez.
	//
	// do {
//	     System.out.println("Este es el valor: " + i);
//	     i++;
	// } while (false);
	//
	// - Console:
	// Este es el valor: 0


	// ==========================================
	// PÁGINA 4: SWITCH + BREAK
	// ==========================================
	// SWITCH + BREAK
	//
	// a = 1;
	// switch (a * 2) {
//	     case 1:
//	         syso("Hola"); // System.out.println("Hola");
//	         break;
//	     case 2:
//	         syso("Paco");
//	     case 3:
//	         syso("Adiós");
//	         break;
//	     default:
//	         syso("sin coincidencia");
	// }
	//
	// [Nota al margen]: Día 27 oct, voy más perdido que el barco del arroz.


	// ==========================================
	// PÁGINA 5: LISTAS (ArrayList)
	// ==========================================
	// Listas -> esto es modificable, no se establece tamaño fijo, a diferencia del array.
	//
	// // Declaración y creación
	// ArrayList<String> names = new ArrayList<>();
	//
	// // Añadir elementos
	// names.add("Brais");
	// names.add("Choco");
	//
	// // Acceder a los elementos
	// syso(names.getFirst());
	// syso(names.getLast());
	// syso(names.get(2)); // -> posición específica
	//
	// // Tamaño
	// syso(names.size());


	// ==========================================
	// PÁGINA 6: CÓMO EMPEZAR UN EJERCICIO
	// ==========================================
	// 1.) ¿Cómo empezar?
	// contar cuántos -> contador
	// sumar todo... -> suma
	// calcular media -> contador + suma
	// Buscar un elemento -> booleano
	// comprobar si existe -> booleano
	// obtén el mayor -> variable mayor
	// Obtén el menor -> variable menor
	// Recorrer una lista -> bucle
	// Repetir hasta que... -> while o do while
	//
	// 2.) Identifica qué recibes
	// - Un número: Integer n
	// - Texto: String
	// - Lista de números: List<Integer> lis
	// - Lista de textos: List<String> lis


	// ==========================================
	// PÁGINA 7: VARIABLES Y CONTADOR
	// ==========================================
	// 3.) ¿Qué variables necesito?
	// - Contar -> int contador = 0;
	// - Sumar -> int suma = 0;
	// - Encontrar algo -> boolean encontrado = false;
	//
	// 4.) Escoge un bucle
	// 5.) Devuelve el resultado con return;
	//
	// A) Contador -> se utiliza para saber cuántas veces ocurre algo
	//
	// int contador = 0;
	// for ... {
//	     if ... {
//	         contador++;
//	     }
	// }
	// return contador;
	//
	// [Recuadro]:
	// - contador = 0 -> antes del bucle
	// - contador++ -> dentro del if
	// - return contador -> final del bucle (después).


	// ==========================================
	// PÁGINA 8: ACUMULADOR Y TIPOS DE FOR
	// ==========================================
	// B) Acumulador -> cuando queremos sumar cantidades
	//
	// int suma = 0;
	// for (int i = 1; i <= n; i++) {
//	     suma = suma + i;
	// }
	// return suma;
	//
	// [Recuadro]:
	// - contador++ -> Aumento de 1 en 1
	// - suma = suma + i -> Acumula el valor i
	//
	// 3. QUÉ BUCLE UTILIZO
	// A) FOR Clásico
	// -> Cuando quieres repetir algo un número determinado de veces.
	//
	// B) FOR Extendido
	// -> Cuando tienes una lista y quieres recorrer sus elementos
	// for (String elemento : lista) {
//	     // Código
	// }
	//
	// [Ejemplo inferior]:
	// int contador = 0;
	// for (String elemento : list) {
//	     if (elemento.equals("dulce")) {
//	         contador++;
//	     }
	// }
	// return contador;
	
	// ==========================================
	// PÁGINA 9: DO WHILE
	// ==========================================
	// C) DO WHILE[cite: 9]
	// -> Cuando necesitas que el código se ejecute al menos una vez[cite: 9]
	//
	// do {[cite: 9]
//	     // código[cite: 9]
	// } while (condicion);[cite: 9]
	//
	// int contador = 0;[cite: 9]
	// do {[cite: 9]
//	     contador++;[cite: 9]
//	     n--;[cite: 9]
	// } while (n > 0);[cite: 9]
	// return contador;[cite: 9]


	// ==========================================
	// PÁGINA 10: CÓMO ELEGIR BUCLE Y OPERADORES
	// ==========================================
	// 4.) CÓMO ELEGIR EL BUCLE[cite: 10]
	// - Repetir 10 veces -> for clásico[cite: 10]
	// - Recorrer una lista por posiciones -> for clásico[cite: 10]
	// - Recorrer todos los elementos de una lista -> for extendido[cite: 10]
	// - Repetir mientras se cumple algo -> while[cite: 10]
	// - Ejecutar al menos una vez -> do while[cite: 10]
	//
	// 5.) OPERADORES IMPORTANTES[cite: 10]
	// == -> igual que[cite: 10]
	// != -> distinto de[cite: 10]
	// >= -> mayor o igual[cite: 10]
	// && -> y[cite: 10]
	// > -> mayor que[cite: 10]
	// < -> menor que[cite: 10]
	// <= -> menor o igual[cite: 10]
	// % -> resto de división[cite: 10]
	//
	// - si es par -> n % 2 == 0[cite: 10]
	// - si es impar -> n % 2 != 0[cite: 10]


	// ==========================================
	// PÁGINA 11: MÉTODOS DE LISTAS Y UTILES
	// ==========================================
	// 7. Listas[cite: 11]
	// List<String> list = List.of("dulce", "ácido" ...);[cite: 11]
	//
	// Método[cite: 11]
	// -> lista.size() -> saber cuántos elementos hay[cite: 11]
	// -> lista.get(i) -> obtener un elemento por posición[cite: 11]
	// -> lista.contains("dulce") -> comprobar si existe un elemento[cite: 11]
	// -> lista.isEmpty() -> comprobar si está vacía[cite: 11]
	//
	// * Para meternos en Utiles[cite: 11]
	// if (Utiles.esPrimo(i)) {[cite: 11]


	// ==========================================
	// PÁGINA 12: CONTAR NÚMEROS Y CORTAR EN NEGATIVO
	// ==========================================
	// * Contar números de lista y cortar en un negativo[cite: 12]
	//
	// int cont = 0;[cite: 12]
	// int i = 0;[cite: 12]
	// while (i < pares.size()) {[cite: 12]
//	     Integer parActual = pares.get(i);[cite: 12]
//	     if (parActual < 0) {[cite: 12]
//	         break;[cite: 12]
//	     }[cite: 12]
//	     if (parActual != null) {[cite: 12]
//	         cont += parActual;[cite: 12]
//	     }[cite: 12]
//	     i++;[cite: 12]
	// }[cite: 12]
	// return cont;[cite: 12]


	// ==========================================
	// PÁGINA 13: BÚSQUEDA EN LISTA
	// ==========================================
	// BÚSQUEDA[cite: 13]
	//
	// boolean encontrado = false;[cite: 13]
	// int i = 0, posicion = -1;[cite: 13]
	// while (i < lista.size() && !encontrado) {[cite: 13]
//	     if (lista.get(i) % 2 == 0 && lista.get(i) > 0) { // Encontramos uno bueno[cite: 13]
//	         encontrado = true;[cite: 13]
//	         posicion = i;[cite: 13]
//	     }[cite: 13]
//	     i++;[cite: 13]
	// }[cite: 13]
	// return posicion;[cite: 13]
	//
	// - Si te piden si la lista está ordenada o buscar dos números iguales seguidos:[cite: 13]
	// lista.get(i + 1)[cite: 13]
	// while (i < lista.size() - 1 && ... )[cite: 13]


	// ==========================================
	// PÁGINA 14: COMPROBACIÓN
	// ==========================================
	// Comprobación[cite: 14]
	//
	// 1.) boolean resultado = true;[cite: 14]
	// int i = 0;[cite: 14]
	// while (i < lista.size() && resultado) {[cite: 14]
//	     if (lista.get(i) % 2 != 0) { // si encontramos uno que falle[cite: 14]
//	         resultado = false;[cite: 14]
//	     }[cite: 14]
//	     i++;[cite: 14]
	// }[cite: 14]
	// return resultado;[cite: 14]


	// ==========================================
	// PÁGINA 15: CUENTA ATRÁS (RECURSIVIDAD)
	// ==========================================
	// * Cuenta atrás[cite: 15]
	//
	// if (n == null || n <= 0) {[cite: 15]
//	     syso("SUSTO FINAL"); // System.out.println("SUSTO FINAL");[cite: 15]
//	     return;[cite: 15]
	// }[cite: 15]
	// syso("Boo" + n);[cite: 15]
	// cuentaAtrasSustos(n - 1);[cite: 15]


	// ==========================================
	// PÁGINA 16: FIBONACCI (LISTA)
	// ==========================================
	// Fibonacci[cite: 16]
	// -> Devuelve una lista con los n primeros números de Fibonacci[cite: 16]
	//
	// if (n >= 1) {[cite: 16]
//	     lista.add(0);[cite: 16]
	// }[cite: 16]
	// if (n >= 2) {[cite: 16]
//	     lista.add(1);[cite: 16]
	// }[cite: 16]
	// for (int i = 2; i < n; i++) {[cite: 16]
//	     int siguiente = lista.get(i - 1) + lista.get(i - 2); // (Nota: en el cuaderno falta "+ lista.get(i - 2)")[cite: 16]
//	     lista.add(siguiente);[cite: 16]
	// }[cite: 16]
	// return lista;[cite: 16]


	// ==========================================
	// PÁGINA 17: FIBONACCI SIN RECURSIVIDAD
	// ==========================================
	// Fibonacci[cite: 17]
	// -> Calcula n de Fibonacci sin usar recursividad[cite: 17]
	//
	// int res;[cite: 17]
	// if (n <= 1) {[cite: 17]
//	     res = n;[cite: 17]
	// } else {[cite: 17]
//	     int a = 0; // f(0)[cite: 17]
//	     int b = 1; // f(1)[cite: 17]
//	     int suma = 0;[cite: 17]
//	     for (int i = 2; i <= n; i++) {[cite: 17]
//	         suma = a + b;[cite: 17]
//	         a = b; // el segundo a el primero[cite: 17]
//	         b = suma; // nuevo pasa a ser el segundo[cite: 17]
//	     }[cite: 17]
//	     res = b;[cite: 17]
	// }[cite: 17]
	// return res;[cite: 17]


	// ==========================================
	// PÁGINA 18: FIBONACCI CON RECURSIVIDAD
	// ==========================================
	// Fibonacci[cite: 18]
	// -> Se puede dar de 1 en 1 o de 2 en 2[cite: 18]
	//
	// int res;[cite: 18]
	// if (n == 0) { // -> los dos primeros ya me los sé[cite: 18]
//	     res = 0;[cite: 18]
	// } else if (n == 1) {[cite: 18]
//	     res = 1;[cite: 18]
	// } else { // -> Cualquier otro número sumo los dos anteriores[cite: 18]
//	     res = fibonacci(n - 1) + fibonacci(n - 2); // Calcula los 2 anteriores[cite: 18]
	// }[cite: 18]
	// return res;[cite: 18]
	//
	// + Si hay un (n - 3), tengo que meter 3 casos base[cite: 18]
	// como n == 0, n == 1, n == 2 (en el cuaderno pone n == 3)[cite: 18]
	//
	// fibonacci(n - 1) -> número de detrás (ayer)[cite: 18]
	// fibonacci(n - 2) -> dos detrás (anteayer)[cite: 18]
	// fibonacci(n - 3) -> hace tres días / 3 detrás[cite: 18]
	
	
	// ==========================================
	// PÁGINA 19: TRIBONACCI
	// ==========================================
	// Tribonacci[cite: 19]
	// -> Cada número es la suma de los 3 anteriores[cite: 19]
	// Ej: tirar un dado y sumar sus formas o subir una escalera dando pasos de 1, 2 o 3[cite: 19]
	//
	// public int tribonacci(int n)[cite: 19]
	// int res;[cite: 19]
	// if (n == 0) {[cite: 19]
//	     res = 0;[cite: 19]
	// } else if (n == 1 || n == 2) {[cite: 19]
//	     res = 1;[cite: 19]
	// } else {[cite: 19]
//	     res = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);[cite: 19]
	// }[cite: 19]
	// return res;[cite: 19]
	//
	// ------------------------------------------
	// Si llega a n - 2 -> necesito 2 casos base[cite: 19]
	// n == 0 || n == 1[cite: 19]


	// ==========================================
	// PÁGINA 20: TRIÁNGULOS HUECOS
	// ==========================================
	// [Dibujo: Triángulo rectángulo hueco][cite: 20]
	// for (int i = 1; i <= n; i++) {[cite: 20]
//	     for (int j = 1; j <= i; j++) {[cite: 20]
//	         if (j == 1 || j == i || i == n)[cite: 20]
//	     }[cite: 20]
	// }[cite: 20]
	//
	// [Dibujo: Pirámide / Triángulo isósceles hueco][cite: 20]
	// for (int i = 1; i <= n; i++) {[cite: 20]
//	     for (int esp = 1; esp <= n - i; esp++) {[cite: 20]
//	         syso(" "); // System.out.print(" ");[cite: 20]
//	     }[cite: 20]
//	     for (int j = 1; j <= 2 * i - 1; j++) {[cite: 20]
//	         if (j == 1 || j == 2 * i - 1 || i == n)[cite: 20]
//	             syso("*"); // System.out.print("*");[cite: 20]
//	         else {[cite: 20]
//	             syso(" "); // System.out.print(" ");[cite: 20]
//	         }[cite: 20]
//	     }[cite: 20]
//	     syso(); // System.out.println();[cite: 20]
	// }[cite: 20]


	// ==========================================
	// PÁGINA 21: DIAGONALES Y LETRA 'A'
	// ==========================================
	// [Diagonales en matrices]:[cite: 21]
	// \ -> si i == j[cite: 21]
	// / -> i + j == n - 1  (empezando en 0)[cite: 21]
	//   -> i + j == n + 1  (empezando en 1)[cite: 21]
	//
	// [Dibujo: Letra A][cite: 21]
	// for (int i = 1; i <= n; i++) {[cite: 21]
//	     for (int esp = 1; esp <= n - i; esp++) {[cite: 21]
//	         syso(" "); // System.out.print(" ");[cite: 21]
//	     }[cite: 21]
//	     for (int j = 1; j <= 2 * i - 1; j++) {[cite: 21]
//	         if (j == 1 || j == 2 * i - 1 || i == n / 2 + 1) {[cite: 21]
//	             sysoprint("*"); // System.out.print("*");[cite: 21]
//	         } else {[cite: 21]
//	             syso(" "); // System.out.print(" ");[cite: 21]
//	         }[cite: 21]
//	     }[cite: 21]
//	     sysoln(); // System.out.println();[cite: 21]
	// }[cite: 21]
	
	
	// ==========================================
	// PIRÁMIDE CON CENTRO VACÍO (MATRIZ / COORDENADAS)
	// ==========================================
	// Integer bajo = 5;
	// Integer ancho = 2 * bajo - 1;
	//
	// for (int i = 0; i < bajo; i++) {
//	     for (int j = 0; j < ancho; j++) {
//	         if (i == bajo - 1 || i + j == bajo - 1 || j - i == (ancho - 1) / 2) {
//	             System.out.print("*");
//	         } else {
//	             System.out.print(" ");
//	         }
//	     }
//	     System.out.println();
	// }
	//
	// -> Explicación de las 3 condiciones del if:
	// 1. i == bajo - 1          -> Pinta la base (última fila).
	// 2. i + j == bajo - 1      -> Pinta la diagonal izquierda (/).
	// 3. j - i == (ancho - 1)/2 -> Pinta la diagonal derecha (\).
}
