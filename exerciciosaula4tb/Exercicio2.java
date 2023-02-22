package ads.exerciciosaula4tb;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número:");
        numero = sc.nextInt();
        if ((numero % 2) == 0) {
            System.out.println("O número digitado é par");
        } else {
            System.out.println("O número digitado é impar");
        }
        if (numero > 0) {
            System.out.println("O número digitado é positivo");
        } else if (numero < 0) {
            System.out.println("O número digitado é negativo");
        } else {
            System.out.println("O número digitado é zero");
        }
    }

}
