# Programacion-UD2

Soluciones de los ejercicios de práctica de la UD2, ordenadas en **una carpeta por bloque y un archivo por ejercicio**.

## Cómo ejecutar un ejercicio

1. Importa el proyecto en Eclipse: *File > Import > General > Existing Projects into Workspace*.
2. En el Package Explorer abre `src` y entra en la carpeta del bloque (por ejemplo `b04_for`).
3. Clic derecho sobre el archivo del ejercicio (por ejemplo `Ej11_PrimosHastaN.java`) > *Run As > Java Application*.

Cada archivo es un programa completo con su propio `main`: no hay menús ni clases intermedias que elegir. Arriba de cada archivo está el enunciado y un ejemplo de ejecución.

## Dónde está cada cosa

```
Programacion-UD2/
├── README.md                  <- este índice
└── src/
    ├── b01_ifelse/            Bloque 1: if-else            (10 ejercicios)
    ├── b02_condicionales/     Bloque 2: condicionales       (8)
    ├── b03_switch/            Bloque 3: switch              (7)
    ├── b04_for/               Bloque 4: for                 (14)
    ├── b05_while/             Bloque 5: while               (11)
    ├── b06_dowhile/           Bloque 6: do-while            (11)
    ├── b07_anidados/          Bloque 7: bucles anidados     (16 figuras + reto final)
    ├── b08_listas/            Bloque 8: listas, recursividad y cifras (33)
    ├── b09_examen/            Bloque 9: tipo examen         (11)
    ├── b10_cuadrados_triangulos/           Bloque 10: cuadrados y triángulos con asteriscos (35)
    └── utiles/                Clases de ayuda (no se ejecutan)
```

| Carpeta | Qué pasa al ejecutar un archivo |
|---|---|
| `b01_ifelse` ... `b06_dowhile` | Te pide los datos por teclado y muestra el resultado. Algunos usan números aleatorios (juegos) y otros no piden nada. |
| `b07_anidados` | Te pide el tamaño y dibuja la figura. `Ej17_RetoFinal` es un menú que reutiliza las figuras 3, 7 y 10. |
| `b10_cuadrados_triangulos` | Te pide el tamaño (lado, n o filas/columnas) y dibuja la figura con asteriscos. |
| `b08_listas` y `b09_examen` | No piden nada: ejecutan los ejemplos del enunciado y escriben `OK` o `FALLO` en cada uno. |

## Cómo se llaman los archivos

- `EjNN_NombreDelEjercicio.java`: **NN** es el número del ejercicio dentro de su bloque, en el mismo orden del documento de ejercicios.
- En los bloques 8 y 9 cada archivo tiene la solución (el método), `probar()` con los ejemplos y un `main` que llama a `probar()`.
- En los bloques 8 y 9, `Ej00_EjecutarTodos` ejecuta de golpe los ejemplos de todo el bloque y debe terminar con `Total de fallos: 0`.
- En el bloque 7 cada figura es un método `dibujar(...)`, así que otros ejercicios pueden reutilizarla.
- Los decimales se pueden escribir con coma o con punto (`9,5` o `9.5`).

## Clases de ayuda (`src/utiles`)

- `Entrada`: leer por teclado línea a línea (`entero`, `decimal`, `texto`, `caracter`, `enteroPositivo`). Evita el problema del salto de línea de `nextInt()`.
- `Utiles`: `esPrimo`, `invertir`, `esCapicua`, `sumaCifras`.
- `Prueba`: `comprueba(...)` y `resumen()` para los bloques 8 y 9.

## Índice completo

### Bloque 1: If-else (`b01_ifelse`)

| Nº | Archivo | Qué hace | Datos |
|---|---|---|---|
| 1 | [`Ej01_PositivoNegativoCero`](src/b01_ifelse/Ej01_PositivoNegativoCero.java) | Positivo, negativo o cero | teclado |
| 2 | [`Ej02_MenorAdultoJubilado`](src/b01_ifelse/Ej02_MenorAdultoJubilado.java) | Menor de edad, adulto o jubilado | teclado |
| 3 | [`Ej03_MayorDeTres`](src/b01_ifelse/Ej03_MayorDeTres.java) | El mayor de tres números | teclado |
| 4 | [`Ej04_CasiDiez`](src/b01_ifelse/Ej04_CasiDiez.java) | Número casi-diez | teclado |
| 5 | [`Ej05_EcuacionPrimerGrado`](src/b01_ifelse/Ej05_EcuacionPrimerGrado.java) | Ecuación ax + b = 0 | teclado |
| 6 | [`Ej06_Multiplos`](src/b01_ifelse/Ej06_Multiplos.java) | ¿Uno es múltiplo del otro? | teclado |
| 7 | [`Ej07_Triangulo`](src/b01_ifelse/Ej07_Triangulo.java) | Existencia y tipo de triángulo | teclado |
| 8 | [`Ej08_ManianaTardeNoche`](src/b01_ifelse/Ej08_ManianaTardeNoche.java) | Mañana, tarde o noche | teclado |
| 9 | [`Ej09_OrdenTresNumeros`](src/b01_ifelse/Ej09_OrdenTresNumeros.java) | Creciente, decreciente o desordenados | teclado |
| 10 | [`Ej10_TipoDeCaracter`](src/b01_ifelse/Ej10_TipoDeCaracter.java) | Vocal, consonante, dígito u otro | teclado |

