package ads.exerciciosaula4tb;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero, resultado;
        System.out.println("Digite um número:");
        numero = sc.nextDouble();

        if (numero > 0) {
            resultado = Math.sqrt(numero);
            System.out.printf("O número é positivo e a raiz quadrada é: %.2f\n", resultado);
        } else {
            System.out.println("O número é invalido!");
        }
    }
}
