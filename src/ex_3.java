import javax.swing.*;

public class ex_3 {
    public static void main(String[] args) {

        int A,B,C ;

        A = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de A"));
        B = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de B"));

        if (A == B){
            C = A + B;
        }else {
            C = A * B;
        }

        JOptionPane.showMessageDialog(null, "O valor de C é: " +C);

    }
}