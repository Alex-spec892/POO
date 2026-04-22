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
        System.out.println("Rubrica: " + rubrica);
        for(String nome : partes){
            if(!nome.isEmpty()){
                rubrica += nome.charAt(0);
            }
        }
        System.out.println("Rubrica: " + rubrica.toUpperCase());
    }
}
