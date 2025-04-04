import javax.swing.JOptionPane;

public class ex005_DiaSemana_SwitchCase {
    public static void main(String[] args) {
        int valorDiaSemana;
        String nomeDiaSemana = "";

        valorDiaSemana = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do dia da semana de 1 até 7"));

        switch (valorDiaSemana) {
            case 1:
            nomeDiaSemana = "domingo";
            break;
            case 2:
            nomeDiaSemana = "segunda-feira";
            break;
            case 3:
            nomeDiaSemana = "terça-feira";
            break;
            case 4:
            nomeDiaSemana = "quarta-feira";
            break;
            case 5:
            nomeDiaSemana = "quinta-feira";
            break;
            case 6:
            nomeDiaSemana = "sexta-feira";
            break;
            case 7:
            nomeDiaSemana = "sábado";
            break;
            default:
            nomeDiaSemana = "[ERRO] - INVÁLIDO. Digite um número entre 1 e 7.";
            break;
        }

        JOptionPane.showMessageDialog(null, "O dia escolhido é: "+nomeDiaSemana);
    }
}
