package aas63.maratonajava.javaintroducao;

import java.util.Scanner;

public class Aula06ExercicioBreak {
    public static void main(String[] args) {
        double valorTotal;
        Scanner sc = new Scanner(System.in);
        valorTotal = sc.nextDouble();
        for (int i = 1; i <= valorTotal; i++) {
            //i=parcela
            double valorParcela = valorTotal / i;
            if(valorParcela >= 1000){
                System.out.println("parcela" + i + ":" + valorParcela);
            }
            else{
                break;
            }

        }
    }
}
