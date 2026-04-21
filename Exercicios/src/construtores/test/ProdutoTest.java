package construtores.test;

import construtores.dominio.Produto;

public class ProdutoTest {
    public static void main(String[] args){
        Produto produto1 = new Produto("Cereal", "Alimenticio");
        Produto produto2 = new Produto("Copo");
        System.out.println(produto1.nome + "\n" + produto1.categoria);
        System.out.println(produto2.nome + "\n" + produto2.categoria);
    }
}
