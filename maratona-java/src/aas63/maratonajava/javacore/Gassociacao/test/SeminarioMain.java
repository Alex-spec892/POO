package aas63.maratonajava.javacore.Gassociacao.test;

import aas63.maratonajava.javacore.Gassociacao.dominio.Aluno;
import aas63.maratonajava.javacore.Gassociacao.dominio.Local;
import aas63.maratonajava.javacore.Gassociacao.dominio.Professor;
import aas63.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioMain {
    public static void main(String[] args) {
        Seminario seminario1 = new Seminario("Sistema Operacional");
        Seminario seminario2 = new Seminario("Sistema Gerencial");
        Local local1 = new Local("Rua da compuação");
        Local local2 = new Local("Rua do gerenciamento");
        Professor professor1 = new Professor("Tulio", "Engenharia software");
        Professor professor2 = new Professor("Felipe", "Metodos de criaçao de softwares");
        Professor professor3 = new Professor("Ana", "Algoritmos e tecnicas de digitaçao");
        Aluno aluno = new Aluno("Alex", 21, seminario1);
        Professor[] professores = {professor1, professor2, professor3};
        for (Professor professore : professores) {
            
        }

    }
}
