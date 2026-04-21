package aas63.maratonajava.javacore.Bintroducaometodos.test;

import aas63.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

import java.util.Scanner;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();
        estudante.nome = sc.next();
        System.out.println("nome lido: " + estudante.nome);
        estudante.idade = sc.nextInt();
        System.out.println("idade lido: " + estudante.idade);
        estudante.sexo = sc.next().charAt(0);

        estudante.imprime();
    }
}
