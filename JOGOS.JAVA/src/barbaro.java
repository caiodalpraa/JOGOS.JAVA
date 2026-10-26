public class barbaro extends personagem {

    public barbaro(String nome) {
        super(nome, "Bárbaro");
    }

    @Override
    public void atacar(personagem adversario, item artefato) {
        if (artefato == null) {
            System.out.println(this.getNome() + " atacou " + adversario.getNome() + " na porrada!");
        } else {
            System.out.println(this.getNome() + " atacou " + adversario.getNome() + " utilizando " + artefato.toString());
        }
    }

    @Override
    public int defender(int dano) {
        int danoReduzido = dano - 3;
        if (danoReduzido < 0) danoReduzido = 0;

        this.vida -= danoReduzido;
        System.out.println(this.getNome() + " resistiu bravamente ao golpe! Vida restante: " + this.vida);
        return this.vida;
    }
}