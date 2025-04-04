/*
 Crie um programa onde o usuário digita um código e o programa retorna o produto cadastrado para aquele código, além disso coloque uma opção para tratar erro caso não existe nanhum nome de produto cadastrado para o código inserido
 */

import javax.swing.JOptionPane;

public class ex006_CadastroProduto_SwitchCase {
    public static void main(String[] args) {
        int codigoProduto;

        String nomeProduto = "";

        codigoProduto = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código do produto, [100], [150], [200], [250], [300]"));
        
        switch (codigoProduto) {
            case 100: 
                nomeProduto = "lápis preto";
            break;
            case 150:
                nomeProduto = "lapiseira 0.5";
            break;
            case 200:
                nomeProduto = "lapiseira 0.7";
            break;
            case 250:
                nomeProduto = "caneta azul";
            break;
            case 300:
                nomeProduto = "caneta vermelha";
            break;
            default:
                nomeProduto = "inválido";
            break;
        }

        JOptionPane.showMessageDialog(null, "O produto encontrado é: " + nomeProduto);
    }
}
