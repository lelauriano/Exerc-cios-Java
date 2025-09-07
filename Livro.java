public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) {
        if (preco < 0) throw new IllegalArgumentException("O preço não pode ser negativo.");
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Título='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", Preço=" + preco +
                '}';
    }
}