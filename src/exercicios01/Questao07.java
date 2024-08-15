package exercicios01;

public class Questao07 {

    public static void main(String[] args) {
        System.out.println("Divisões com int:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                int resultadoInt = i / 2;
                System.out.println(i + " / 2 = " + resultadoInt);
            }
        }

        System.out.println("\nDivisões com double:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                double resultadoDouble = i / 2.0;
                System.out.println(i + " / 2 = " + resultadoDouble);
            }
        }
    }
}

