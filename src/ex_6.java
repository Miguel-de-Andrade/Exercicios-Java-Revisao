import javax.swing.*;

public class ex_6 {
    public static void main(String[] args) {

        double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite qualquer número:"));

        double reajuste = (numero * 5) / 100;

        double numeronovo = numero + reajuste;

        JOptionPane.showMessageDialog(null, "O número " +numero+ " mais 5% é " +numeronovo);

    }
}
