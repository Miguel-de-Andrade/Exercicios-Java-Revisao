import javax.swing.*;

public class ex_11 {
    public static void main(String[] args) {

        double n1,n2,n3,n4;

        String condicao;

        String nome = JOptionPane.showInputDialog(null,     "Qual é o seu nome?");

        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a terceira nota"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quarta nota"));

        double media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 7){
            condicao = "Aprovado";
        } else {
            condicao = "Reprovado";
        }

        JOptionPane.showMessageDialog(null, "O aluno " +nome+ " foi " +condicao+ " com a média: " + String.format("%.2f", media));
    }

}