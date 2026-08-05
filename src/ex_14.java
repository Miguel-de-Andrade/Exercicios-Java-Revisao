import javax.swing.*;

public class ex_14 {
    public static void main(String[] args) {

        int anoNasc = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o seu ano de nascimento"));
        int mesNasc = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o seu mês de nascimento"));
        int diaNasc = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o seu dia de nascimento"));

        int anoAtual = 2026;
        int mesAtual = 7;
        int diaAtual = 29;

        int anosTotais = anoAtual - anoNasc;
        int mesesTotais = mesAtual - mesNasc;
        int diasTotais = diaAtual - diaNasc;

        if (diasTotais < 0){
            diasTotais = diasTotais + 30;
            mesesTotais--;
        }

        if (mesesTotais < 0){
            mesesTotais = mesesTotais + 12;
            anosTotais--;
        }

        JOptionPane.showMessageDialog(null, "Você viveu " +anosTotais+ " anos, " +mesesTotais+ " meses e " +diasTotais+ " dias.");
    }
}
