package eng3.pattern;

public class Veiculo extends Subject {
    private Movimento movimento;

    public void setMovimento(Movimento movimento) {
        this.movimento = movimento;
    }

    public void realizarMovimento() {
        if (movimento != null) {
            movimento.mover();
            notifyObservers("Movimento realizado: " + movimento.getClass().getSimpleName());
        } else {
            notifyObservers("Nenhum movimento definido.");
        }
    }
}