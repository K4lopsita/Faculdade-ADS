package ads.exerciciosaula4tb;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num, resultado;
        System.out.println("Informe o número, seja ele negativo ou positivo:");
        num = sc.nextDouble();

        if (num > 0) {
            resultado = Math.sqrt(num);
            System.out.printf("O número é positivo e o resultado da raiz quadrada fica: %.2f\n", resultado);
        } else {
            resultado = Math.pow(num, 2);
            System.out.printf("O número é negativo e o resultado ao quadrado fica: %.2f\n", resultado);
        }
    }
}
