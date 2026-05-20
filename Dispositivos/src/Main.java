public class Main {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        lampada1.setMarca("Positivo");
        lampada1.setModelo("666");
        lampada1.setConsumoEnergia(546.2);
        lampada1.setStatus(true);
        System.out.println("Lampada:");
        lampada1.captarVoz();
        lampada1.conectar();
        lampada1.desconectar();
        System.out.println("--------------------");

        ArCondicionado AC = new ArCondicionado();
        AC.setMarca("LG");
        AC.setModelo("Dual Inverter");
        AC.setConsumoEnergia(1231.4);
        AC.setStatus(false);
        System.out.println("ArCondicionado:");
        AC.captarVoz();
        AC.conectar();
        AC.desconectar();
        System.out.println("----------------------");

        Camera camera1 = new Camera();
        camera1.setMarca("canon");
        camera1.setModelo("lt009");
        camera1.setConsumoEnergia(12.2);
        camera1.setStatus(false);
        System.out.println("Camera:");
        camera1.emitirAlerta();
        System.out.println("---------------------");

    }
}
