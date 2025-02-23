package eng3.pattern;

public class Teste {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo();
        carro.setMovimento(new MovimentoAndar());
        carro.realizarMovimento(); // Saída: Andando.

        Veiculo aviao = new Veiculo();
        aviao.setMovimento(new MovimentoVoar());
        aviao.realizarMovimento(); // Saída: Voando.
    }
}
