package aas63.maratonajava.javacore.Bintroducaometodos.test;

import aas63.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import aas63.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

import java.util.Scanner;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();
        Scanner sc = new Scanner(System.in);
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.nome = sc.nextLine();
        estudante.sexo = sc.next().charAt(0);
        estudante.idade = sc.nextInt();
        sc.nextLine();
        //--------------
        estudante02.nome = sc.nextLine();
        estudante02.sexo = sc.next().charAt(0);
        estudante02.idade = sc.nextInt();

        impressora.imprime(estudante);
        impressora.imprime(estudante02);
        //impressora.imprime esta ligado com as variaveis que foram lidas em estudante & estudante02
    }
}
