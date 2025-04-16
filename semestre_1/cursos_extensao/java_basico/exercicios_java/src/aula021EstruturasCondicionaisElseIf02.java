/*
Se
Senão se
Senão (cabe destacar uma particularidade lógica): de todos os números inteiros categorizamos no código os números que são menores do que 15, ou seja, 15 até - infinito. A segunda categoria seriam os números compreendidos entre 15 (incluindo o quinze) até nos números menores do que 18. E por último a terceira categoria, dos númerosd que são iguais ou maiores do que 18 (essa última categoria já está coompreendida logicamente) pois seria o único intervalo faltante == >= 18 até + infinito.

Cabe lembrar que o programa é lido de cima para baixo ao analizar as condições, e a partir do momento em que uma condição for satisfeita, os blocos abaixo (else if e else) serão ignorados.

*IMPORTANTE - REGRA DO JAVA
TODA VARIÁVEL AQUI DENTRO DO MÉTODO É DE ESCOPO LOCAL (E OBRIGATORIAMENTE TEM QUE SER INICIALIZADAS ANTES DE SEREM EXECUTADAS, CASO CONTRÁRIO OCORRERÁ UM ERRO DE COMPILAÇÃO.

No caso abaixo no escopo local o objeto String não foi inicializado, mas a estrutura if, else if e else cobriu todas as possibilidades dela ser inicializada quando rodar a estrutura condicional, por isso não há  erro de compilação.
*/

public class aula021EstruturasCondicionaisElseIf02 {
    public static void main(String[] args) {
        //TODA VARIÁVEL AQUI DENTRO DO MÉTODO É DE ESCOPO LOCAL (E OBRIGATORIAMENTE TEM QUE SER INICIALIZADAS ANTES DE SEREM EXECUTADAS)

        //idade < 15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil 
        //idade >= 18 categoria Adulto
        int idade = 15;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria infantil.";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria juvenil.";
        } else {
            categoria = "Categoria adulto.";
        }

        System.out.println("Vocêpertence à: "+categoria);
    }
}
