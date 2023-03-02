package ads.exerciciosaula6tb;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual período você estuda?");
        System.out.println("M. Matutino");
        System.out.println("V. Vespertino");
        System.out.println("N. Noturno");
        char per = sc.next().charAt(0);
        switch(per){
            case 'M':
                System.out.println("BOM DIA!!");
                break;
            case 'V':
                System.out.println("BOA TARDE!!");
                break;
            case 'N':
                System.out.println("BOA NOITE!!");
                break;
            default:
                System.out.println("Período Inválido!");
                break;
        }
    }
    
}
