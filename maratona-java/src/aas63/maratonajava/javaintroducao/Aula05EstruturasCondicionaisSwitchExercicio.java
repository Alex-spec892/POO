package aas63.maratonajava.javaintroducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionaisSwitchExercicio {
    public static void main(String[] args) {
        byte dia;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a data da semana: ");
        dia = sc.nextByte();
        switch (dia) {
            case 1 : case 7:
                System.out.println("Fim de semana.");
                break;
            case 2 : case 3 : case 4 : case 5 : case 6:
                System.out.println("Dia util.");
                break;

            default: System.out.println("opcao invalida");
                break;
        }

    }
}
