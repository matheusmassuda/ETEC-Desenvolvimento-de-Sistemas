//Impotei pacote de interface gráfica do Java (JOptionPane);
import javax.swing.JOptionPane;

//Inicialização da classe (programa);
public class MatheusMassuda_Ag7_DS_1 {
//Ponto de entrada do programa (main) - executa o que está dentro dele
    public static void main(String[] args) {
//Declaração de variável tipo (String) e atribuição de valor "vazio";
        String dataPagamento = "";
//Declaração de variável tipo (inteiro). E conversão da captura JOptionPane do tipo(string) para uma variável do tipo (inteiro);
        int finalPlaca = Integer.parseInt(JOptionPane.showInputDialog("Bem-vindo ao escritório Despachante [Vale Card]." + "\n Digite o número final da placa de seu veículo: "));
//Iniciação da estrutura de decisão Switch (escolha) -> Case (caso) e escolha do parâmetro a ser checado;
        switch(finalPlaca) {
//Caso finalPlaca tiver valor == 0, atribuir valor "31/12" para variável dataPagamento
            case 0:
//Atribuição de valor para variável, caso finalPlaca == 0;
            dataPagamento = "31/12";
//Se essa escolha for satisfeita, "break" (parar / quebrar) estrutura Switch case e ir para póximo passo;
            break;
//Análise de finalPlaca == 1;
            case 1:
//Atribuição de valor para variável, caso finalPlaca == 1;
                dataPagamento = "30/04";
//Encerramento caso finalPlaca == 1;
            break;
//Análise de finalPlaca == 2;           
            case 2:
//Atribuição de valor para variável, caso finalPlaca == 2;
                dataPagamento = "31/05";
//Encerramento caso finalPlaca == 2;
            break;
//Análise de finalPlaca == 3;            
            case 3:
//Atribuição de valor para variável, caso finalPlaca == 3;
                dataPagamento = "30/06";
//Encerramento caso finalPlaca == 3;
            break;
//Análise de finalPlaca == 4;
            case 4:
//Atribuição de valor para variável, caso finalPlaca == 4;
                dataPagamento = "31/07";
//Encerramento caso finalPlaca == 4;
            break;
//Análise de finalPlaca == 5;
            case 5:
//Atribuição de valor para variável, caso finalPlaca == 5;
                dataPagamento = "31/08";
//Encerramento caso finalPlaca == 5;
            break;
//Análise de finalPlaca == 6;
            case 6:
//Atribuição de valor para variável, caso finalPlaca == 6;
                dataPagamento = "30/09";
//Encerramento caso finalPlaca == 6;
            break;
//Análise de finalPlaca == 7;
            case 7:
//Atribuição de valor para variável, caso finalPlaca == 7;
                dataPagamento = "31/10";
//Encerramento caso finalPlaca == 7;
            break;
//Análise de finalPlaca == 8;
            case 8:
//Atribuição de valor para variável, caso finalPlaca == 8;
                dataPagamento = "30/11";
//Encerramento caso finalPlaca == 8;
            break;
//Análise de finalPlaca == 9;
            case 9:
//Atribuição de valor para variável, caso finalPlaca == 9;
                dataPagamento = "31/12";
//Encerramento caso finalPlaca == 9;
            break;
//Atribuição de resposta para caso o valor de finalPlaca não satisfazer nenhum dos casos acima;
            default:
//Atribuição de valor para variável, caso finalPlaca diferente de qualquer valor dos casos acima;
                dataPagamento = "Digite um valor entre [0 e 9]";
//Impressão de mensagem via interface gráfica (JOptionPane);
                JOptionPane.showMessageDialog(null, "[ERRO]: O valor digitado está incorreto.");
//Encerramento caso finalPlaca for diferente de qualquer dos casos;
            break;
        }
//Impressão de mensagem via interface gráfica do prazo de pagamento do IPVA
        JOptionPane.showMessageDialog(null, "Você pode pagar seu IPVA até dia: " + dataPagamento + ".");
    }
}
