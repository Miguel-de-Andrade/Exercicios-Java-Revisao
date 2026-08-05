import javax.swing.*;

public class ex_10 {
    public static void main(String[] args) {

        double n1,n2,n3;

        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a terceira nota"));

        double media = (n1 + n2 + n3) / 3;

        JOptionPane.showMessageDialog(null, "A média das 3 notas é: " +     String.format("%.2f", media));

    }
}