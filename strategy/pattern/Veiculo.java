package strategy.pattern;

public class Veiculo {
    private Movimento movimento;

    public void setMovimento(Movimento movimento) {
        this.movimento = movimento;
    }

    public void realizarMovimento() {
        if (movimento != null) {
            movimento.mover();
        } else {
            System.out.println("Nenhum movimento definido.");
        }
    }
}
