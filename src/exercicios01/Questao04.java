package exercicios01;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        final double MILHA_PARA_KM = 1.609;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância em milhas: ");
        double milhas = scanner.nextDouble();

        double quilometros = milhas * MILHA_PARA_KM;

        System.out.printf("%.2f milhas é igual a %.2f quilômetros.%n", milhas, quilometros);

        scanner.close();
    }
}

