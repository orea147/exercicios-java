package exercicios01;

import java.util.Scanner;

class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        int maiorValor = (valor1 > valor2) ? valor1 : valor2;

        System.out.println("O maior valor é: " + maiorValor);

        scanner.close();
    }
}
