package strategy.pattern;

public class Teste {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo();
        carro.setMovimento(new MovimentoAndar());
        carro.realizarMovimento();

        Veiculo aviao = new Veiculo();
        aviao.setMovimento(new MovimentoVoar());
        aviao.realizarMovimento();
    }
}
