package ads.exerciciosaula4tb;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu sexo (M = Masculino, F = Feminino, N = Não Binario):");
        char sexo = sc.next().charAt(0);

        if ((sexo == 'M') || (sexo == 'F') || (sexo == 'm') || (sexo == 'f')) {
            System.out.println("Sexo binário!");
        } else {
            System.out.println("Sexo não binário!");
        }

    }

}
