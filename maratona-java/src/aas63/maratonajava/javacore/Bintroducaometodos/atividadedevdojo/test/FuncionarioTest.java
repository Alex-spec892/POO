package aas63.maratonajava.javacore.Bintroducaometodos.atividadedevdojo.test;

import aas63.maratonajava.javacore.Bintroducaometodos.atividadedevdojo.dominio.Funcionario;
import aas63.maratonajava.javacore.Bintroducaometodos.atividadedevdojo.dominio.ImpressoraFuncionario;
import aas63.maratonajava.javacore.Bintroducaometodos.atividadedevdojo.dominio.LerFuncionario;

import java.util.Scanner;

public class FuncionarioTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();

        ImpressoraFuncionario impressora = new ImpressoraFuncionario();
        LerFuncionario lerFuncionario = new LerFuncionario();

        lerFuncionario.ler(funcionario01);
        lerFuncionario.ler(funcionario02);
        lerFuncionario.ler(funcionario03);

        impressora.imprime(funcionario01);
        impressora.imprime(funcionario02);
        impressora.imprime(funcionario03);

        double media= 0;
        media = (funcionario01.salario + funcionario02.salario + funcionario03.salario)/3;
        System.out.println("media: "+media);


    }
}