### Bloque 2: Condicionales (`b02_condicionales`)

| Nº | Archivo | Qué hace | Datos |
|---|---|---|---|
| 1 | [`Ej01_Armstrong`](src/b02_condicionales/Ej01_Armstrong.java) | Número de Armstrong de 3 cifras | teclado |
| 2 | [`Ej02_OperadorTernario`](src/b02_condicionales/Ej02_OperadorTernario.java) | Operador ternario | teclado |
| 3 | [`Ej03_ValidadorDNI`](src/b02_condicionales/Ej03_ValidadorDNI.java) | Validador de DNI | teclado |
| 4 | [`Ej04_JuegoMultiplicacion`](src/b02_condicionales/Ej04_JuegoMultiplicacion.java) | Juego de la multiplicación | aleatorio |
| 5 | [`Ej05_Parking`](src/b02_condicionales/Ej05_Parking.java) | Tarifa de parking | teclado |
| 6 | [`Ej06_FechaValida`](src/b02_condicionales/Ej06_FechaValida.java) | Fecha válida (con bisiestos) | teclado |
| 7 | [`Ej07_DescuentoPorImporte`](src/b02_condicionales/Ej07_DescuentoPorImporte.java) | Descuento por importe | teclado |
| 8 | [`Ej08_NotaACalificacion`](src/b02_condicionales/Ej08_NotaACalificacion.java) | Nota decimal a calificación | teclado |

### Bloque 3: Switch (`b03_switch`)

| Nº | Archivo | Qué hace | Datos |
|---|---|---|---|
| 1 | [`Ej01_MesEstacion`](src/b03_switch/Ej01_MesEstacion.java) | Mes a estación del año | teclado |
| 2 | [`Ej02_MesDias`](src/b03_switch/Ej02_MesDias.java) | Mes en texto a número de días | teclado |
| 3 | [`Ej03_ConversorMenu`](src/b03_switch/Ej03_ConversorMenu.java) | Conversor con menú | teclado |
| 4 | [`Ej04_OperadorComoChar`](src/b03_switch/Ej04_OperadorComoChar.java) | Calculadora con operador | teclado |
| 5 | [`Ej05_NumeroARomano`](src/b03_switch/Ej05_NumeroARomano.java) | Número 1-10 a romano | teclado |
| 6 | [`Ej06_DiaLaborable`](src/b03_switch/Ej06_DiaLaborable.java) | Laborable o fin de semana | teclado |
| 7 | [`Ej07_TresTiradasDado`](src/b03_switch/Ej07_TresTiradasDado.java) | Tres tiradas de dado | teclado |

### Bloque 4: For (`b04_for`)

| Nº | Archivo | Qué hace | Datos |
|---|---|---|---|
| 1 | [`Ej01_ParesHastaN`](src/b04_for/Ej01_ParesHastaN.java) | Pares entre 1 y n | teclado |
| 2 | [`Ej02_CuentaAtras`](src/b04_for/Ej02_CuentaAtras.java) | Cuenta atrás | teclado |
| 3 | [`Ej03_SumaHastaN`](src/b04_for/Ej03_SumaHastaN.java) | Suma de 1 a n | teclado |
| 4 | [`Ej04_MayorMenorDeOcho`](src/b04_for/Ej04_MayorMenorDeOcho.java) | Mayor y menor de 8 números | teclado |
| 5 | [`Ej05_SumaMultiplosDeCinco`](src/b04_for/Ej05_SumaMultiplosDeCinco.java) | Suma de los 10 primeros múltiplos de 5 | ninguno |
| 6 | [`Ej06_Potencia`](src/b04_for/Ej06_Potencia.java) | Potencia con un bucle | teclado |
| 7 | [`Ej07_VocalesDeUnaFrase`](src/b04_for/Ej07_VocalesDeUnaFrase.java) | Vocales de una frase | teclado |
| 8 | [`Ej08_SeisTemperaturas`](src/b04_for/Ej08_SeisTemperaturas.java) | Seis temperaturas | teclado |
| 9 | [`Ej09_NumeroPerfecto`](src/b04_for/Ej09_NumeroPerfecto.java) | Número perfecto | teclado |
| 10 | [`Ej10_Divisores`](src/b04_for/Ej10_Divisores.java) | Divisores de un número | teclado |
| 11 | [`Ej11_PrimosHastaN`](src/b04_for/Ej11_PrimosHastaN.java) | Primos entre 1 y n | teclado |
| 12 | [`Ej12_Fibonacci`](src/b04_for/Ej12_Fibonacci.java) | Sucesión de Fibonacci | teclado |
| 13 | [`Ej13_FraseAlReves`](src/b04_for/Ej13_FraseAlReves.java) | Frase al revés | teclado |
| 14 | [`Ej14_CincoEdades`](src/b04_for/Ej14_CincoEdades.java) | Cinco edades | teclado |

