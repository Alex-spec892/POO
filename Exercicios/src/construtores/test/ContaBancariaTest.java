package construtores.test;

import construtores.dominio.ContaBancaria;

public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria(-500);
        System.out.println(cb.valor);

    }
}
