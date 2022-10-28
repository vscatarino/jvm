public class ExemploClassLoader {
    public static void main(String[] args) {
        System.out.println("Classloader of String:" + String.class.getClassLoader());

        System.out.println("Classloader of Livro:" + Livro.class.getClassLoader());

        // System.out.println("Classloader of Gson:" + Gson.class.getClassLoader());
    }
}
