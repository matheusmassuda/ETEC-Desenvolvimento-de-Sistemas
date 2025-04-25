import javax.swing.JOptionPane;

public class ex017_ArraysComEstruturaRepeticao {
    public static void main(String[] args) {
        int numeros [] = new int[4];

        //Um laço de repetição para coletar valores;
        for(int i=0; i<numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posição "+i));
        }

        //Um laço de repetição para imrpmir valores;
        for (int i=0;i<numeros.length;i++) {
            JOptionPane.showMessageDialog(null, "A posição "+i+" tem o valor: "+numeros[i]+".");
        }
    }
}

//nomeDoVetor.length é usado para quando não sabemos o valor exato do vetor e queremos armazenar nel inteiro (ele opera com a CAPACIDADE MÁXIMA do vetor);