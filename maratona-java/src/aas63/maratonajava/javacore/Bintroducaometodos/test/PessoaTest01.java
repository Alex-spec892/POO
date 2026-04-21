package aas63.maratonajava.javacore.Bintroducaometodos.test;

import aas63.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

import java.util.Scanner;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);
        pessoa.setNome(sc.next());
        pessoa.setIdade(sc.nextInt());
        pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
