/*
Crie um programa que calcula 5 tipos de operações básicas (soma, subtração, multiplicação, divisão e resto da divisão), em que dois números reais devem ser inseridos e, depois, seja exibido um menu com as opções das 5 operações a serem realizadas. Imprima o resultado na tela do computador
 */

import javax.swing.JOptionPane;

public class ex007_Operacoes_SwitchCase {
    public static void main(String[] args) {
        double resultadoOperacao = 0;
        
        int valorOperacoes = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual operação deve ser realizada? " 
        + "\n 1 - Soma"
        + "\n 2 - Subtração"
        + "\n 3 - Multiplicação"
        + "\n 4 - Divisão"
        + "\n 5 - Resto da divisão"
        ));
        
        double primeiroValor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o primeiro valor: "));
        double segundoValor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o segundo valor: "));
        


        switch(valorOperacoes) {
            case 1:
            resultadoOperacao = primeiroValor + segundoValor;
            break;
            case 2:
            resultadoOperacao = primeiroValor - segundoValor;
            break;
            case 3:
            resultadoOperacao = primeiroValor * segundoValor;
            break;
            case 4:
            resultadoOperacao = primeiroValor / segundoValor;
            break;
            case 5:
            resultadoOperacao = primeiroValor % segundoValor;
            break;
        }

        JOptionPane.showMessageDialog(null, "O resultado da operação é: " + resultadoOperacao);
    }
}
