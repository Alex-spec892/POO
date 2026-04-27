package login;

public class Login {
    private String nome;
    private String CPF;
    private String telefone;
    private String usuario;
    private String senha;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Login(String nome, String CPF, String telefone){
        this.usuario = nome;
        this.senha = CPF;
        this.telefone = telefone;
    }
    public Login(String nome, String CPF, String email, String telefone){
        char[] partesEmail = email.toCharArray();
        int posicaoArroba = 0;
        int posicaoPontoCom = 0;
        for(int i = 0; i < partesEmail.length; i++){
            if(partesEmail[i] == '@'){
                posicaoArroba = i;
            }
        }
        for(int i = 0; i < partesEmail.length; i++){
            if(partesEmail[i] = '.' && partesEmail[i] = '.'){
                posicaoPontoCom = i;
            }
            else{
                this.usuario = nome;
            }
        }
    }

}

