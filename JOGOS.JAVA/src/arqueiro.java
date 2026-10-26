public class arqueiro extends personagem {

    public arqueiro(String nome) {
        super(nome, "Arqueiro");
    }

    @Override
    public void atacar(personagem adversario, item artefato) {
        if (artefato == null) {
            System.out.println(this.getNome() + " atacou " + adversario +
                    " dando um chute rápido!");
        } else {
            System.out.println(this.getNome() + " atacou " + adversario +
                    " atirando flecha com " + artefato.toString());
        }
    }

    @Override
    public int defender(int dano) {
        int danoReduzido = dano - 1;
        if (danoReduzido < 0) danoReduzido = 0;

        this.vida -= danoReduzido;
        System.out.println(this.getNome() + " usou sua agilidade para esquivar! Vida restante: " + this.vida);
        return this.vida;
    }
}