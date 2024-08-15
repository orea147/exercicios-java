package exercicios01;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Números primos menores que " + numero + ":");
        for (int i = 2; i < numero; i++) {
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    public static boolean isPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
