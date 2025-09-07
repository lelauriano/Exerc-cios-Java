 public class TesteLivro {
    public static void main(String[] args) {
        try {
            Livro l1 = new Livro();
            l1.setTitulo("O Senhor dos Anéis");
            l1.setAutor("J. R. R. Tolkien");
            l1.setPreco(120.50);

            System.out.println(l1);

            l1.setPreco(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
 