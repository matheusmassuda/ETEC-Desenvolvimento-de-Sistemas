/*
Estruturas condicionais: 

Condicionail if (se):
sintaxe em java:

1°) if (resultado boolean) {     
2°)     Bloco de instruções
3°) }

O if só executará se o resultado entre parênteses for verdadeiro.

É covnencional trabalhar com o resultado entre paresenteses na forma "poasitiva", portanto se quisermos negar algo em seu valor positivo para termos uma resposta negativa, colocamos a exclamação na frente para negar a proposição.

*IMPORTANTE
* SE (FALSE) NUNCA SERÁEXECUTADO
* DENTRO DO PARÊNTESES SEMPRE ALGO QUE RETORNE VALOR BOOLEANO

 */

public class aula020EstruturasCondicionais {
    public static void main(String[] args) {
    int idade = 20;
    boolean isAutorizadoComprarBebida = idade >= 18;

    // pode ou não comprar bebida alcoólica
    // if responde caso entre parêntese seja (true)
    if (isAutorizadoComprarBebida) {
        System.out.println("Autorizado a comprar bebida alcoólica.");
    }
    //negação para responder caso não seja true entre parênteses (false);
    if (!isAutorizadoComprarBebida) {
        System.out.println("Não está autorizado a comprar bebida alcoólica.");
    }

    }
}
