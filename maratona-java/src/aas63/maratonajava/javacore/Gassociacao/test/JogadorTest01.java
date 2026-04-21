package aas63.maratonajava.javacore.Gassociacao.test;

import aas63.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Pelé");
        Jogador j2 = new Jogador("Ronaldo");
        Jogador j3 = new Jogador("Rivaldo");
        Jogador[] jogadores = new Jogador[]{j1,j2,j3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
