import javax.swing.*;

public class ex_13 {
    public static void main(String[] args) {

        int A = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite umvalor para A"));
        int B = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor par B"));

        int prov = A;

        A = B;
        B = prov;

        JOptionPane.showMessageDialog(null, "O novo valor de A é " +A+ " e o novo valor de B é " +B);
    }
}
