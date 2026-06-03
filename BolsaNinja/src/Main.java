public class Main {
    public static void main(String[] args) {
        BolsaNinja<Object> bolsaNinja = new BolsaNinja();
        bolsaNinja.adicionarItensNinja(new Kunai(1));
        bolsaNinja.adicionarItensNinja(new Shuriken(3));
        bolsaNinja.adicionarItensNinja(new Pergaminho("Invocação do sapo"));

        System.out.println("Itens da Bolsa Ninja:");
        bolsaNinja.mostrarItensNinja();


    }
}
