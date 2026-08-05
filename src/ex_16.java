import javax.swing.*;

public class ex_16 {
    public static void main(String[] args) {

        double tempFahrenheit = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a temperatura em Fahrenheit"));

        double tempCelsius = (5 * (tempFahrenheit - 32) / 9);

        JOptionPane.showMessageDialog(null, "A temperatura em graus Celsius é " +String.format("%.2f", tempCelsius)+ " e em Fahrenheit é "+tempFahrenheit);

    }
}
