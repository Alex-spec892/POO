package aas63.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private int idade;
    private String nome;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String x){ //se a varaivel dentro do () for diferente da definida aneriormene não é necessario o this.
        nome = x;
    }
    public void setIdade(int idade){//recomenda-se que use os mesmos nomes e usar o this.
        if(idade < 0){
            System.out.println("idade invalida");
            return;
        }
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
}
