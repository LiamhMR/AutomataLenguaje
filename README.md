# AutomataLenguaje
# LENGUAJE FANTASTIC
Este lenguaje ha sido realizado como proyecto para la asignatura de Automatas y compiladores, escuela de Informática PUCV.
Como tal se buscó solo cumplir con los criterios solicitados.
# FANTASTIC-ANTLR
Se incluye el contenido del proyecto ANTLR, Analizador sintáctico Lexer y Parser con su respectivo target.
# FANTASTIC-JAVA
Se incluye el proyecto funcional en java con ejecución de un código leido de un arhivo de texto con la sintaxis previamente generada en ANTLR. Se ejecuta desde el Tool.java y lee la prueba desde examp/test0

# COMPILADO Y GENERADO CON ANTLR 4.10.1
# RESTRICCIONES DEL LENGUAJE
Es posible realizar cuantas operaciones matemáticas se deseen en una declaración de variables o en una asignación de valor.
El factorial solo puede calcularse a una variable.(Nos dió flojera calcular a un número directamente, era más facil pero se nos olvidó agregarlo.)
Solo es posible hacer comparaciones de CADENITA, y sólo si son IGUALITO o NOIGUALITO (Se nos solicitó una estructura condicional, no se ahondó más en eso jeje)
No es posible sumar dos cadenas.

# TODAS LAS PALABRAS RESERVADAS SON EN MAYÚSCULAS PORQUE NUESTRO LENGUAJE ES FANTASTIC
# TODAS LAS DEMÁS SON EN MINÚSCULAS

Solo se pueden declarar variables con letras minúscula en el rango [a-z]. Fue una decisión creativa para decir que nuestro lenguaje se roba TODAS LAS MAYÚSCULAS.

#FUNCIONES SEMÁNTICAS
>Declaración de variables.
>Asignación de valores.
>Operaciones aritméticas.
>Función factorial y potencia.
>Caso condicional limitado.
>Print a la consola

#Syntaxis funcional
Iniciar un programa:
DALE>
#TU EJECUCIÓN
<PARÁ

Declaración de variables:
mivariable TEDECLARO #tipo-de-dato#
mivaraible TEDECLARO #tipo-de-dato#=#operación-matemática#

Tipos de datos:
CADENITA
NUMERITO

Operaciones matemáticas:
+
-
/
*

//FACTORIAL
FACT #tuvariable#
//POTENCIA
POTENCIA #tuvariable-o-número-A#,#tuvariable-o-numero-B#
->Lo anterior se lee #tuvariable-o-número-A# elevado a #tuvariable-o-numero-B#

If:
CASO #tu-cadena# #CONDICIÓN# #tu-cadena# SUCEDE
#TU EJECUCIÓN#
#YNAMÁS

#CONDICIÓN#
IGUALITO
NOIGUALITO
