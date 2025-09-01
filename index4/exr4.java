package index4;

public class exr4 {
    public static void main(String[] args) {

        stringEx();
    }

    public static void stringEx() {
        String nome = "Esta é uma string";

        System.out.println("Tamanho da string: " + nome.length());
        System.out.println("String em maiuscula: " + nome.toUpperCase());
        System.out.println("String em minuscula: " + nome.toLowerCase());
        System.out.println("Substring: " + nome.substring(0, 5));
    }
}
