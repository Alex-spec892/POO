package aas63.maratonajava.javacore.Aintroducaoclasses.test;

import aas63.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

import java.util.Scanner;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante.nome = sc.nextLine();
        estudante.idade = sc.nextInt();
        estudante.sexo = sc.next().charAt(0);
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("-----------");

        estudante2.nome = sc.nextLine();
        estudante2.idade = sc.nextInt();
        estudante2.sexo = sc.next().charAt(0);

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
