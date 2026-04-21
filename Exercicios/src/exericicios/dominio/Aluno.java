package exericicios.dominio;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private int idade;
    private double notaFinal;

    Scanner sc = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void ler(){
        this.nome = sc.next();
        this.idade = sc.nextInt();
        notaFinal = sc.nextDouble();
    }

    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota: " + notaFinal);
    }
}
