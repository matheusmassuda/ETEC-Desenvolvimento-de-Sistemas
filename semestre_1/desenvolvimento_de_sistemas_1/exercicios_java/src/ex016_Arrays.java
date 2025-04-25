//Declarando um veotor em Java;
//Coletando valores para Array de forma manual;

import javax.swing.JOptionPane;

public class ex016_Arrays {
    public static void main(String[] args) {
        int numeros [] = new int[4];

        numeros[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        numeros[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
        numeros[2] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro número: "));
        numeros[3] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o quarto número: "));

        JOptionPane.showMessageDialog(null, "Posição 0: "+numeros[0]+"\n Posição 1: "+numeros[1]+"\n Posição 2: "+numeros[2]+"\n Posição 3: "+numeros[3]);
    }
}