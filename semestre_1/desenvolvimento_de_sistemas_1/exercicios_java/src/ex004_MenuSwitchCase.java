/*Matheus deseja fazer um menu de seleção de um programa utilizando o comando de seleção múltipla. O menu consiste nas opções:
1. Cadastras usuário
2. Alterar dados
3. Excluir Usuário
*/

import javax.swing.JOptionPane;

public class ex004_MenuSwitchCase {
    public static void main(String[] args) {
        int opcao;

        opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção desejada: "
        + "\n 1. Cadastrar"
        + "\n 2. Alterar dados"
        + "\n 3. Excluir usuário"));

        switch(opcao) {
            case 1: 
                JOptionPane.showMessageDialog(null, "Cadastro de usuários");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Alteração de dados");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Excluir usuário");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opção inválida.");
        }
    }
}