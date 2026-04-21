public class Pessoa {
    private String CPF;
    private String nome;
    private char sexo;
    private int idade;

    public Pessoa() {
        this.CPF = "416.231.543.09";
        this.nome = "Alex Alves Santos";
        this.sexo = 'M';
        this.idade = 21;
    }


    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprimir(){
        System.out.println("CPF: " + CPF);
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade: " + idade);
    }
}
