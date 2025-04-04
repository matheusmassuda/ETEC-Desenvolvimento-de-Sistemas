/*
Elabore um programa que realiza a conversão de milhas para quilômetros. Sabe-se que uma milha tem 1,609km. Como resolver este problema?
 */

import javax.swing.JOptionPane;

public class ex009_converteMilhasKm {
    public static void main(String[] args) {
       
        double valorMilhas = Double.parseDouble(JOptionPane.showInputDialog("Digite a quiantidade de milhas para serem convertidas em Km: "));

        double valorKm = valorMilhas * 1.609;

        JOptionPane.showMessageDialog(null,valorMilhas + " milhas convertidas para quilômetros resulta em: " + valorKm + " km.");
    }
}
