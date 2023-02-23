package ads.javaaula5tb;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, X;
        System.out.println("Digite as vezes que deve aparecer a palavra:");
        X = sc.nextInt();
        for (i = 1; i <= X; i++) {
            System.out.println(i + " Eu sou capaz!");
        }
    }
}
