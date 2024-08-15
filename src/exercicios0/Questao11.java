package exercicios0;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        String codigo = scanner.nextLine();

        String produto;

        if (codigo.equals("001")) {
            produto = "Parafuso";
        } else if (codigo.equals("002")) {
            produto = "Porca";
        } else if (codigo.equals("003")) {
            produto = "Prego";
        } else {
            produto = "Diversos";
        }

        System.out.println("O produto correspondente ao código " + codigo + " é: " + produto);

        scanner.close();
    }
}

