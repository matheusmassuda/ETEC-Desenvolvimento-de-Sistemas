//Declarar um vetor do tipo inteiro com 4 posições e realizar a soma de todos os valores divisíveis por 2;

import javax.swing.JOptionPane;

public class ex018_ArraysRepeticaoCondicao {
    public static void main(String[] args) {
        
        int numeros[] = new int[4];
        int soma = 0;

        for(int i=0; i<numeros.length;i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posição "+i));
        }

        for (int i =0;i<4; i++) {
            if (numeros[i]%2==0) {
                soma += numeros[i];
            }
        }

        JOptionPane.showMessageDialog(null,"A soma dos números divisíveis por dois é igual a: "+soma+".");

    }
}
