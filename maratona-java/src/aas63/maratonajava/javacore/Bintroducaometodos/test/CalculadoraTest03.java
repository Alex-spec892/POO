package aas63.maratonajava.javacore.Bintroducaometodos.test;

import aas63.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(5,9);
        System.out.println(result);

        //ou
        System.out.println(calculadora.divideDoisNumeros(5,9));
    }
}
