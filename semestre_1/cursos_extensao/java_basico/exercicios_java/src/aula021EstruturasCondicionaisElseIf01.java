/*
Estruturas condicionais else if (senão): seria o oposto do que deve acontecer caso o primeiro (se) não tenha sido satisfeito.

Sintaxe em java:
    if (primeiraCondicionalBooleana) {
        Execute este bloco;
    } else {
        Execute este;
    }

*IMPORTANTE:
NA SINTAXE DO IF ELSE, SE A PRIMEIRA CONDIÇÃO FOR SATISFEITA, SEQUER O PROGRAMA IRÁ PASSAR PELO ELSE, OU SEJA, O ELSE SERÁ IGNORADO.

O ELSE SÓ SERÁ AVALIADO CASO A PRIMEIRA CONDIÇÃO NÃO TENHA SIDO SATISFEITA

TODO ELSE PRECISA DE UM IF PARA EXISTIR;

 */

public class aula021EstruturasCondicionaisElseIf01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade>=18;

        //condição simples (Não aninhada)
        if (isAutorizadoComprarBebida) {
            System.out.println("Está autorizado.");
        } else {
            System.out.println("Não está autorizado.");
        }
        
    }
}
