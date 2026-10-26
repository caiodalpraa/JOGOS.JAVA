public class personagem {

    protected String nome;
    protected String classe;
    protected int vida;
    protected Inventario inventario;

    public personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        this.vida = 100;
        this.inventario = new Inventario();
    }

    public String getNome() {
        return this.nome;
    }

    public void atacar(personagem adversario, item artefato) {
        System.out.println("ataque específico ainda não implementado");
    }

    public int defender(int dano) {
        this.vida -= dano;
        return this.vida;
    }

    public boolean pickupItem(item novoItem) {
        return this.inventario.addItem(novoItem);
    }

    @Override
    public String toString() {
        return this.nome;
    }
}