/*
Elabore um programa em JAVA que calcule a área de figuras geométricas de acordo com a opção do usuário. Exibir na tela as seguintes opções:

FIGURAS GEOMÉTRICAS
1.   Área do triângulo 
2.   Área do quadrado
3.   Área do retângulo
4.   Sair

 Ao selecionar uma opção, o programa deverá solicitar os valores necessários para calcular a área de CADA figura geométrica. Exemplo: para calcular a área do triângulo, é necessário solicitar a digitação dos valores de BASE e ALTURA.
Pesquisar os cálculos de cada figura geométrica, solicitar os dados necessários e realizar os cálculos no seu código.
Exibir na tela o resultado processado.
Na opção SAIR, apenas exibir uma mensagem de saída do programa e finalizar a execução.
 */

import javax.swing.JOptionPane;

public class MatheusMassuda_Ag7_Forum_DS_1 {
    public static void main(String[] args) throws Exception {
        double areaTriangulo, areaQuadrado, areaRetangulo;
        double baseTriangulo, alturaTriangulo, ladoQuadrado, baseRetangulo, alturaRetangulo;

        int areaFigura = Integer.parseInt(JOptionPane.showInputDialog("Qual área devo calcular? "
        + "\n 1 - Área de um triângulo"
        + "\n 2 - Área de um quadrado"
        + "\n 3 - Área de um retângulo"));

        switch(areaFigura) {
            case 1:
                baseTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do traiângulo:"));
                alturaTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do traiângulo:"));
                areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                JOptionPane.showMessageDialog(null, "A área do triângulo é: " + areaTriangulo +".");
            break;
            case 2:
                ladoQuadrado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do quadrado: "));
                areaQuadrado = (ladoQuadrado * ladoQuadrado);
                JOptionPane.showMessageDialog(null, "A área do quadrado é: " + areaQuadrado +".");
            break;    
            case 3:
                baseRetangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do retângulo: "));
                alturaRetangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do retângulo: "));
                areaRetangulo = (baseRetangulo * alturaRetangulo);
                JOptionPane.showMessageDialog(null, "A área do retângulo é: " + areaRetangulo +".");
            break;
            default:
                JOptionPane.showMessageDialog(null, "[ERRO] Digite um valor entre [1 e 3]");
            break;
        }
        JOptionPane.showMessageDialog(null,"Fim do programa.");
    }
}