### Bloque 5: While (`b05_while`)

| Nº | Archivo | Qué hace | Datos |
|---|---|---|---|
| 1 | [`Ej01_MayorDePositivos`](src/b05_while/Ej01_MayorDePositivos.java) | Mayor de los números introducidos | teclado |
| 2 | [`Ej02_SumaParesCuentaImpares`](src/b05_while/Ej02_SumaParesCuentaImpares.java) | Suma de pares y cantidad de impares | teclado |
| 3 | [`Ej03_Contrasena`](src/b05_while/Ej03_Contrasena.java) | Contraseña con 3 intentos | teclado |
| 4 | [`Ej04_SumaDeCifras`](src/b05_while/Ej04_SumaDeCifras.java) | Suma de cifras | teclado |
| 5 | [`Ej05_NumeroDeCifras`](src/b05_while/Ej05_NumeroDeCifras.java) | Número de cifras | teclado |
| 6 | [`Ej06_InvertirNumero`](src/b05_while/Ej06_InvertirNumero.java) | Invertir un número | teclado |
| 7 | [`Ej07_NotasHastaMenosUno`](src/b05_while/Ej07_NotasHastaMenosUno.java) | Notas hasta -1 | teclado |
| 8 | [`Ej08_DecimalABinario`](src/b05_while/Ej08_DecimalABinario.java) | Decimal a binario | teclado |
| 9 | [`Ej09_Collatz`](src/b05_while/Ej09_Collatz.java) | Conjetura de Collatz | teclado |
| 10 | [`Ej10_MetaDeAhorro`](src/b05_while/Ej10_MetaDeAhorro.java) | Meta de ahorro | teclado |
| 11 | [`Ej11_DividirEntreDos`](src/b05_while/Ej11_DividirEntreDos.java) | Veces que se divide entre 2 | teclado |

### Bloque 6: Do-while (`b06_dowhile`)

| Nº | Archivo | Qué hace | Datos |
|---|---|---|---|
| 1 | [`Ej01_MultiplosDeSiete`](src/b06_dowhile/Ej01_MultiplosDeSiete.java) | Los 15 primeros múltiplos de 7 | ninguno |
| 2 | [`Ej02_CuentaAtras10`](src/b06_dowhile/Ej02_CuentaAtras10.java) | Cuenta atrás de 10 a 0 | ninguno |
| 3 | [`Ej03_ValidarUnoDiez`](src/b06_dowhile/Ej03_ValidarUnoDiez.java) | Validar un número entre 1 y 10 | teclado |
| 4 | [`Ej04_ParesEImpares`](src/b06_dowhile/Ej04_ParesEImpares.java) | Suma de pares y media de impares | teclado |
| 5 | [`Ej05_AdivinaElNumero`](src/b06_dowhile/Ej05_AdivinaElNumero.java) | Adivina el número | aleatorio |
| 6 | [`Ej06_CajeroAutomatico`](src/b06_dowhile/Ej06_CajeroAutomatico.java) | Cajero automático | teclado |
| 7 | [`Ej07_TablaDeMultiplicar`](src/b06_dowhile/Ej07_TablaDeMultiplicar.java) | Tabla de multiplicar con repetición | teclado |
| 8 | [`Ej08_MonedaTresCaras`](src/b06_dowhile/Ej08_MonedaTresCaras.java) | Moneda hasta 3 caras seguidas | aleatorio |
| 9 | [`Ej09_DosDadosDobleSeis`](src/b06_dowhile/Ej09_DosDadosDobleSeis.java) | Dos dados hasta doble seis | aleatorio |
| 10 | [`Ej10_CalculadoraMenu`](src/b06_dowhile/Ej10_CalculadoraMenu.java) | Calculadora con menú | teclado |
| 11 | [`Ej11_PiedraPapelTijera`](src/b06_dowhile/Ej11_PiedraPapelTijera.java) | Piedra, papel o tijera | aleatorio |

