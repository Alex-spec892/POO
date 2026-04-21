package aas63.maratonajava.javacore.Csobrecarga.dominio;

import java.util.Scanner;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    Scanner sc = new Scanner(System.in);

    public void init(String nome, String tipo, int episodios, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("tipo: " + this.tipo);
        System.out.println("episodios: " + this.episodios);
        System.out.println("genero: " + this.genero);
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public String getGenero(){
        return this.genero;
    }

    public String getTipo(){
        return this.tipo;
    }
    public int getEpisodios(){
        return this.episodios;
    }
    public String getNome(){
        return this.nome;
    }
}
