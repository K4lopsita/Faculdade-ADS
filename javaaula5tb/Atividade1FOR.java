package ads.javaaula5tb;

import java.util.Scanner;

public class Atividade1FOR {

    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o número que você quer ver a tabuada? (1 a 10)");
        int num = sc.nextInt();
        for (i = 0; i <= 10; i++) {
            System.out.println("Tabuada do: " + num + " * " + i + " = " + num * i);
        }
    }

}