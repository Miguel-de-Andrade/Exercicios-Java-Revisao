import javax.swing.*;

public class ex_15 {
    public static void main(String[] args) {

        double ladoA = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o lado A do triângulo"));
        double ladoB = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o lado B do triângulo"));
        double ladoC = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o lado C do triângulo"));

        String tipo = "";

        if ((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA)){
            if (ladoA == ladoB && ladoB == ladoC){
                tipo = "Equilátero";
            } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
                tipo = "Isósceles";
            } else {
                tipo = "Escaleno";
            }

            JOptionPane.showMessageDialog(null, "O tipo do triângulo é: " +tipo);

        } else {
            JOptionPane.showMessageDialog(null, "Não pode formar um triângulo");
        }

    }
}
