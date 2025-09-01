package index2;

import java.util.Scanner;

public class exr2 {
    public static void main(String[] args) {
        String nome = pergunta();
        saudacao(nome);
    }
    
    public static String pergunta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        return scanner.nextLine();
    }

    public static void saudacao(String nome) {
        System.out.println("Ola, " + nome + "!");
    }
}
