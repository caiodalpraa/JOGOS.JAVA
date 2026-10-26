public class bardo extends personagem {

    public bardo(String nome) {
        super(nome, "Bardo");
    }

    @Override
    public void atacar(personagem adversario, item artefato) {
        if (artefato == null) {
            System.out.println(this.getNome() + " atacou " + adversario.getNome() + " cantando uma canção ensurdecedora!");
        } else {
            System.out.println(this.getNome() + " atacou " + adversario.getNome() + " tocando " + artefato.toString());
        }
    }

    @Override
    public int defender(int dano) {
        this.vida -= dano;
        System.out.println(this.getNome() + " tocou uma nota defensiva, mas levou dano. Vida restante: " + this.vida);
        return this.vida;
    }
}