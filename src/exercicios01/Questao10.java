package exercicios01;

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();

        int vogais = 0, consoantes = 0, espacos = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if ("aeiou".indexOf(c) != -1) {
                vogais++;
            } else if (c == ' ') {
                espacos++;
            } else if (Character.isLetter(c)) {
                consoantes++;
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Espaços em branco: " + espacos);
        System.out.println("Consoantes: " + consoantes);

        scanner.close();
    }
}
