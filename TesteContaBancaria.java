public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345", "abc123", 500);

        conta.depositar(200);
        conta.sacar(100, "errada"); // senha incorreta
        conta.sacar(100, "abc123"); // senha correta
        conta.exibirSaldo("abc123");
    }
}
