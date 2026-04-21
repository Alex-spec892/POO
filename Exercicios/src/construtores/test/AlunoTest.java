package construtores.test;

import construtores.dominio.Aluno;

public class AlunoTest{
    static void main() {
        Aluno aluno1 = new Aluno("Alex", 90);
        Aluno aluno2 = new Aluno("Pedro", 50);
        System.out.println(aluno1.nome + "\n" + aluno1.nota);
        System.out.println(aluno2.nome + "\n" + aluno2.nota);
    }
}