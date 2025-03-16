package eng3.pattern;

public class Teste {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo();
        carro.setMovimento(new MovimentoAndar());

        Veiculo aviao = new Veiculo();
        aviao.setMovimento(new MovimentoVoar());

        // Adicionando observadores
        LogObserver logObserver = new LogObserver();
        carro.addObserver(logObserver);
        aviao.addObserver(logObserver);

        // Realizando movimentos
        carro.realizarMovimento(); // Saída: Andando. [LOG] Movimento realizado: MovimentoAndar
        aviao.realizarMovimento(); // Saída: Voando. [LOG] Movimento realizado: MovimentoVoar
    }
}