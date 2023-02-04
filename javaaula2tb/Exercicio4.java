package ads.javaaula2tb;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float media;
        
        /*Exercicio 4 - Faça um para representar o cáculo da média aritmética
        das seguintes notas: 8.0, 7.5, 4.5 e 9*/
        System.out.println("Qual e a primeira nota?");
        float nota1 = sc.nextFloat();
        System.out.println("Sua primeira nota e: " + nota1);
        
        System.out.println("Qual e a segunda nota?");
        float nota2 = sc.nextFloat();
        System.out.println("Sua segunda nota e: " + nota2);
        
        System.out.println("Qual e a terceira nota?");
        float nota3 = sc.nextFloat();
        System.out.println("Sua terceira nota e: " + nota3);
        
        System.out.println("Qual e a quartat nota?");
        float nota4 = sc.nextFloat();
        System.out.println("Sua quarta nota e: " + nota4);
        
        //Media = 
        media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A media e: " + media);
    }
    
}
