package org.example;

public class NumerosReales {
    public static void main(String[] args) {

        int numero = 5;
        if (numero > 0) {
            if (numero % 2 == 0) {
                System.out.println("El número es par");
                if (numero > 10) {
                    System.out.println("El número es par y mayor que 10");
                } else {
                    System.out.println("El número es par y menor o igual que 10");
                }
            } else {
                System.out.println("El número es impar");
                if (numero < 0) {
                    System.out.println("El número es impar y negativo");
                } else {
                    System.out.println("El número es impar y positivo");
                }
            }
        } else {
            System.out.println("El número es negativo");
        }
    }
 //resumir la clse en un metodo
    public static String clasificarReal(int real) {

        if (real > 0) {

            if (real % 2 == 0) {

                if (real > 10) {
                    return "El número es par y mayor que 10";
                } else {
                    return "El número es par y menor o igual que 10";
                }

            } else {

                if (real < 0) {
                    return "El número es impar y negativo";
                } else {
                    return "El número es impar y positivo";
                }

            }


        } else {
            return "El número es negativo";
        }

    }
}