### Bloque 7: Bucles anidados (`b07_anidados`)

| Nº | Archivo | Qué dibuja | Datos |
|---|---|---|---|
| 1 | [`Ej01_NumeroPorFila`](src/b07_anidados/Ej01_NumeroPorFila.java) | Cada fila lleva su número | teclado |
| 2 | [`Ej02_BordeYRelleno`](src/b07_anidados/Ej02_BordeYRelleno.java) | Borde # y relleno * | teclado |
| 3 | [`Ej03_TrianguloNumeros`](src/b07_anidados/Ej03_TrianguloNumeros.java) | Triángulo de números repetidos | teclado |
| 4 | [`Ej04_TrianguloLetras`](src/b07_anidados/Ej04_TrianguloLetras.java) | Triángulo de letras | teclado |
| 5 | [`Ej05_TrianguloInvertido`](src/b07_anidados/Ej05_TrianguloInvertido.java) | Triángulo numérico invertido | teclado |
| 6 | [`Ej06_PiramideNumerica`](src/b07_anidados/Ej06_PiramideNumerica.java) | Pirámide numérica centrada | teclado |
| 7 | [`Ej07_RomboHueco`](src/b07_anidados/Ej07_RomboHueco.java) | Rombo hueco | teclado |
| 8 | [`Ej08_DiagonalSecundaria`](src/b07_anidados/Ej08_DiagonalSecundaria.java) | Diagonal secundaria con # | teclado |
| 9 | [`Ej09_LetraL`](src/b07_anidados/Ej09_LetraL.java) | Letra L | teclado |
| 10 | [`Ej10_LetraH`](src/b07_anidados/Ej10_LetraH.java) | Letra H | teclado |
| 11 | [`Ej11_LetraN`](src/b07_anidados/Ej11_LetraN.java) | Letra N | teclado |
| 12 | [`Ej12_Franjas`](src/b07_anidados/Ej12_Franjas.java) | Franjas de * y # | teclado |
| 13 | [`Ej13_TrianguloFloyd`](src/b07_anidados/Ej13_TrianguloFloyd.java) | Triángulo de Floyd | teclado |
| 14 | [`Ej14_MarcoConDiagonales`](src/b07_anidados/Ej14_MarcoConDiagonales.java) | Marco con diagonales | teclado |
| 15 | [`Ej15_TablaMultiplicar10`](src/b07_anidados/Ej15_TablaMultiplicar10.java) | Tabla de multiplicar alineada | ninguno |
| 16 | [`Ej16_TrianguloPascal`](src/b07_anidados/Ej16_TrianguloPascal.java) | Triángulo de Pascal (reto) | teclado |
| 17 | [`Ej17_RetoFinal`](src/b07_anidados/Ej17_RetoFinal.java) | Reto final: menú con tres figuras | teclado |

### Bloque 8: Listas, recursividad y cifras (`b08_listas`)

Para ejecutar todos los ejemplos del bloque: [`Ej00_EjecutarTodos`](src/b08_listas/Ej00_EjecutarTodos.java).

**Contadores**

| Nº | Archivo | Método | Qué hace |
|---|---|---|---|
| 1 | [`Ej01_ContarImpares`](src/b08_listas/Ej01_ContarImpares.java) | `contarImpares` | Devuelve cuántos números impares hay en la lista. |
| 2 | [`Ej02_ContarMayoresQue`](src/b08_listas/Ej02_ContarMayoresQue.java) | `contarMayoresQue` | Devuelve cuántos números de la lista son estrictamente mayores que el umbral. |
| 3 | [`Ej03_ContarMultiplosDe`](src/b08_listas/Ej03_ContarMultiplosDe.java) | `contarMultiplosDe` | Devuelve cuántos números de la lista son múltiplos de m. |
| 4 | [`Ej04_ContarPalabrasLargas`](src/b08_listas/Ej04_ContarPalabrasLargas.java) | `contarPalabrasLargas` | Devuelve cuántas palabras tienen al menos «minimo» letras. La lista puede contener nulos, que se ignoran. |
| 5 | [`Ej05_ContarCapicuas`](src/b08_listas/Ej05_ContarCapicuas.java) | `contarCapicuas` | Devuelve cuántos números de la lista son capicúas (121, 1331...). Los de una cifra lo son. |

