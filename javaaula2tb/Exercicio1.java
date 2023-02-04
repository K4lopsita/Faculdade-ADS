package ads.javaaula2tb;

import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        Scanner scAlfa = new Scanner(System.in);
        Scanner scNum = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scAlfa.nextLine();
        System.out.println("O nome digitado foi: " + nome);
        System.out.println("Digite sua RA");
        int RA = scNum.nextInt();
        System.out.println("O seu RA é: " + RA);
        System.out.println("Digite seu curso:");
        String curso = scAlfa.nextLine();
        System.out.println("O seu curso é: " + curso);
    }
}
 
