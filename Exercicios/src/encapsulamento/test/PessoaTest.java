package encapsulamento.test;

import encapsulamento.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Pedro");
        p1.setIdade(-1);
        p1.imprime();
        System.out.println("\nNome: " + p1.getNome() + "\nIdade: " + p1.getIdade());
    }
}
