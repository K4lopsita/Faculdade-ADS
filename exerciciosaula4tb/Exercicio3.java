package ads.exerciciosaula4tb;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA, numB, resultado;
        System.out.println("Digite o primeiro número:");
        numA = sc.nextInt();
        System.out.println("Digite o segundo número:");
        numB = sc.nextInt();

        if (numA > numB) {
            resultado = numA - numB;
            System.out.println("A diferença é: " + resultado);
        } else {
            resultado = numB - numA;
            System.out.println("A diferença é: " + resultado);
        }
    }
}
