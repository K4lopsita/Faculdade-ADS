package ads.javaaula3tb;

import javax.swing.JOptionPane;

public class TesteMath {
    public static void main(String[] args) {
        double area, lado = 350, raiz;
        area = Math.pow(lado, 2);
        raiz = Math.sqrt(area);
        JOptionPane.showMessageDialog(null, "Area é " + area);
        JOptionPane.showMessageDialog(null, "Raiz é " + raiz);
        //Ou usar para ver no console, apenas System.out.printf("A raiz é %.2f\n", raiz)
    }
    
}
