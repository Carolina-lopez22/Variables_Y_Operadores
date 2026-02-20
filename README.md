# VariablesYOperadores

# ¿Para qué se utilizan los operadores lógicos en programación?

Los operadores lógicos se utilizan para evaluar condiciones y combinar expresiones booleanas.  
Permiten tomar decisiones dentro del programa mediante estructuras de control como if, else y switch.
Operadores como OR, AND, etc, permiten controlar el flujo del programa y ejecutar instrucciones dependiendo de ciertas condiciones

¿Por qué es importante declarar correctamente el tipo de dato de una variable?

Es importante porque el tipo de dato determina: El tipo de valores que puede almacenar una variable.
El espacio que ocupa en memoria.
El comportamiento de las operaciones que se realizan con ella.
Porque se si declaramos mal podemos ocacionar errores en em programa, ya que este no le sera posible leer que tipo de dato le estamos ingresando ya sea int, double, string etc.


# Justificación Técnica

Clasificación de Edad
Utilece la estructura if, else porque permite evaluar rangos de valores numéricos.  
En este caso, se necesitaba comparar diferentes intervalos de edad, menor de 12, 12-17, 18-59, 60 o más.  

Día de la Semana

Utilice la estructura switch porque el programa debía evaluar un número específico del 1 al 7.  
y tambien porque si lo hubiera echo con if y else el codigo me hubiera quedado mas extenso y al hacerlo con switch se veria mas ordenado.

Verificación de Acceso

Utilize if-else porque se necesitaba evaluar condiciones para poder ingresar el usuario y contraseña correcta:

Si el usuario existe.
Si la contraseña es correcta.
Si el usuario no está registrado.

# Análisis de la División entre Enteros

Puede observar que cuando se realiza una división entre dos valores de tipo int, Java devuelve un resultado entero, eliminando la parte decimal automáticamente.  
Esto puede ocacionar que no se de un resultado exacto al que es verdaderamente.  
Para conservar la parte decimal es necesario utilizar tipos de datos como double o float, que float mostrara almenos 2 decimales por si la divicion resulta con mas decimales.
