/*
Operadores aritméticos: permitem realizar operações aritméticas (matemática).
Soma == +
O operador + pode servir tanto para soma quanto para concatenação (se existir estring ele irá concatenar, se forem apenas números ele irá somar). Da String para frente o java sempre irá concatenar;

Subtração == -

Multiplicação == *

divisão == /

resto da divisão  == %

É possível realizar a aoperação dentro de um sout ou até mesmo, reservar uma variável para armazenar o resultado de determinada operação que será usada muitas vezes.

 */

public class aula015OperadoresAritmeticos {
    public static void main(String[] args) {
       int numero01 = 10;
       int numero02 = 20;
       int soma = (numero01 + numero02);
        int multiplicacao = numero01 * numero02;
        double divisao = numero02/ numero01;
    
       System.out.println(numero02 - numero01);
       System.out.println(numero01 + numero02);
        System.out.println("Teste de concatenação "+numero01+numero02);
        System.out.println(soma);
        System.out.println(multiplicacao);
        System.out.println(divisao);
    }
}
