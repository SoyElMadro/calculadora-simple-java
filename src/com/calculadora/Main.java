package com.calculadora;

import java.util.Scanner;

public class Main {
    static void mostrar(int resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a este programa de calculadora simple. Para empezar...");

        System.out.println("Que tipo de operacion deseas hacer?");
        System.out.println("Suma: +, Resta: -, Multiplicacion: *, Division: /");
        String operacion = scanner.nextLine();

        System.out.println("Dime el primer numero:");
        int num1 = scanner.nextInt();

        System.out.println("Dime el segundo numero");
        int num2 = scanner.nextInt();

        Calcular.calcular(operacion, num1, num2);
    }

}