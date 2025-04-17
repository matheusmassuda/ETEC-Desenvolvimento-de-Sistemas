import javax.swing.JOptionPane;
//Importei pacote JOptionPane de interface gráfica do Java;

public class MatheusMassuda_Ag9_DS_1 {
//inicialização da classe "arquivo.java"
    public static void main(String[] args) throws Exception {
//inicialização do método úblico;
        String continuar;
        //Declaração da variávei do tipo cadeia de caracteres;
        do {
            float comissao = 0;
            float bonusAdicional = 0;
            float totalComissao = 0;
            //Declaração + inicialização de variáveis do tipo float (reais) com tamanho de memória de 4 bytes (32 bites), suficiente para esse tipo de vartiável; 

        float totalVendas = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor total de vendas em reais: "));
        //Declaração da variável total de vendas (tipo real float) + captura via interface gráfica JOptionPane;
        
        int quantidadeDeVendas = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas vendas foram realizadas: "));
        //Declaração da variável quantidade de vendas (tipo inteiro) + captura de valor via interface gráfica JOptionPane;

        if (totalVendas < 1000) {
        //Estrutura condicional if e else if para decisão do cálculo de comissão (condição menor do que 1000);
            comissao = 0.05f * totalVendas;
            //cálculo da comissão (5% do valor total de Vendas). Foi necessário colocar a letra "f" para forçar o programa em java a ler real decimal para float;
        } else if (totalVendas >= 1000 && totalVendas <= 5000) {
        //Condição total de vendas entre 1000 e 5000;
            comissao = 0.07f * totalVendas;
            //Cálculo da comissão de 7% do valor total de vendas;
        } else {
        //condição final (lógicamente é o que resta das condições acima)
            comissao = 0.1f * totalVendas;
            //Cálculo da comissão de 10% do valor total de vendas;
        }

        if (quantidadeDeVendas > 10) {
        //Nova estrutura if condicional para quantidade de vendas
            bonusAdicional = 0.02f * totalVendas;
            //Cálculo de bonus adicional de 2% do valor do total de vendas quando a aquantidade de vendas for superior a 10;
        }

        totalComissao = comissao + bonusAdicional;
        //Cálculo da comissão total;

        JOptionPane.showMessageDialog(null, "A comissão ganha foi de: R$"+comissao+
        "\n O bônus adicional foi de: R$"+bonusAdicional+
        "\n O total da comissão como bônus adicional foi de: R$"+totalComissao+" .");
        //Exibição gráfica dos resultados;

        continuar = JOptionPane.showInputDialog("Deseja realizar nova operação? [s ou sim] para nova operação");
        //Atribuição de valor para variável continuar (do tipo String);

    } while (continuar.equalsIgnoreCase("s") || continuar.equalsIgnoreCase("sim"));
    //Estabeleci "s" ou "sim" como condição/resposta para o usuário continuar e realizar novos cálculos. IgnoreCase garante que as respostas "s" e "sim" serão aceitas independente dos caracteres serem escritos em minúsculo ou maiúsculo;
    }
}
