import javax.swing.JOptionPane;

public class aulaCriptografia {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Olá Mundo!", "Programa do Matheus", JOptionPane.INFORMATION_MESSAGE);
        int variavelInt = Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor inteiro"));
        double variavelDouble = Double.parseDouble(JOptionPane.showInputDialog("Entre com um valor double"));
        String variavelString = JOptionPane.showInputDialog("Entre com uma mensagem a criptografar");

        //SESSÃO PARA EXIBIR OS INPUTS
        JOptionPane.showMessageDialog(null, "Valor inteiro: "+variavelInt, "Programa do Matheus", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Valor double: "+variavelDouble, "Programa do Matheus", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Valor String: "+variavelString, "Programa do Matheus", JOptionPane.INFORMATION_MESSAGE);

        //Conversão para tabela ASC == pega cada um dos caracteres da mensagem e covnerta para um número da tabela ascii
        char[] caracteres = variavelString.toCharArray();

        for (char c: caracteres) {
            JOptionPane.showMessageDialog(null, c);
        }

        //Obter o valor ASCII do caractere original

        StringBuilder mensagemCriptografada = new StringBuilder();
        for (char c: caracteres) {
            int valorAsciiOriginal = (int) c;
            //EXIBIR VALOR ASCII Original
            JOptionPane.showMessageDialog(null, "Valor ASCII do caractere: "+ c + ": "+ valorAsciiOriginal);
            // https://www.asciitable.com/ (CONFERIR VALORES ASCII)

            //Adicionar + 2 para criptografar
            int valorAsciiCriptografado = valorAsciiOriginal + 2;

            //exibe o valor ascii criptografado
            JOptionPane.showMessageDialog(null, "Valor criptografado: "+valorAsciiCriptografado);

            //converter valor ascii de volta para caractere
            char caractereCriptografado = (char) valorAsciiCriptografado;

            // Adiciona o caractewre criptografado à mensagem criptografada
            mensagemCriptografada.append(caractereCriptografado);
        }

        //Exibir mensagem criptografada
        JOptionPane.showMessageDialog(null, "Mensagem criptografada ficou assim: "+mensagemCriptografada.toString());



    }


}
