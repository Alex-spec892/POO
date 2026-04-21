package aas63.maratonajava.javacore.Aintroducaoclasses.test;


import aas63.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

import java.util.Scanner;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Scanner sc = new Scanner(System.in);
        estudante.nome = sc.nextLine();
        estudante.idade = sc.nextInt();
        estudante.sexo = sc.next().charAt(0);
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
