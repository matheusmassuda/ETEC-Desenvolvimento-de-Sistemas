import javax.swing.JOptionPane;
//Importação do pacote de interface gráfica do java(JOptionPane);
public class MatheusMassuda_Ag8_DS_1 {
//Inicialização da classe publica java com nome do arquivo;
    public static void main(String[] args) {
    //Inicialização do método;
    int i, idadeEntrevistado, opiniaoEscolhida, totalExcelente = 0, totalBom = 0, totalRuim = 0;
    //Declaração das variáveis do tipo inteiro;
    String nomeEntrevistado;
    //Declaração (apenas ilustrativa para esse exercícios) da variável do tipo String (cadeia de caracteres);

    for (i=1; i<=50; i++) {
    //Inicialização da estrutura de repetição do tipo for com variável de controle inicial com valor 1 (i=1), limite da variável de controle definida como 50 (i<=50) e incremento "soma" de apenas uma unidade (i++);
        nomeEntrevistado = JOptionPane.showInputDialog("[Bem-vindo a TudoWeb] - Digite seu nome: ");
        //Captura/Leitura para variável nomeEntrevistado via interface gráfica do JOptionPane (já captura no tipo String);
        idadeEntrevistado = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        //Captura/Leitura e conversão para variável idadeEntrevistado via interface gráfica do JOptionPane (captuira em String e é convertido em Inteiro) essa variável é ilustrativa para essa atividade;
        opiniaoEscolhida = Integer.parseInt(JOptionPane.showInputDialog("Digite o número referente à opinião do atendimento prestado: "
        + "\n 1 - EXCELENTE "
        + "\n 2 - BOM "
        + "\n 3 - RUIM "));
        //Exibição e captura de menu com opções de números para serem usadas no switch case a baixo;

        switch (opiniaoEscolhida) {
            case 1:
            //Teste para caso 1 (EXCELENTE) do switch case;
                totalExcelente += 1;
                //Atribuição de soma na variável (EXCELENTE para contagem;
            break;
            //Quebra da operação (necessária na sintaxe do switch case);
            case 2:
            //Teste para caso 2 (BOM) do switch case;
                totalBom += 1;
                //Atribuição de soma na variável (BOM) para contagem;
            break;
            //Quebra da operação (necessária na sintaxe do switch case);
            case 3:
            //Teste para caso 3 (RUIM) do switch case;
                totalRuim += 1;
                //Atribuição de soma na variável (RUIM) para contagem;
            break;
            //Quebra da operação (necessária na sintaxe do switch case);
            default:
            //Opção "extra" para tratamento de erros caso nenhuma das 3 opções (case 1, case 2, case 3) for satisfeita;
                JOptionPane.showMessageDialog(null, "Valor inválido! Digite um valor entre [1 e 3]");
                //Exibição ao usuário caso opção default tenha sido satisfeita;
            break;
            //Quebra da operação (necessária na sintaxe do switch case);
            
        }
    }

    JOptionPane.showMessageDialog(null,"O total de votos na opção [EXCELENTE] foi de: "+totalExcelente+"."
    +"\n O total de votos na opção [RUIM] foi de: "+totalRuim+".");
    //Exibição do resultado das operações da estrutura de repetição ao usuário via interface gráfica (JOptionPane);
    
    }
}