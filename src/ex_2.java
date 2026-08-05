import javax.swing.*;

public class ex_2 {
    public static void main(String[] args) {

        int numero;

        String ParOUimpar;

        String PosiOUneg;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número qualquer"));

        if ( numero % 2 == 0){
            ParOUimpar = "par";
        } else {
            ParOUimpar = "ímpar";
        }

        if ( numero > 0){
            PosiOUneg = "positivo";
        } else if (numero < 0) {
            PosiOUneg = "negativo";
        } else {
            PosiOUneg = "é zero";
        }

        JOptionPane.showMessageDialog(null, "Esse número é " +ParOUimpar+ " e " +PosiOUneg);
    }
}