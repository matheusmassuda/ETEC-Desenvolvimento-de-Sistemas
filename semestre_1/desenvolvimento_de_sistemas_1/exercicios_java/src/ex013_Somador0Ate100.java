import javax.swing.JOptionPane;

public class ex013_Somador0Ate100 {
    public static void main(String[] args) {
        int somaTotal = 0;
        
        for (int i=0; i<=100; i++) {
            somaTotal += i; //Simplificação da versão somaTotal = somaTotal + i;
        }

        JOptionPane.showMessageDialog(null, "A soma de todos os númeors no intervalo de 0 até 100 é: "+somaTotal+".");
    }
}
