package ads.javaaula3tb;

import javax.swing.JOptionPane;

public class TesteJO {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Qual o seu primeiro nome?", "Digite aqui seu primeiro nome", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Seu primeiro nome é: " + nome, "Saída de Dados", JOptionPane.PLAIN_MESSAGE);
        
        String nome2 = JOptionPane.showInputDialog(null, "Qual o seu sobrenome?", "Entrada de dados", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Seu nome completo é: " + nome + " " + nome2, "Saída de Dados", JOptionPane.PLAIN_MESSAGE);
    }
    
}
