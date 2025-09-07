public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String senha;

    public ContaBancaria(String numeroConta, String senha, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado. Novo saldo: " + saldo);
    }

    public void sacar(double valor, String senhaInformada) {
        if (!senha.equals(senhaInformada)) {
            System.out.println("Senha incorreta!");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo -= valor;
        System.out.println("Saque realizado. Novo saldo: " + saldo);
    }

    public void exibirSaldo(String senhaInformada) {
        if (senha.equals(senhaInformada)) {
            System.out.println("Saldo: " + saldo);
        } else {
            System.out.println("Senha incorreta!");
        }
    }
}
