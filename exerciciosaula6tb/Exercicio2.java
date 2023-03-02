package ads.exerciciosaula6tb;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double n1 = sc.nextDouble();
        System.out.println("Digite o segundo número:");
        double n2 = sc.nextDouble();
        System.out.println("Escolha a operação a seguir:");
        System.out.println("M. Média entre dois números digitados");
        System.out.println("S. Diferença do maior pelo menor");
        System.out.println("P. Produto entre dois números digitados");
        System.out.println("D. Divisão do primeiro pelo segundo");
        char op = sc.next().charAt(0);
        switch (op) {
            case 'M':
                double media = (n1 + n2) / 2;
                System.out.printf("A média é %.2f\n", media);
                break;
            case 'S':
                if (n1 > n2) {
                    double dif = n1 - n2;
                    System.out.printf("A diferença é %.2f\n", dif);
                } else {
                    double dif = n2 - n1;
                    System.out.printf("A diferença é %.2f\n", dif);
                }
                break;
            case 'P':
                double prod = n1 * n2;
                System.out.printf("O produto é %.2f\n", prod);
                break;
            case 'D':
                double div = n1 / n2;
                System.out.printf("A divisão é %.2f\n", div);
                break;
            default:
                System.out.println("Operação Inválida!");
                break;
        }
    }
}
