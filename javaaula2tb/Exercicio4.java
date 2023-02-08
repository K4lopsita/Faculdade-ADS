package ads.javaaula2tb;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media;
        
        /*Exercicio 4 - Faça um algoritmo para representar o cálculo da média 
        aritmética das seguintes notas: 8.0, 7.5, 4.5 e 9*/
        System.out.println("Digite as 4 notas:");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double nota4 = sc.nextDouble();
        
        //Media = (n1+n2+n3+n4) / 4
        media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A média e: " + media);
        
    }
    
}
