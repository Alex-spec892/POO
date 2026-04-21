package aas63.maratonajava.javaintroducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionaisSwitch
{
    public static void main(String[] args) {
        byte dia;
        Scanner sc = new Scanner(System.in);
        dia = sc.nextByte();
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("ter");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
    }
}
