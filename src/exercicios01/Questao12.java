package exercicios01;

import java.util.Scanner;

public class Questao12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalQuilometragem = 0;
        int totalLitros = 0;
        char continuar;

        do {
            System.out.print("Digite os quilômetros dirigidos: ");
            int quilometros = scanner.nextInt();

            System.out.print("Digite os litros de gasolina consumidos: ");
            int litros = scanner.nextInt();

            double consumoPorTanque = (double) quilometros / litros;
            System.out.printf("O consumo do tanque foi de: %.2f km/l%n", consumoPorTanque);

            totalQuilometragem += quilometros;
            totalLitros += litros;

            System.out.printf("Quilometragem combinada até agora: %d km%n", totalQuilometragem);
            System.out.printf("Total de litros consumidos até agora: %d litros%n", totalLitros);

            System.out.print("Deseja inserir outro tanque de combustível? (s/n): ");
            continuar = scanner.next().toLowerCase().charAt(0);
        } while (continuar == 's');

        if (totalLitros != 0) {
            double consumoMedioTotal = (double) totalQuilometragem / totalLitros;
            System.out.printf("Consumo médio total: %.2f km/l%n", consumoMedioTotal);
        } else {
            System.out.println("Nenhum combustível foi consumido.");
        }

        scanner.close();
    }
}
