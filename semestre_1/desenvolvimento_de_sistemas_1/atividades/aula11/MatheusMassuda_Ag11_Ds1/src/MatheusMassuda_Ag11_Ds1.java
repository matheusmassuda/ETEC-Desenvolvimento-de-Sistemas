//Importação do pacote de interface gráfica JOptionPane;
import javax.swing.JOptionPane;

//Criação de classe pública (POO em Java) com o mesmo nome do arquivo.java;
public class MatheusMassuda_Ag11_Ds1 {
    //Declaração do método da classe pública;
    public static void main(String[] args) {
        //Declaração da matriz do tipo inteiro (requerido pelo enunciado) e determinação da quantidade de dimensões da matriz: 3 linhas x 3 colunas;
        int matriz[][] = new int[3][3];
        //Declaração de variáveis para controle da estrutura de repetição (linha e coluna) e da variável para armazenar a soma dos elementos da matriz;
        int linha, coluna, somaMatriz = 0;

        //Exibição de mensagem gráfica (breve explicação) ao usuário via pacote JOptionPane;
        JOptionPane.showMessageDialog(null, "Forma da Matriz: [3 x 3] [Linha x Coluna]."+"\nDigite os valores da matriz a seguir:" );

        //Criação de estruturas de repetição do tipo "for" aninhadas, a primeira percorre a linha até um máximo de 3, e a estrutura de dentro percorre as colunas dentro respectivas as linhas da estrutura de fora. Quando a estrutura interna acaba ele volta para o inicio da de fora.
        for(linha=0;linha<3;linha++) {
            for(coluna=0;coluna<3;coluna++) {
                //Armazenamento / coleta de valores a serem colocados na matriz;
                matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(coluna+1)+"° valor da "+(linha+1)+"° linha."));
                //Armazenamento e operação de soma (automatizada) dentro da variável somaMatriz;
                somaMatriz += matriz[linha][coluna];

            }
        }

        //Exibição de mensagem e do resultado da soma de todos os elementos da matriz por meio do pacote de interface gráfica JOptionPane;
        JOptionPane.showMessageDialog(null, "A soma de todos os elementos da matriz [3 x 3] é: "+"\n "+somaMatriz+".");
    }
}


