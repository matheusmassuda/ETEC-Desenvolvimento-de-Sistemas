/*
Operadores lógicos: OU (or) == ||
Tabela verdade: todas são vardadeiras, ao menos que as duas preposições forem falsas.

 */

public class aula018OperadoresLogicosOr {
    public static void main(String[] args) {
        double valorContaCorrente = 200;
        double valorContaPoupanca = 10000;
        float valorPlay5 = 5000F;
        // quero comprar  play 5 e se tiver o suficiente em apenas uma conta já posso comprar (valor do ps5 == )

        boolean isPlay5Compravel = valorContaCorrente >= valorPlay5 || valorContaPoupanca >= valorPlay5;
        // f || v == v;

        System.out.println("IsPlay5Compravel "+isPlay5Compravel);
    }
}