**Sumas y medias**

| Nº | Archivo | Método | Qué hace |
|---|---|---|---|
| 6 | [`Ej06_SumaCuadrados`](src/b08_listas/Ej06_SumaCuadrados.java) | `sumaCuadrados` | Devuelve la suma de los cuadrados de los números de la lista. |
| 7 | [`Ej07_SumaPosicionesPares`](src/b08_listas/Ej07_SumaPosicionesPares.java) | `sumaPosicionesPares` | Devuelve la suma de los elementos que ocupan las posiciones 0, 2, 4... |
| 8 | [`Ej08_MediaPositivos`](src/b08_listas/Ej08_MediaPositivos.java) | `mediaPositivos` | Devuelve la media de los números positivos (el 0 no es positivo). Si no hay ninguno, devuelve 0.0. |
| 9 | [`Ej09_SumaHastaCero`](src/b08_listas/Ej09_SumaHastaCero.java) | `sumaHastaCero` | Devuelve la suma de los números anteriores al primer 0 (si no hay ningún 0, la suma de toda la lista). |
| 10 | [`Ej10_SumaDespuesDelPrimerNegativo`](src/b08_listas/Ej10_SumaDespuesDelPrimerNegativo.java) | `sumaDespuesDelPrimerNegativo` | Devuelve la suma de los números que van después del primer negativo (el negativo no se suma). Sin negativos, devuelve 0. |

**Búsqueda (existe)**

| Nº | Archivo | Método | Qué hace |
|---|---|---|---|
| 11 | [`Ej11_ContieneNegativo`](src/b08_listas/Ej11_ContieneNegativo.java) | `contieneNegativo` | Devuelve true si la lista contiene algún número negativo. |
| 12 | [`Ej12_PosicionUltimoPar`](src/b08_listas/Ej12_PosicionUltimoPar.java) | `posicionUltimoPar` | Devuelve la posición del último número par, o -1 si no hay ninguno. |
| 13 | [`Ej13_PrimerMultiploDe`](src/b08_listas/Ej13_PrimerMultiploDe.java) | `primerMultiploDe` | Devuelve el primer número de la lista que sea múltiplo de m, o null si no hay ninguno. |
| 14 | [`Ej14_HayConsecutivosIguales`](src/b08_listas/Ej14_HayConsecutivosIguales.java) | `hayConsecutivosIguales` | Devuelve true si hay dos elementos consecutivos iguales. |

**Comprobación (para todo)**

| Nº | Archivo | Método | Qué hace |
|---|---|---|---|
| 15 | [`Ej15_TodosPositivos`](src/b08_listas/Ej15_TodosPositivos.java) | `todosPositivos` | Devuelve true si todos los números de la lista son positivos (mayores que 0). |
| 16 | [`Ej16_EsEstrictamenteDecreciente`](src/b08_listas/Ej16_EsEstrictamenteDecreciente.java) | `esEstrictamenteDecreciente` | Devuelve true si cada elemento es estrictamente menor que el anterior. Una lista vacía o de un solo elemento cuenta como decreciente. |
| 17 | [`Ej17_EsPalindromo`](src/b08_listas/Ej17_EsPalindromo.java) | `esPalindromo` | Devuelve true si la lista se lee igual de izquierda a derecha que de derecha a izquierda. |

**Selección**

| Nº | Archivo | Método | Qué hace |
|---|---|---|---|
| 18 | [`Ej18_SeleccionaMayoresQue`](src/b08_listas/Ej18_SeleccionaMayoresQue.java) | `seleccionaMayoresQue` | Devuelve una lista nueva con los números mayores que el umbral, en el mismo orden. |
| 19 | [`Ej19_EliminaNegativos`](src/b08_listas/Ej19_EliminaNegativos.java) | `eliminaNegativos` | Devuelve una lista nueva sin los números negativos. |
| 20 | [`Ej20_Dobles`](src/b08_listas/Ej20_Dobles.java) | `dobles` | Devuelve una lista nueva con el doble de cada número. |
| 21 | [`Ej21_SeleccionaPosicionesImpares`](src/b08_listas/Ej21_SeleccionaPosicionesImpares.java) | `seleccionaPosicionesImpares` | Devuelve una lista nueva con los elementos de las posiciones 1, 3, 5... |

**Máximo y mínimo**

