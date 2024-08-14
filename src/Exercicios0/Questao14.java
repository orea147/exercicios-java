package Exercicios0;

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;

        while (count < 50) {
            System.out.print("Digite um número (" + (count + 1) + " de 50): ");
            double number = scanner.nextDouble();
            sum += number;
            count++;
        }

        double media = sum / 50;
        System.out.println("A média aritmética dos 50 números é: " + media);

        scanner.close();
    }
}

