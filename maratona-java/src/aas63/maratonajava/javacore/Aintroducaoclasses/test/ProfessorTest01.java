package aas63.maratonajava.javacore.Aintroducaoclasses.test;

import aas63.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

import java.util.Scanner;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Professor professor = new Professor();
        professor.nome = sc.next();
        professor.idade = sc.nextInt();
        professor.sexo = sc.next();
        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
