import javax.swing.*;

public class ex_9 {
    public static void main(String[] args) {

        Double peso = Double.parseDouble ( JOptionPane.showInputDialog(null,"Digite o seu peso em kg:"));
        Double altura = Double.parseDouble ( JOptionPane.showInputDialog(null,"Digite a sua altura em m:"));

        Double imc = peso/(altura * altura);

        String condicao = "";

        if (imc < 18.5){
            condicao = "Abaixo do peso";
        } else if (imc < 25) {
            condicao = "Peso ideal (parabéns)";
        } else if (imc < 30) {
            condicao = "Levemente acima do peso";
        } else if (imc < 35) {
            condicao = "Obesidade grau 1";
        } else if (imc < 40) {
            condicao = "Obesidade grau 2 (severa)";
        } else {
            condicao = "Obesidade grau 3 (mórbida)";
        }

        JOptionPane.showMessageDialog(null, "O seu IMC é: " + String.format("%.2f", imc)+" e sua condição é: " + condicao );


    }
}