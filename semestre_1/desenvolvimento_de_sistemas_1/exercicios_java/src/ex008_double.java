/*
Escreva um programa em que o usuário deva inserir um número do tipo double e a seguir o programa exiba este número
 */

import javax.swing.JOptionPane;

public class ex008_double {
    public static void main(String[] args) {
        
        double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número do tipo real: "));

        JOptionPane.showMessageDialog(null, "O número digitado foi: " + numero);
    }
}
