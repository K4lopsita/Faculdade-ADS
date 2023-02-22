package ads.exerciciosaula4tb;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, nivel, ht;

        System.out.println("Você é professor Nível 1, 2 ou 3 (1/2/3):");
        nivel = sc.nextDouble();
        System.out.println("Digite as horas trabalhadas:");
        ht = sc.nextDouble();

        if (nivel == 1) {
            salario = ht * 12;
            System.out.printf("O seu salário corresponde à: R$ %.2f\n", salario);
        } else if (nivel == 2) {
            salario = ht * 17;
            System.out.printf("O seu salário corresponde à: R$ %.2f\n", salario);
        } else if (nivel == 3) {
            salario = ht * 23;
            System.out.printf("O seu salário corresponde à: R$ %.2f\n", salario);
        } else {
            System.out.println("Não correponde ao Nível que é proposto!");
        }
    }
}
