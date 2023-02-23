package ads.javaaula5tb;

import java.util.Scanner;

public class Multiplicatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota, p = 1;
        System.out.println("Digite uma nota:");
        nota = sc.nextDouble();
        p = p * nota;
        System.out.println("Digite uma outra nota:");
        nota = sc.nextDouble();
        p = p * nota;
        System.out.println("A multiplicação das notas é = " + p);
    }
    
}
