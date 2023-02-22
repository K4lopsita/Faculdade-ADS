package ads.javaaula4tb;
import java.util.Scanner;
public class Exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.println("Digite um número:");
        a = sc.nextDouble();
        System.out.println("Digite outro número:");
        b = sc.nextDouble();
        
        if(a>b){
            System.out.println(a+" é maior que "+b);
        }
        else if(b>a){
            System.out.println(b+" é maior que "+a);
        }
        else{
            System.out.println("São iguais");
        }
    }

    
}
