package ads.exerciciosaula6tb;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0, valor;
        int numCliente;
        char op = 'S', op1 = 'S';
        while (op1 == 'S') {
            System.out.println("Qual seu numero de Cliente? (Exemplo: 1/2/3)");
            numCliente = sc.nextInt();
            while (op == 'S') {
                System.out.println("Qual produto você deseja?");
                System.out.println("100. Cachorro Quente - 1,20");
                System.out.println("101. Bauru Simples - 1,30");
                System.out.println("102. Bauru com ovo - 1,50");
                System.out.println("103. Hambúrguer - 1,20");
                System.out.println("104. Chesseburguer - 1,30");
                System.out.println("105. Refrigerante - 1,00");
                int cod = sc.nextInt();
                System.out.println("Qual a quantidade que você?");
                int qtd = sc.nextInt();
                switch (cod) {
                    case 100:
                        valor = qtd * 1.20;
                        System.out.println("Você escolheu o Cachorro Quente");
                        System.out.printf("Valor a pagar: %.2f\n", valor);
                        soma = soma + valor;
                        break;
                    case 101:
                        valor = qtd * 1.30;
                        System.out.println("Você escolheu o Bauru Simples");
                        System.out.printf("Valor a pagar: %.2f\n", valor);
                        soma = soma + valor;
                        break;
                    case 102:
                        valor = qtd * 1.50;
                        System.out.println("Você escolheu o Bauru com ovo");
                        System.out.printf("Valor a pagar: %.2f\n", valor);
                        soma = soma + valor;
                        break;
                    case 103:
                        valor = qtd * 1.20;
                        System.out.println("Você escolheu o Hambúrguer");
                        System.out.printf("Valor a pagar: %.2f\n", valor);
                        soma = soma + valor;
                        break;
                    case 104:
                        valor = qtd * 1.30;
                        System.out.println("Você escolheu o Chesseburguer");
                        System.out.printf("Valor a pagar: %.2f\n", valor);
                        soma = soma + valor;
                        break;
                    case 105:
                        valor = qtd * 1.00;
                        System.out.println("Você escolheu o Refrigerante");
                        System.out.printf("Valor a pagar: %.2f\n", valor);
                        soma = soma + valor;
                        break;
                    default:
                        System.out.println("Código inválido!");
                        break;
                }
                System.out.println("Deseja fazer outro pedido? Digite (S/N)");
                op = sc.next().charAt(0);
            }
            System.out.println("Cliente: " + numCliente);
            System.out.printf("O valor total do pedido é: %.2f\n", soma);
            System.out.println("Deseja cadastrar outro cliente? Digite (S/N)");
            op1 = sc.next().charAt(0);
        }
    }
}
