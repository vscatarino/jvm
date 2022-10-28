public class Livro {
    private String nome;
    private String editora;
    private String autor;

    public Livro(String nome, String editora, String autor) {
        this.nome = nome;
        this.editora = editora;
        this.autor = autor;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEditora() {
        return this.editora;
    }

    public String getAutor() {
        return this.autor;
    }
}
