package aas63.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        //Esse metedo esta ligado a varaivel definida com o metedo Estudante "Estudante estudante"
        //e assim imprime os dados definidos nesse metodo
        System.out.println("-----------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }
}
