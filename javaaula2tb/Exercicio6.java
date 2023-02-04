package ads.javaaula2tb;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*Exercicio 6 - Construir um algoritmo para imprimir o calculo da
        circunferencia de um circulo com raio de 5cm*/
        System.out.println("Qual é o raio?");
        double raio = sc.nextDouble();
        
        //Declarando o pi igual a 3.14159
        double pi = 3.14159;
        //Calculo - C = 2 x pi x r
        double circ = 2 * pi * raio;
        System.out.println("A circunferencia e: " + circ + " cm");
        
    }

}
