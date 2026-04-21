package metodos.dominio;

import java.util.Scanner;

public class ConversorTempo {
    public int min;
    public int hora;
    public int minHora;

    public void converterMinutosHora(){
        Scanner sc = new Scanner(System.in);
        min = sc.nextInt();
        hora = min/60;
        minHora = min % 60;


    }
}
