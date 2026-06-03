import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
    private List<T> itensNinja;

    public BolsaNinja() {
        this.itensNinja = new ArrayList<>();
    }

    public void adicionarItensNinja(T itens){
        itensNinja.add(itens);

    }

    public void mostrarItensNinja(){
        for(T itens : itensNinja){
            System.out.println(itens);
        }
    }
}
