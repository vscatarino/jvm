public class Exemplo1 {
    public static void main(String[] args) {
        Livro livro = new Livro("Harry Potter e a Câmara Secreta", "Pottermore Publishing", "J.K. Rowling");

        System.out.printf("Nome do livro: %s \n", livro.getNome());
        System.out.println("E tudo aconteceu!");
    }
}
