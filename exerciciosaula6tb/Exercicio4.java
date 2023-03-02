package ads.exerciciosaula6tb;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu salario atual?");
        double salario = sc.nextDouble();
        System.out.println("Qual seu plano de trabalho?");
        System.out.println("A. Plano A - 10% de Aumento");
        System.out.println("B. Plano B - 15% de Aumento");
        System.out.println("C. Plano C - 20% de Aumento");
        char plano = sc.next().charAt(0);
        switch (plano) {
            case 'A':
                double aum1 = (salario * 0.1) + salario;
                System.out.println("Plano A:");
                System.out.printf("Seu salario atual é %.2f\n", aum1);
                break;
            case 'B':
                double aum2 = (salario * 0.15) + salario;
                System.out.println("Plano B:");
                System.out.printf("Seu salario atual é %.2f\n", aum2);
                break;
            case 'C':
                double aum3 = (salario * 0.2) + salario;
                System.out.println("Plano C:");
                System.out.printf("Salario atual é %.2f\n", aum3);
            default:
                System.out.println("Plano Indisponível");
                break;
        }
    }

}
