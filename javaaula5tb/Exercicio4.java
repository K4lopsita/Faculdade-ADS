package ads.javaaula5tb;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, X, Y, soma = 0;
        System.out.println("Digite o valor de X:");
        X = sc.nextInt();
        System.out.println("Digite o valor de Y:");
        Y = sc.nextInt();

        for (i = X; i <= Y; i++) {
            soma = soma + i;
            System.out.println("Soma: " + soma);
        }
    }

}