| Nº | Archivo | Método | Qué hace |
|---|---|---|---|
| 22 | [`Ej22_Minimo`](src/b08_listas/Ej22_Minimo.java) | `minimo` | Devuelve el mínimo de la lista, o null si está vacía. |
| 23 | [`Ej23_DiferenciaMaxMin`](src/b08_listas/Ej23_DiferenciaMaxMin.java) | `diferenciaMaxMin` | Devuelve la diferencia entre el máximo y el mínimo de la lista (0 si está vacía). |
| 24 | [`Ej24_PosicionDelMaximo`](src/b08_listas/Ej24_PosicionDelMaximo.java) | `posicionDelMaximo` | Devuelve la posición del máximo (la primera, si se repite), o -1 si la lista está vacía. |
| 25 | [`Ej25_SegundoMayor`](src/b08_listas/Ej25_SegundoMayor.java) | `segundoMayor` | Reto: devuelve el segundo valor DISTINTO más grande de la lista, o null si no existe. |

**Recursividad y cifras**

| Nº | Archivo | Método | Qué hace |
|---|---|---|---|
| 26 | [`Ej26_SumaRecursiva`](src/b08_listas/Ej26_SumaRecursiva.java) | `sumaRecursiva` | Devuelve la suma de 1 a n de forma recursiva. |
| 27 | [`Ej27_PotenciaRecursiva`](src/b08_listas/Ej27_PotenciaRecursiva.java) | `potenciaRecursiva` | Devuelve base elevado a exp (exp >= 0) de forma recursiva. |
| 28 | [`Ej28_ContarCifrasRecursivo`](src/b08_listas/Ej28_ContarCifrasRecursivo.java) | `contarCifrasRecursivo` | Devuelve cuántas cifras tiene un número, de forma recursiva. |
| 29 | [`Ej29_Mcd`](src/b08_listas/Ej29_Mcd.java) | `mcd` | Devuelve el máximo común divisor de a y b con el algoritmo de Euclides, de forma recursiva. |
| 30 | [`Ej30_CuentaAtrasCohete`](src/b08_listas/Ej30_CuentaAtrasCohete.java) | `cuentaAtrasCohete` | Muestra T-n, T-(n-1)... hasta llegar a 0 y entonces «¡Despegue!», de forma recursiva. |
| 31 | [`Ej31_InvertirNumero`](src/b08_listas/Ej31_InvertirNumero.java) | `invertir` | Devuelve las cifras de un entero positivo al revés (123 -> 321). |
| 32 | [`Ej32_EsCapicua`](src/b08_listas/Ej32_EsCapicua.java) | `esCapicua` | Devuelve true si el número se lee igual al revés (los de una cifra lo son). |
| 33 | [`Ej33_SumaCifrasPares`](src/b08_listas/Ej33_SumaCifrasPares.java) | `sumaCifrasPares` | Devuelve la suma de las cifras pares de un entero positivo (4826 -> 20). |

### Bloque 9: Tipo examen (`b09_examen`)

Para ejecutar todos los ejemplos del bloque: [`Ej00_EjecutarTodos`](src/b09_examen/Ej00_EjecutarTodos.java).

