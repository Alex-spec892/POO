package aas63.maratonajava.javacore.Aintroducaoclasses.test;

import aas63.maratonajava.javacore.Aintroducaoclasses.dominio.Carros;

import java.util.Scanner;

public class CarroTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carros carro01 = new Carros();
        Carros carro02 = new Carros();

       System.out.println("Digite o ano do carro01: ");
        carro01.ano = sc.nextLine();
        System.out.println("Digite o modelo do carro01: ");
        carro01.modelo = sc.nextLine();
        System.out.println("Digite a marca do carro01: ");
        carro01.marca = sc.nextLine();



        System.out.println("Digite o ano do carro02: ");
        carro02.ano = sc.nextLine();
        System.out.println("Digite o modelo do carro02: ");
        carro02.modelo = sc.nextLine();
        System.out.println("Digite a marca do carro02: ");
        carro02.marca = sc.nextLine();

       carro01 = carro02; //carro01 acessa o endereço de memoria de carro02

        System.out.println(carro01.ano + " " + carro01.modelo  + " " + carro01.marca);
        System.out.println(carro02.ano + " " + carro02.modelo  + " " + carro02.marca);


    }

}
