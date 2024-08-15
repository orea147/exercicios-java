package exercicios01;

import java.util.Scanner;

public class Questao09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A área do círculo é: %.2f%n", Math.round(area * 100.0) / 100.0);

        scanner.close();
    }
}
