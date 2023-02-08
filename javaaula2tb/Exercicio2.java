package ads.javaaula2tb;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scAlfa = new Scanner(System.in);
        Scanner scNum = new Scanner(System.in);
        String nome;
        double altura, peso;
        int idade;
        
        System.out.println("Digite seu nome:");
        nome = scAlfa.nextLine();
        System.out.println("Digite sua idade:");
        idade = scNum.nextInt();
        System.out.println("Digite seu peso:");
        peso = scNum.nextDouble();
        System.out.println("Digite sua altura:");
        altura = scNum.nextDouble();
        
        System.out.println("Nome: " + nome + " Idade: " + idade);
        System.out.println("Peso: " + peso + " Altura: " + altura);
    }
}
