package aas63.maratonajava.javacore.Gassociacao.test;

import aas63.maratonajava.javacore.Gassociacao.dominio.Jogador;
import aas63.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Gerson");
        Jogador jogador2 = new Jogador("Cassio");
        Time time = new Time("Cruzeiro");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("-- jogador --");
        jogador1.imprime();
        System.out.println("-- time --");
        time.imprime();

    }
}
