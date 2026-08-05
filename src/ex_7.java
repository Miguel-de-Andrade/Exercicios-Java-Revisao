import javax.swing.*;

public class ex_7 {
    public static void main(String[] args) {

        boolean a = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Digite um valor booleano"));
        boolean b = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Digite outro valor booleano"));

        if (a && b){
            JOptionPane.showMessageDialog(null, "Os dois são verdadeiros");
        } else if (!a && !b){
            JOptionPane.showMessageDialog(null, "Os dois são falsos");
        } else {
            JOptionPane.showMessageDialog(null, "Um é falso e o outro verdadeiro");
        }
    }
}