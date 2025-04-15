/*

 */

public class aula011TiposPrimitivos2 {
    public static void main(String[] args) {
       long numeroGrande = 100000; // até (8 bytes)
        double salarioDouble = 2800; //decimais (até 8 bytes)
       float salarioFloat = 2500; //decimais (até 4 bytes)
       byte idadeByte = 127; //aguenta de -128 até 127 (7 bites)
       short idadeShort = 10; // (4 bytes)
       boolean verdadeiro = true; // (1 bite)
       boolean falso = false; // (1 bite)
       char caractere = '\uu0041'; //(2 bytes) traduz um número para tabela asc, caso seja colocado um número. Ex: 87 imprimirá "w"

       System.out.println(caractere);

    }
}
