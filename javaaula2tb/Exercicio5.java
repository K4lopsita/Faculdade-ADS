package ads.javaaula2tb;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float resultado;

        System.out.println("Qual o comprimento das laterais do seu quadrado?");
        float lado = sc.nextFloat();
        System.out.println("O comprimento da lateral e: " + lado + " cm");
        
        //Area = lado x lado
        resultado = lado * lado;
        System.out.println("A area do seu quadrado e: " + resultado + " cm²");

    }

}
