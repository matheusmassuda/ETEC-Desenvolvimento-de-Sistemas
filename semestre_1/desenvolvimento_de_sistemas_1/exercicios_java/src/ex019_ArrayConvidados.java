import javax.swing.JOptionPane;

public class ex019_ArrayConvidados {
    public static void main(String[] args) {
        String [] convidados = new String[10];

        String listaLadoDireito = "";
        String listaLadoEsquerdo = "";
        int i;

        for (i=0;i<10;i++) {
            convidados[i] = (JOptionPane.showInputDialog(null, "Escreva o nome do(a) "+(i+1)+"° convidado:"));
        }

        for(i=0;i<10;i++) {
            if (i%2==0) {
                listaLadoEsquerdo += convidados[i]+"\n";
            } else {
                listaLadoDireito += convidados[i]+"\n";
            }
        }
        
        JOptionPane.showMessageDialog(null,"Lista dos convidados do lado esquerdo: \n"+ listaLadoEsquerdo+"\n"+"Lista dos convidados do lado direito: \n"+listaLadoDireito);
    
    }
}
