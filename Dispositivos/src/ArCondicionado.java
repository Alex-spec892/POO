public class ArCondicionado extends Dispositivo implements ControleVoz, ConectaInternet {
    @Override
    public void conectar() {
        System.out.println("Conectando...");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando...");
    }

    @Override
    public void captarVoz() {
        System.out.println("Captando voz...");
    }
}
