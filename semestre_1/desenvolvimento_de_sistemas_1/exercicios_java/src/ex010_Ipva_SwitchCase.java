/*
 Elabore um programa em linguagem Java que receba o número final da placa do veículo, e exiba uma mensagem informando o período que o cliente tem para pagamento do IPVA. Caso a placa informada esteja fora da faixa entre 0 e 09, o programa deverá exibir uma mensagem informando o valor digitado está incorreto.
 Placa Final 1
    Pagamento até 30/04

    Placa Final 2
    Pagamento até 31/05

    Placa Final 3
    Pagamento até 30/06

    Placa Final 4
    Pagamento até 31/07

    Placa Final 5
    Pagamento até 31/08

    Placa Final 6
    Pagamento até 30/09

    Placa Final 7
    Pagamento até 31/10

    Placa Final 8
    Pagamento até 30/11

    Placa Final 9 ou 0
    Pagamento até 31/12
 */

import javax.swing.JOptionPane;

public class ex010_Ipva_SwitchCase {
    public static void main(String[] args) {
        String dataPagamento = "";

        int finalPlaca = Integer.parseInt(JOptionPane.showInputDialog("Bem-vindo ao escritório Despachante [Vale Card]." + "\n Digite o número final da placa de seu veículo: "));

        switch(finalPlaca) {
            case 0:
                dataPagamento = "31/12";
            break;
            case 1:
                dataPagamento = "30/04";
            break;
            case 2:
                dataPagamento = "31/05";
            break;
            case 3:
                dataPagamento = "30/06";
            break;
            case 4:
                dataPagamento = "31/07";
            break;
            case 5:
                dataPagamento = "31/08";
            break;
            case 6:
                dataPagamento = "30/09";
            break;
            case 7:
                dataPagamento = "31/10";
            break;
            case 8:
                dataPagamento = "30/11";
            break;
            case 9:
                dataPagamento = "31/12";
            break;
            default:
                dataPagamento = "[VALOR INVÁLIDO] Digite um número entre [0 e 9]";
            break;
        }

        JOptionPane.showMessageDialog(null, "Você pode pagar seu IPVA até dia: " + dataPagamento + ".");
    }
}
