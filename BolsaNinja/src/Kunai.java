public class Kunai {
    private int tipo;

    private String tipoNome;

    public Kunai(int tipo) {
        //this.tipo = tipo;
        setTipo(tipo);
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
        switch (tipo){
            case 1:
                tipoNome = "Kunai explosiva";
                break;
            case 2:
                tipoNome = "Kunai invisivel";
                break;
            case 3:
                tipoNome = "Kunai envenenada";
                break;
            default:
                tipoNome = "Kunai comum";
                break;
        }

    }

    public String getTipoNome() {
        return tipoNome;
    }

    public void setTipoNome(String tipoNome) {
        this.tipoNome = tipoNome;
    }

    @Override
    public String toString() {
        return "Kunai tipo: " + tipoNome;
    }




}
