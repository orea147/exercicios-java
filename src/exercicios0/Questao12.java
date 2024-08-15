package exercicios0;

public class Questao12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                int resultadoInt = i / 2;
                double resultadoDouble = (double) i / 2;
                System.out.println("Número: " + i);
                System.out.println("Divisão por 2 (int): " + resultadoInt);
                System.out.println("Divisão por 2 (double): " + resultadoDouble);
                System.out.println();
            }
        }
    }
}

