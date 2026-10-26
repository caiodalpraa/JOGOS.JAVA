public class item {

    private String nome;
    private int dano;

    public item(String nome, int dano) {
        this.nome = nome;
        this.dano = dano;
    }

    @Override
    public String toString() {
        return this.nome + " com dano " + this.dano;
    }
}