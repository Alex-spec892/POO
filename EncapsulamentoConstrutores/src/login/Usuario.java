package login;

public class Usuario {private String cpf;
    private String nome;
    private String telefone;
    private String usuario;
    private String senha;


    public Usuario(String cpf, String nome, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.usuario = nome;
        this.senha = cpf;
    }


    public Usuario(String cpf, String nome, String telefone, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.usuario = validarEmail(email) ? email : nome;
        this.senha = cpf;
    }


    public Usuario(String cpf, String nome, String telefone, String email, String senhaFornecida) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;


        this.usuario = validarEmail(email) ? email : nome;


        if (senhaFornecida != null && senhaFornecida.length() >= 6) {
            this.senha = senhaFornecida;
        } else {
            this.senha = cpf;
        }
    }

    private boolean validarEmail(String email) {
        if (email == null) return false;
        int posAt = email.indexOf("@");
        // Verifica @ a partir da 2ª posição (índice 1) e se existe ".com" depois dele
        return posAt >= 1 && email.substring(posAt).contains(".com");
    }



    public String toString() {
        return String.format("Nome: %s | Usuário: %s | Senha: %s", nome, usuario, senha);
    }
}

