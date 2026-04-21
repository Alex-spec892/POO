package construtores.test;

import construtores.dominio.Basico;

public class BasicoTest {
    public static void main(String[] args) {
        Basico basico = new Basico("Alex\n", 'M');
        System.out.println(basico.nome + basico.sexo);
    }
}
