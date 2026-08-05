import javax.swing.*;

public class ex_4 {
    public static void main(String[] args) {

        int numero, sucessor, antecessor;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro."));

        antecessor = numero -1;
        sucessor = numero +1;

        JOptionPane.showMessageDialog(null,"O sucessor do número " +numero+ " é " +sucessor+ " e seu antecessor é " +antecessor);


    }
}