| Nº | Archivo | Método | Qué hace |
|---|---|---|---|
| 1 | [`Ej01_PuedeSubir`](src/b09_examen/Ej01_PuedeSubir.java) | `puedeSubir` | Atracción del parque: se puede subir con 120 cm o más; entre 100 y 119 cm, solo si va acompañado; con menos de 100 cm, no. |
| 2 | [`Ej02_PrecioFinal`](src/b09_examen/Ej02_PrecioFinal.java) | `precioFinal` | Tienda de videojuegos: según el tipo de cliente hay un descuento (NORMAL 0 %, SOCIO 10 %, ESTUDIANTE 15 %) y, si se compran 3 o más unidades, un 5 % extra. Devuelve el precio final, o -1 si el tipo no es válido. |
| 3 | [`Ej03_PrecioViaje`](src/b09_examen/Ej03_PrecioViaje.java) | `precioViaje` | Viajes en tren: el precio por persona es MADRID 30 €, BARCELONA 45 € y LISBOA 60 €. Ida y vuelta cuesta 1,8 veces más y, con 4 o más personas, hay un 10 % de descuento. Devuelve -1 si el destino no existe. |
| 4 | [`Ej04_MonedasHastaTrampa`](src/b09_examen/Ej04_MonedasHastaTrampa.java) | `monedasHastaTrampa` | Cofres del dragón: suma las monedas de los cofres hasta encontrar uno con 0 (la trampa); a partir de ahí no se cuenta nada más. |
| 5 | [`Ej05_PromedioPares`](src/b09_examen/Ej05_PromedioPares.java) | `promedioPares` | Devuelve la media de los números pares de la lista; si no hay ninguno, 0.0. |
| 6 | [`Ej06_SumaConSaltos`](src/b09_examen/Ej06_SumaConSaltos.java) | `sumaConSaltos` | Recursivo: devuelve n + (n - salto) + (n - 2·salto) + ... mientras el valor sea positivo. Si salto es 0 o negativo no avanzaría nunca, así que devuelve 0. |
| 7 | [`Ej07_DibujarN`](src/b09_examen/Ej07_DibujarN.java) | `dibujarN` | Dibuja una letra N de asteriscos de lado x lado: primera columna, última columna y diagonal principal. |
| 8 | [`Ej08_ContarParejasSuman10`](src/b09_examen/Ej08_ContarParejasSuman10.java) | `contarParejasSuman10` | Cuenta las parejas de posiciones consecutivas que suman 10. Las parejas no se solapan: si una pareja suma 10, se salta a la siguiente posición. |
| 9 | [`Ej09_PrimeraPosicionPrimoMayorQue`](src/b09_examen/Ej09_PrimeraPosicionPrimoMayorQue.java) | `primeraPosicionPrimoMayorQue` | Devuelve la posición del primer número primo estrictamente mayor que el umbral, o -1 si no hay ninguno. |
| 10 | [`Ej10_ContarValles`](src/b09_examen/Ej10_ContarValles.java) | `contarValles` | Cuenta los valles: elementos menores que sus dos vecinos. El primero y el último no cuentan. |
| 11 | [`Ej11_SumaCifrasDelMayorPrimo`](src/b09_examen/Ej11_SumaCifrasDelMayorPrimo.java) | `sumaCifrasDelMayorPrimo` | Devuelve la suma de las cifras del mayor número primo de la lista, o -1 si no hay primos. |

El ejercicio 12 del bloque 9 (examen completo) es un reto abierto y no tiene solución única, así que no tiene archivo.

### Bloque 10: Cuadrados y triángulos con asteriscos (`b10_cuadrados_triangulos`)

**Cuadrados**

| Nº | Archivo | Qué dibuja |
|---|---|---|
| 1 | [`Ej01_CuadradoRelleno`](src/b10_cuadrados_triangulos/Ej01_CuadradoRelleno.java) | Cuadrado relleno |
| 2 | [`Ej02_CuadradoHueco`](src/b10_cuadrados_triangulos/Ej02_CuadradoHueco.java) | Cuadrado sin rellenar |
| 3 | [`Ej03_DiagonalPrincipal`](src/b10_cuadrados_triangulos/Ej03_DiagonalPrincipal.java) | Solo la diagonal principal |
| 4 | [`Ej04_DiagonalSecundaria`](src/b10_cuadrados_triangulos/Ej04_DiagonalSecundaria.java) | Solo la diagonal secundaria |
| 5 | [`Ej05_HuecoConDiagonalPrincipal`](src/b10_cuadrados_triangulos/Ej05_HuecoConDiagonalPrincipal.java) | Sin rellenar con diagonal principal |
| 6 | [`Ej06_HuecoConDiagonalSecundaria`](src/b10_cuadrados_triangulos/Ej06_HuecoConDiagonalSecundaria.java) | Sin rellenar con diagonal secundaria |
| 7 | [`Ej07_HuecoConAmbasDiagonales`](src/b10_cuadrados_triangulos/Ej07_HuecoConAmbasDiagonales.java) | Sin rellenar con las dos diagonales |
| 8 | [`Ej08_SoloAmbasDiagonales`](src/b10_cuadrados_triangulos/Ej08_SoloAmbasDiagonales.java) | Solo las dos diagonales (X) |
| 9 | [`Ej09_HuecoConCruz`](src/b10_cuadrados_triangulos/Ej09_HuecoConCruz.java) | Sin rellenar con cruz central |
| 10 | [`Ej10_Cruz`](src/b10_cuadrados_triangulos/Ej10_Cruz.java) | Cruz (+) |
| 11 | [`Ej11_MarcoGrueso`](src/b10_cuadrados_triangulos/Ej11_MarcoGrueso.java) | Marco de grosor 2 |
| 12 | [`Ej12_CuadradosConcentricos`](src/b10_cuadrados_triangulos/Ej12_CuadradosConcentricos.java) | Cuadrados concéntricos |
| 13 | [`Ej13_Ajedrez`](src/b10_cuadrados_triangulos/Ej13_Ajedrez.java) | Tablero de ajedrez |
| 14 | [`Ej14_FilasAlternas`](src/b10_cuadrados_triangulos/Ej14_FilasAlternas.java) | Filas alternas |
| 15 | [`Ej15_ColumnasAlternas`](src/b10_cuadrados_triangulos/Ej15_ColumnasAlternas.java) | Columnas alternas |
| 16 | [`Ej16_MitadSuperiorIzquierda`](src/b10_cuadrados_triangulos/Ej16_MitadSuperiorIzquierda.java) | Cuadrado con la mitad superior izquierda |

