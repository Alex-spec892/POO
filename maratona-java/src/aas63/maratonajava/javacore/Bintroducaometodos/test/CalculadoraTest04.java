package aas63.maratonajava.javacore.Bintroducaometodos.test;

import aas63.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 5;
        int num2 = 9;
        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println("--------------");
        System.out.println(num1);
        System.out.println(num2);
    }
}
