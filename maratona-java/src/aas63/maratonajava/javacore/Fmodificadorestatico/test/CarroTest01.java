package aas63.maratonajava.javacore.Fmodificadorestatico.test;

import aas63.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Ferrari", 320);
        Carro carro3 = new Carro("Porche", 290);

        carro1.setVelocidadeLimite(180);
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
