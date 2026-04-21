package exericicios.test;

import exericicios.dominio.Jogador;
import exericicios.dominio.Time;

public class TimeMain {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Gerson");
        Time time = new Time("Cruzeiro");
        j1.setTime(time);
        j1.imprime();
    }
}
