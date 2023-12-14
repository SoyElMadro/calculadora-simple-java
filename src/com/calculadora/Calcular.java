package com.calculadora;

public class Calcular {
    public static void main(String operacion, int num1, int num2) {
        int resultado;

        switch (operacion) {
            case "+":
                resultado = Operaciones.suma(num1, num2);
                Main.mostrar(resultado);
                break;
            case "-":
                resultado = Operaciones.resta(num1, num2);
                Main.mostrar(resultado);
                break;
            case "*":
                resultado = Operaciones.multiplicacion(num1, num2);
                Main.mostrar(resultado);
                break;
            case "/":
                try {
                    resultado = Operaciones.division(num1, num2);
                    Main.mostrar(resultado);
                } catch (Exception exception) {
                    System.out.println("El segundo numero no puede ser cero en una division: " + exception);
                }
                break;
            default:
                System.out.println("El operador dado no es correcto.");
                break;
        }
    }
}
