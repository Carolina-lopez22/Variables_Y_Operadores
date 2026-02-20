package com.variables;

import java.util.Scanner;

public class Proyecto_2{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. DECLARACIÓN DE VARIABLES");

        System.out.print("Ingrese un número entero: ");
        int numeroEntero = sc.nextInt();
       
        
        System.out.print("Ingrese un número decimal: ");
        double numeroDecimal = sc.nextDouble(); 
        sc.nextLine();
        
        System.out.print("Ingrese su nombre: ");
        String nombrePersonal = sc.nextLine();
       
        System.out.print("¿Eres alto? (si/no): ");
        String respuesta = sc.nextLine();

        boolean esEstudiante = respuesta.equalsIgnoreCase("si");
        
        System.out.println("\nValores ingresados");
        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Nombre: " + nombrePersonal);
        System.out.println("¿Es alto? " 
                + (esEstudiante ? "Sí" : "No"));
       
        System.out.println("\n2. OPERACIONES MATEMÁTICAS");

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = sc.nextInt();

        System.out.println("\n Tipo int ");
        System.out.println("Suma:          " + (numero1 + numero2));
        System.out.println("Resta:         " + (numero1 - numero2));
        System.out.println("Multiplicación:" + (numero1 * numero2));
        if (numero2 != 0) {
            System.out.println("División:      " + (numero1 / numero2));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        System.out.println("\nTipo double");
        double doble1 = numero1;
        double doble2 = numero2;
        System.out.println("Suma:          " + (doble1 + doble2));
        System.out.println("Resta:         " + (doble1 - doble2));
        System.out.println("Multiplicación:" + (doble1 * doble2));
        if (doble2 != 0) {
            System.out.println("División:      " + (doble1 / doble2));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        System.out.println("\nTipo float");
        float flo1 = numero1;
        float flo2 = numero2;
        System.out.println("Suma:          " + (flo1 + flo2));
        System.out.println("Resta:         " + (flo1 - flo2));
        System.out.println("Multiplicación:" + (flo1 * flo2));
        if (flo2 != 0) {
            System.out.println("División:      " + (flo1 / flo2));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        System.out.println("\nTipo short");
        short shor1 = (short) numero1;
        short shor2 = (short) numero2;
        System.out.println("Suma:          " + (shor1 + shor2));
        System.out.println("Resta:         " + (shor1 - shor2));
        System.out.println("Multiplicación:" + (shor1 * shor2));
        if (shor2 != 0) {
            System.out.println("División:      " + (shor1 / shor2));
        } else {
            System.out.println("División: No se puede dividir entre cero.");
        }
        System.out.println("\nTipo byte ");
        byte byt1 = (byte) numero1;
        byte byt2 = (byte) numero2;
        System.out.println("Suma:          " + (byt1 + byt2));
        System.out.println("Resta:         " + (byt1 - byt2));
        System.out.println("Multiplicación:" + (byt1 * byt2));
        if (byt2 != 0) {
            System.out.println("División:      " + (byt1 / byt2));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        System.out.println("\n3. OPERACIONES LÓGICAS");

        System.out.print("Ingrese el primer número: ");
        int logi1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int logi2 = sc.nextInt();

        System.out.println("\n Comparaciones ");
        System.out.println(logi1 + " > " + logi2 + " Mayor que:  " + (logi1 > logi2));
        System.out.println(logi1 + " < " + logi2 + " Menor que:  " + (logi1 < logi2));
        System.out.println(logi1 + " == " + logi2 + " Igual:      " + (logi1 == logi2));

        System.out.println("\n Operadores lógicos");
        System.out.println("Ambos positivos: " + (logi1 > 0 && logi2 > 0)
                + " → " + logi1 + ">0 y " + logi2 + ">0");
        System.out.println("Al menos uno positivo: " + (logi1 > 0 || logi2 > 0)
                + " → " + logi1 + ">0 o " + logi2 + ">0");
        System.out.println("El primero mayor que el segundo Y ambos >= 0: "
                + (logi1 > logi2 && logi1 >= 0 && logi2 >= 0));
        System.out.println("El primero mayor O el segundo mayor que 100: "
                + (logi1 > logi2 || logi2 > 100));

        System.out.println("\n4. CLASIFICACIÓN DE EDAD ");

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad < 0) {
            System.out.println("Edad inválida. Debe ser un número positivo.");
        } else if (edad < 12) {
            System.out.println("Clasificación: Niño");
        } else if (edad <= 17) {
            System.out.println("Clasificación: Adolescente");
        } else if (edad <= 59) {
            System.out.println("Clasificación: Adulto");
        } else {
            System.out.println("Clasificación: Adulto mayor");
        }
        
        System.out.println("\n5. DÍA DE LA SEMANA ");

        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Día: Lunes");
                break;
            case 2:
                System.out.println("Día: Martes");
                break;
            case 3:
                System.out.println("Día: Miércoles");
                break;
            case 4:
                System.out.println("Día: Jueves");
                break;
            case 5:
                System.out.println("Día: Viernes");
                break;
            case 6:
                System.out.println("Día: Sábado");
                break;
            case 7:
                System.out.println("Día: Domingo");
                break;
            default:
                System.out.println("Número inválido. Ingrese un valor entre 1 y 7.");
        }
       
        sc.nextLine();

        System.out.println("\n6. VERIFICACIÓN DE ACCESO");

        String usuarioAingresar = "Carolina";
        String contraseñaAingresar = "54321";

        System.out.print("Ingrese usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Ingrese contraseña: ");
        String contraseña = sc.nextLine();

        if (usuario.equals(usuarioAingresar)) {
            if (contraseña.equals(contraseñaAingresar)) {
                System.out.println("Acceso concedido. Bienvenido, " + usuario + ".");
            } else {
                System.out.println("Contraseña incorrecta.");
            }
        } else {
            System.out.println("Usuario no registrado.");
        }

        sc.close();
    }
}