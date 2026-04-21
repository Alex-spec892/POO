package aas63.maratonajava.javacore.Gassociacao.test;

import aas63.maratonajava.javacore.Gassociacao.dominio.Jogador;
import aas63.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Ronaldo");
        Time time = new Time("Cruzeiro!");

        j1.setTime(time);
        j1.imprime();
    }
}
