public class ContaCorrente extends ContaBancaria {
    private double taxaManutencao;

    public ContaCorrente(String numeroConta, String titular, double taxaManutencao) {
        super(numeroConta, titular);
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public boolean sacar(double valor) {
        double valorTotal = valor + taxaManutencao;
        return super.sacar(valorTotal);
    }
}
