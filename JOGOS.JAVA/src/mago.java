public class mago extends personagem {

    public mago(String nome) {
        super(nome, "Mago");
    }

    @Override
    public void atacar(personagem adversario, item artefato) {
        if (artefato == null) {
            System.out.println(this.getNome() + " atacou " + adversario +
                    " lançando uma magia arcana com as mãos!");
        } else {
            System.out.println(this.getNome() + " atacou " + adversario +
                    " conjurando um feitiço com " + artefato.toString());
        }
    }

    @Override
    public int defender(int dano) {
        int danoReduzido = dano - 2;
        if (danoReduzido < 0) danoReduzido = 0;

        this.vida -= danoReduzido;
        System.out.println(this.getNome() + " ativou o escudo mágico! Vida restante: " + this.vida);
        return this.vida;
    }
}