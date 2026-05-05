public class Main {
    public static void main(String[] args) {
        Personagem heroi1 = new Guerreiro("Arthus", "Guerreiro", 1, 100, 10.5);
        Personagem heroi2 = new Mago("Tharkun", "Mago", 1, 100, 10.5);

        heroi1.exibirStatus();
        heroi2.exibirStatus();

        heroi1.usarHabilidade();
        heroi2.usarHabilidade();
    }
}
