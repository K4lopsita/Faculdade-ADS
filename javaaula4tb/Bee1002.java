package ads.javaaula4tb;

import java.util.Scanner;

public class Bee1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, n, raio;
        n = 3.14159;
        
        raio = sc.nextDouble();
        A= n*raio*raio;
        System.out.printf("A=%.4f\n", A);
    }
    
}
