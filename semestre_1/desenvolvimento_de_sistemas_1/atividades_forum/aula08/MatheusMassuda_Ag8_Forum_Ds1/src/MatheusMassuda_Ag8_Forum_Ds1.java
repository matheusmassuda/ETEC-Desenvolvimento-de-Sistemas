/**
 🎖️DESAFIO =>>> elabore a codificação em JAVA de um programa que peça ao usuário a digitação do NOME e IDADE de 10 pessoas. Verificar se cada idade digitada é maior que 18 anos e exibir na tela MAIOR DE IDADE, senão MENOR DE IDADE. No final do programa, exibir na tela quantas pessoas possuem 18 anos.
 */

import javax.swing.JOptionPane;
public class MatheusMassuda_Ag8_Forum_Ds1 {
    public static void main(String[] args) throws Exception {
        int i, idade, maiorIdade=0, menorIdade=0, idade18 = 0;
        String nome;
        
        for(i=1;i<=10;i++) {
            nome = JOptionPane.showInputDialog("Digite seu Nome: ");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

            if (idade > 18) {
                JOptionPane.showMessageDialog(null,"MAIOR DE IDADE.");
                maiorIdade += 1;
            } else if (idade < 18) {
                JOptionPane.showMessageDialog(null,"MENOR DE IDADE.");
                menorIdade += 1;
            } else if (idade == 18) {
                idade18 += 1;
            }
        }
        
        JOptionPane.showMessageDialog(null,"O número de pessoas com 18 anos é: "+idade18+".");
    }
}
