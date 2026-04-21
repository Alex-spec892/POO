package metodos.test;

import metodos.dominio.ConversorTempo;

public class ConversorTempoTest {
    public static void main(String[] args){
        ConversorTempo tempo = new ConversorTempo();
        tempo.converterMinutosHora();
        System.out.println(tempo.hora + " hora(s) e " + tempo.minHora + " minuto(s)");

    }
}
