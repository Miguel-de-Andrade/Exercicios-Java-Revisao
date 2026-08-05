import javax.swing.*;

public class ex_5 {
    public static void main(String[] args) {

        double salariominimo = 1293.20;

        double salarioUsuario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu salário:"));

        double quant = salarioUsuario / salariominimo;

        JOptionPane.showMessageDialog(null, "Você ganha " + String.format("%.2f", quant) + " salários mínimos");
    }
}

