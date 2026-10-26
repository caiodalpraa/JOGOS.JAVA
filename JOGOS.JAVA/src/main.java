public class main {

    public static void main() {
        bardo p1 = new bardo("Cleitinho");
        barbaro p2 = new barbaro("Ronaldinho");

        mago p3 = new mago("Peixoto");
        arqueiro p4 = new arqueiro("Gavião");

        personagem p5 = new personagem("Nilson", "Monstro");

        item i1 = new item("Viola caipira", 6);
        item i2 = new item("Pandeiro", 2);

        p1.pickupItem(i1);
        p1.pickupItem(i2);

        p1.atacar(p2, i1);
        p2.atacar(p1, null);

        p3.atacar(p5, null);
        p4.atacar(p5, new item("Arco longo", 8));

        p2.defender(10);
        p5.defender(8);
    }
}