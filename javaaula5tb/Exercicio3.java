package ads.javaaula5tb;

public class Exercicio3 {

    public static void main(String[] args) {
        int i, soma = 0;
        for (i = 500; i <= 2000; i++) {
            if (i % 4 == 0) {
                soma = soma + i;
                System.out.println("Soma: " + soma);
            }
        }
    }

}
