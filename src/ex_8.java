import javax.swing.*;

public class ex_8 {
    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro valor"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo valor"));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro valor"));

        if (a > b && a > c){
            if (b > c){
                JOptionPane.showMessageDialog(null,"A ordem decrescente é: " +a+ ", " +b+ " e " +c);
            } else {
                JOptionPane.showMessageDialog(null,"A ordem decrescente é: " +a+ ", " +c+ " e "  +b);
            }
        } else if (b > a && b > c) {
            if (a > c){
                JOptionPane.showMessageDialog(null,"A ordem decrescente é: " +b+ ", " +a+ " e "  +c);
            } else {
                JOptionPane.showMessageDialog(null,"A ordem decrescente é: " +b+ ", " +c+ " e "  +a);
            }
        }else {
            if (a > b){
                JOptionPane.showMessageDialog(null,"A ordem decrescente é: " +c+ ", " +a+ " e "  +b);
            } else {
                JOptionPane.showMessageDialog(null,"A ordem decrescente é: " +c+ ", " +b+ " e "  +a);
            }
        }
    }
}