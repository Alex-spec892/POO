package construtores.dominio;
/*
2. Sobrecarga de Construtores (Opções de Criação)
Objetivo: Permitir criar objetos de formas diferentes (com ou sem todos os dados).

Enunciado: Crie uma classe Carro com atributos modelo (String) e preco (double).

Crie um construtor que recebe apenas o modelo (o preço deve ser definido como 0.0 automaticamente).

Crie um segundo construtor que recebe modelo e preço. Teste ambos no main.
 */
public class Carro {
    public String modelo;
    public double preco;

    public Carro(String modelo){
        this.modelo = modelo;
        this.preco = 0.0;
    }
    public Carro(String modelo, double preco){
        this.modelo = modelo;
        this.preco = preco;
    }
}
