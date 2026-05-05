public class Personagem {
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    public String getNome() {
        return nome;
    }

    public void usarHabilidade() {
        System.out.println("\n" + getNome() + " não possui uma habilidade especial definida.");
    }

    public void exibirStatus() {
        System.out.println("\n--- Status do Personagem ---");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + pontosDeVida);
        System.out.println("Poder base: " + poderBase);
    }
}

