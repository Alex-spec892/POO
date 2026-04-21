package aas63.maratonajava.javacore.Bintroducaometodos.atividadedevdojo.dominio;

import java.util.Scanner;

public class ImpressoraFuncionario {
    public void imprime(Funcionario funcionario) {
        Scanner teclado = new Scanner(System.in);
        Funcionario funcionario1 = new Funcionario();
        System.out.println(funcionario.nome);
        System.out.println(funcionario.idade);
        System.out.println(funcionario.salario);
    }
}
