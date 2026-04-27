package nome;

public class Nomes {
    private String nomeProprio;
    private String nomeMeio;
    private String nomeFamilia;
    private String nomeCompleto;
    private String rubrica;

    public Nomes(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;

    }
    public Nomes(String nomeProprio, String nomeMeio, String nomeFamilia) {
        this.nomeProprio = nomeProprio;
        this.nomeMeio = nomeMeio;
        this.nomeFamilia = nomeFamilia;
    }
    public Nomes(){
        this.nomeCompleto = "";
    }

    public String getNomeFamilia() {
        return nomeFamilia;
    }

    public void setNomeFamilia(String nomeFamilia) {
        this.nomeFamilia = nomeFamilia;
    }

    public String getNomeMeio() {
        return nomeMeio;
    }

    public void setNomeMeio(String nomeMeio) {
        this.nomeMeio = nomeMeio;
    }

    public String getNomeProprio() {
        return nomeProprio;
    }

    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public void imprimirNomes(){
        System.out.println("Nome completo: " + nomeCompleto);
    }
    public void imprimirNomes2(){
        System.out.println("Nome completo2: " + nomeProprio + " " + nomeMeio + " " + nomeFamilia);
    }
    public void retornarRubrica(){
        String[] partes = nomeCompleto.split(" ");
        String rubrica = "";
        String rubricaMinucula = rubrica.toLowerCase();
        for(String nome : partes){
            if(!nome.isEmpty()){
                rubrica += nome.charAt(0);
            }
        }
        System.out.println("Rubrica: " + rubrica.toLowerCase());
    }
    public void retornarAssinatura(){
        String[] partes = nomeCompleto.split(" ");
        StringBuilder assinatura = new StringBuilder();

        for(int i = 0; i < partes.length; i++){
            if(i < partes.length -1){
                String inicial = partes[i].substring(0,1).toUpperCase();
                assinatura.append(inicial).append(". ");
            }
            else{
                assinatura.append(partes[i]);
            }

        }
        System.out.println("Assinatura: " + assinatura.toString());

    }
}
