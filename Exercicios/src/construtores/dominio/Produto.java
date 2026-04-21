package construtores.dominio;

public class Produto {
    public String nome;
    public String categoria;

    public Produto(String nome, String categoria){
        this.nome = nome;
        this.categoria = categoria;
    }
    public Produto(String nome){
        this(nome, "geral");
    }
}
