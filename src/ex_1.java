import javax.swing.*;

public class ex_1 {
    public static void main(String[] args){

        int A, B, C;

        A = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o valor de A" ));
        B = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o valor de B" ));
        C = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o valor de C" ));

        int soma = A + B;

        JOptionPane.showMessageDialog(null, "A soma entre A e B é: " +soma);

        if (soma < C){
            JOptionPane.showMessageDialog(null, "A soma entre A e B é menor do que o C (" +C+ ")");
        } else if (soma > C){
            JOptionPane.showMessageDialog(null, "A soma entre A e B é maior do que o C (" +C+ ")");
        } else {
            JOptionPane.showMessageDialog(null, "A soma de A e B é igual a C");
        }
    }
}