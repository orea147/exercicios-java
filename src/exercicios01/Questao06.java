package exercicios01;

public class Questao06 {

    public static void main(String[] args) {
        long produtoLong = 1;
        double produtoDouble = 1.0;

        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                produtoLong *= i;
                produtoDouble *= i;
            }
        }

        System.out.println("Produto long: " + produtoLong);
        System.out.println("Produto double: " + produtoDouble);
    }
}