**Rectángulos**

| Nº | Archivo | Qué dibuja |
|---|---|---|
| 17 | [`Ej17_RectanguloRelleno`](src/b10_cuadrados_triangulos/Ej17_RectanguloRelleno.java) | Rectángulo relleno |
| 18 | [`Ej18_RectanguloHueco`](src/b10_cuadrados_triangulos/Ej18_RectanguloHueco.java) | Rectángulo sin rellenar |

**Triángulos**

| Nº | Archivo | Qué dibuja |
|---|---|---|
| 19 | [`Ej19_TrianguloIzquierda`](src/b10_cuadrados_triangulos/Ej19_TrianguloIzquierda.java) | Triángulo pegado a la izquierda |
| 20 | [`Ej20_TrianguloIzquierdaInvertido`](src/b10_cuadrados_triangulos/Ej20_TrianguloIzquierdaInvertido.java) | Triángulo invertido a la izquierda |
| 21 | [`Ej21_TrianguloDerecha`](src/b10_cuadrados_triangulos/Ej21_TrianguloDerecha.java) | Triángulo pegado a la derecha |
| 22 | [`Ej22_TrianguloDerechaInvertido`](src/b10_cuadrados_triangulos/Ej22_TrianguloDerechaInvertido.java) | Triángulo invertido a la derecha |
| 23 | [`Ej23_TrianguloIzquierdaHueco`](src/b10_cuadrados_triangulos/Ej23_TrianguloIzquierdaHueco.java) | Triángulo izquierda sin rellenar |
| 24 | [`Ej24_TrianguloIzquierdaInvertidoHueco`](src/b10_cuadrados_triangulos/Ej24_TrianguloIzquierdaInvertidoHueco.java) | Triángulo invertido izquierda sin rellenar |
| 25 | [`Ej25_TrianguloDerechaHueco`](src/b10_cuadrados_triangulos/Ej25_TrianguloDerechaHueco.java) | Triángulo derecha sin rellenar |
| 26 | [`Ej26_TrianguloDerechaInvertidoHueco`](src/b10_cuadrados_triangulos/Ej26_TrianguloDerechaInvertidoHueco.java) | Triángulo invertido derecha sin rellenar |
| 27 | [`Ej27_PiramideRellena`](src/b10_cuadrados_triangulos/Ej27_PiramideRellena.java) | Pirámide rellena |
| 28 | [`Ej28_PiramideInvertida`](src/b10_cuadrados_triangulos/Ej28_PiramideInvertida.java) | Pirámide invertida |
| 29 | [`Ej29_PiramideHueca`](src/b10_cuadrados_triangulos/Ej29_PiramideHueca.java) | Pirámide sin rellenar |
| 30 | [`Ej30_PiramideInvertidaHueca`](src/b10_cuadrados_triangulos/Ej30_PiramideInvertidaHueca.java) | Pirámide invertida sin rellenar |
| 31 | [`Ej31_PiramideSeparada`](src/b10_cuadrados_triangulos/Ej31_PiramideSeparada.java) | Pirámide con huecos entre asteriscos |

**Rombos y relojes de arena**

| Nº | Archivo | Qué dibuja |
|---|---|---|
| 32 | [`Ej32_RomboRelleno`](src/b10_cuadrados_triangulos/Ej32_RomboRelleno.java) | Rombo relleno |
| 33 | [`Ej33_RomboHueco`](src/b10_cuadrados_triangulos/Ej33_RomboHueco.java) | Rombo sin rellenar |
| 34 | [`Ej34_RelojDeArena`](src/b10_cuadrados_triangulos/Ej34_RelojDeArena.java) | Reloj de arena |
| 35 | [`Ej35_RelojDeArenaHueco`](src/b10_cuadrados_triangulos/Ej35_RelojDeArenaHueco.java) | Reloj de arena sin rellenar |

## Notas

- Intenta resolver cada ejercicio antes de mirar la solución; las decisiones de diseño van explicadas en comentarios.
- En los bloques 8 y 9 cada método tiene un único `return` al final, como en los simulacros, y no se usan arrays: solo `List`.
- Los ejemplos de las cabeceras de los bloques 1 a 7 son ejecuciones reales de cada programa.
