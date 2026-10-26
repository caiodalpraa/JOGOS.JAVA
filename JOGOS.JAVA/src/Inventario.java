import java.util.List;
import java.util.ArrayList;

public class Inventario {

    private List<item> itens;
    private int tamanhoInventario;

    public Inventario() {
        this.itens = new ArrayList<>();
        this.tamanhoInventario = 10;
    }

    public boolean addItem(item novoItem){
        if (this.itens.size() < this.tamanhoInventario) {
            this.itens.add(novoItem);
            System.out.println("O item " +
                    novoItem +
                    " foi inserido com sucesso");

            return true;
        } else {
            System.out.println("Não foi possível " +
                    "adicionar o item!");

            return false;
        }
    }
}