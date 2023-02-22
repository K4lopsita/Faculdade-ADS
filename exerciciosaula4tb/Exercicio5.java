package ads.exerciciosaula4tb;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numA, numB;
        System.out.println("Informe o primeiro número:");
        numA = sc.nextDouble();
        System.out.println("Informe o segundo número");
        numB = sc.nextDouble();

        if (numA > numB) {
            System.out.println(numA + " é o número maior");
        } else {
            System.out.println(numB + " é o número maior");
        }
    }

}
