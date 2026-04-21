package aas63.maratonajava.javacore.Bintroducaometodos.atividadedevdojo.dominio;

import java.util.Scanner;

public class LerFuncionario {
    public void ler(Funcionario funcionario) {
        Scanner teclado = new Scanner(System.in);
        funcionario.nome = teclado.next();
        funcionario.idade = teclado.nextInt();
        funcionario.salario = teclado.nextDouble();
    }
}
