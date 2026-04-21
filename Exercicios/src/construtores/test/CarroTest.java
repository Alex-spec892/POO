package construtores.test;

import construtores.dominio.Carro;

public class CarroTest {
     static void main(String[] args) {
        Carro carro = new Carro("Ferrari");
        Carro carro2 = new Carro("Porche", 100000);
        System.out.println(carro.modelo);
        System.out.println(carro2.modelo +"\n" + carro2.preco);
    }
}
