import javax.swing.JOptionPane;
public class ex012_Media30Alunos_For {
    public static void main(String[] args) {
        double nota1, nota2, media;

        for (int i=1; i<=30; i++) {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a PRIMEIRA nota do aluno "+i+":"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a SEGUNDA nota do aluno "+i+":"));
            media = (nota1 + nota2) / 2;
            if (media >=7.0) {
                JOptionPane.showMessageDialog(null, "O aluno "+i+" com média: "+media+ " está:  [APROVADO]");
            } else {
                JOptionPane.showMessageDialog(null, "O aluno "+i+" com média "+media+" está: [REPROVADO]");
            }
        }
    }
}
