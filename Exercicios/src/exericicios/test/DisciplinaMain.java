package exericicios.test;

import exericicios.dominio.Disciplina;
import exericicios.dominio.Professor;

public class DisciplinaMain {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina("Matematica");
        Professor professor = new Professor("Claudio", "Calculo II");
        professor.setDiscplina(disciplina);
        professor.Imprime();
    }
}
