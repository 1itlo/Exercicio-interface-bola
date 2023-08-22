public class TesteBolas {
    public static void main(String[] args) {
        Pedra pedregulho = new Pedra();
        pedregulho.lancar();
       
        BolaDeBoliche phaze = new BolaDeBoliche ("Storm");
        phaze.lancar();
        phaze.quicar();

        BolaDeFutebol jabulani = new BolaDeFutebol("Nike");
        jabulani.lancar();
        jabulani.quicar();
    }
}