package aas63.maratonajava.javaintroducao;

import java.util.Scanner;

public class TaxNetherlands {
    public static void main(String[] args) {
        double salario = 0;
        Scanner sc = new Scanner(System.in);
        salario = sc.nextDouble();
        if (salario >= 0 && salario <= 9875){
            System.out.println("10%");
        }
        else if (salario >= 9876 && salario <= 40125) {
            System.out.println("12%");
        }
        else if (salario >= 40126 && salario <= 85525) {
            System.out.println("22%");
        }
        else if (salario >= 85526 && salario <= 163300) {
            System.out.println("24%");
        }
    }
}
