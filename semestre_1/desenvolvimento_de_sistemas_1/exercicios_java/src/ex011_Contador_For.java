/**

import javax.swing.JOptionPane;
public class ex011_Contador_For {
    public static void main(String[] args) {
        int i;
        
        //Sintaxe for: 3 etapas (1° definir variável / 2° limite da variável / 3° - como irá se comportar)
        for (i = 0; i < 10; i ++) {
            JOptionPane.showMessageDialog(null, i);
        }
        
        JOptionPane.showMessageDialog(null, "O último laço registrado pelo isstema foi: "+i+".");
    }
}
*/

import javax.swing.JOptionPane;
public class ex011_Contador_For {
    public static void main(String[] args) {
        int i;
        JOptionPane.showMessageDialog(null, "Os números de 0 até 10, contados, de 2 em 2, são: ");
        //Sintaxe for: 3 etapas (1° definir variável / 2° limite da variável / 3° - como irá se comportar)
        for (i = 0; i <= 10; i = i + 2) {
            JOptionPane.showMessageDialog(null, i);
        }
        
        JOptionPane.showMessageDialog(null, "O último laço registrado pelo isstema foi: "+i+".");
    }
}
