public class Mago extends Personagem {

    public Mago(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        super(nome, classe, nivel, pontosDeVida, poderBase);
    }
    
    public void usarHabilidade() {
        System.out.println("\nO mago " + getNome() + " conjura uma poderosa magia!");
    }
}
