import java.util.ArrayList;

public class Banco {
    private ArrayList<ContaBancaria> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void abrirConta(ContaBancaria novaConta) {
        contas.add(novaConta);
    }

    public ContaBancaria buscarConta(String numero) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numero)) {
                return conta;
            }
        }
        return null;
    }

    public void realizarOperacao(String numeroConta, String tipoOperacao, double valor) {
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            if (tipoOperacao.equalsIgnoreCase("depositar")) {
                conta.depositar(valor);
            } else if (tipoOperacao.equalsIgnoreCase("sacar")) {
                boolean sucesso = conta.sacar(valor);
                if (!sucesso) {
                    System.out.println("Saldo insuficiente na conta " + numeroConta);
                }
            } else {
                System.out.println("Operação inválida.");
            }
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void listarContas() {
        for (ContaBancaria conta : contas) {
            System.out.println("Conta: " + conta.getNumeroConta() + " | Titular: " + conta.getTitular() + " | Saldo: " + conta.getSaldo());
        }
    }
}
