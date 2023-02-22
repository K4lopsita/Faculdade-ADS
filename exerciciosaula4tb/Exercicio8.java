package ads.exerciciosaula4tb;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num, result, result1;
        System.out.println("Informe o número, seja ele positivo ou negativo:");
        num = sc.nextDouble();

        if (num > 0) {
            result = Math.pow(num, 2);
            result1 = Math.sqrt(num);
            System.out.printf("O número ao quadrado é: %.2f\n", result);
            System.out.printf("A raiz quadrada é: %.2f\n", result1);
        } else {
            System.out.println("O número digitado é invalido!");
        }
    }
}
