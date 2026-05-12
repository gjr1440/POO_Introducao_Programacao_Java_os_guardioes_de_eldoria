import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personagem> personagens = new ArrayList<>();

        Personagem heroi1 = new Guerreiro("Arthus", "Guerreiro", 1, 100, 10.5);
        Personagem heroi2 = new Mago("Tharkun", "Mago", 1, 100, 10.5);

        personagens.add(heroi1);
        personagens.add(heroi2);

        for (Personagem p : personagens) {
            p.exibirStatus();
        }

        for (Personagem p : personagens) {
            p.usarHabilidade();
        }
    }
}
