/*
psvm - public static void main(String[] args) {
}

Tipos primitivos: guardam em memória um valor SIMPLES, são todas palavras reservadas e escritas em minúsculo:
int = inteiro
double = Reais
float = Reais até 8 casas
char == caractere
byte == 
short ==
long == 
boolean == valores lógicos (true and false)

------Sintaxe java (inglês é boa prática):
tipo primitivo nomeInteiroEscrito;

int idadeDoPai;
int idadeDoFilhoHoraCadastro;
double numeroEvolucaoBacterias;

-----Inicializaçlão de variável em Java:
int idadeMenino = 18; com essa sintaxe é atribuído valor 18 à variável idadeMenino

-----Valor de memória x Valor literal
System.out.println(nomeVariavel);
irá imprimir o valor em memória da variável
System.out.println("nomeVariavel");
irá imprimir o valor literal etre aspas " "

-----Concatenação em Java:
Usa-se o +

 */

public class aula010TiposPrimitivos {
    public static void main(String[] args) {
        int idadeMenino = 18;
        System.out.println("idadeMenino: ");
        System.out.println(idadeMenino);
        System.out.println("idadeMenino: "+idadeMenino+" anos");
    }
}
