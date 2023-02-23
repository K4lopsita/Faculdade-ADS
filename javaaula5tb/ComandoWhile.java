package ads.javaaula5tb;

import java.util.Scanner;

public class ComandoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, num;
        char op = 's';
        while (op == 's') {
            System.out.println("Digite um número:");
            num = sc.nextInt();
            soma = soma + num;
            System.out.println("Deseja continuar somando? Digite (s/n)");
            op = sc.next().charAt(0);
        }
        System.out.println("A soma dos números digitados é = " + soma);
    }

}
