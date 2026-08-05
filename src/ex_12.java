import javax.swing.*;

public class ex_12 {
    public static void main(String[] args) {

        String maiorOUmenor = "";

        String nome = JOptionPane.showInputDialog(null, "Digite o seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua idade:"));

        if (idade >= 18){
            maiorOUmenor = "maior de idade";
        } else {
            maiorOUmenor = "menor de idade";
        }

        JOptionPane.showMessageDialog(null, "O seu nome é " +nome+ " e você é " +maiorOUmenor);
    }
}
