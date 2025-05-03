import javax.swing.JOptionPane;

public class ex021_Matriz {
    public static void main(String[] args) {
        int matriz[][] = new int[2][4];
        int linha, coluna;

        for(linha=0;linha<2;linha++) {
            for(coluna=0;coluna<4;coluna++) {
               matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número na "+(linha+1)+"° linha, e na coluna "+(coluna+1)+"."));
            }
        }

        JOptionPane.showMessageDialog(null, "Os valores digitados são: ");
        for(linha=0;linha<2;linha++) {
            for(coluna=0;coluna<4;coluna++) {
                JOptionPane.showMessageDialog(null, "O Número na linha "+(linha+1)+"\n na coluna "+(coluna+1)+"\nÉ o Número "+ matriz[linha][coluna]);
            }
        }

     
    }
}
