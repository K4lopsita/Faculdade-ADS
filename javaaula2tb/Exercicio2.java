package ads.javaaula2tb;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scAlfa = new Scanner(System.in);
        Scanner scNum = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scAlfa.nextLine();
        System.out.println("O nome digitado foi: " + nome);
        System.out.println("Digite sua idade");
        int idade = scNum.nextInt();
        System.out.println("A sua idade é: " + idade);
        System.out.println("Digite seu peso:");
        int peso = scNum.nextInt();
        System.out.println("O seu peso é: " + peso);
    }
}
