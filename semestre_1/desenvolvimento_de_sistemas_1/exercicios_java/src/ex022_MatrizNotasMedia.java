import javax.swing.JOptionPane;

public class ex022_MatrizNotasMedia {
    public static void main(String[] args) {
        double matriz[][] = new double[2][4];
        double media = 0;
        int l,c;

        JOptionPane.showMessageDialog(null,"Insira as notas dos alunos: ");
        
        for (l=0;l<2;l++) {
            for(c=0;c<3;c++) {
                matriz[l][c] = Double.parseDouble(JOptionPane.showInputDialog("Insira a "+(c+1)+  "° nota do "+(l+1)+"° "+" aluno"));
            }
        }

        for(l=0;l<2;l++) {
            for(c=0;c<3;c++) {
                media += matriz[l][c];
            }
            matriz[l][3] = media /3;

            media = 0;
        }

        JOptionPane.showMessageDialog(null, "As notas e médias dos alunos são: ");

        for(l=0;l<2;l++) {
            for(c=0;c<3;c++) {
                JOptionPane.showMessageDialog(null, "O aluno "+(l+1)+"\n Tirou: "+matriz[l][c]+"\n na "+(c+1)+"° prova.");
            }

            JOptionPane.showMessageDialog(null, "A média do aluno "+(l+1)+" foi de: "+matriz[l][3]);
        }

    }
}
