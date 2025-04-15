/*
Operadores relacionais: estabelecem relações entre valores

resto da divisão == % (revela se um número é par ou ímpar)

Operadores lógicos: sempre irão retornar um valor booleano (true and false);
São eles:

maior que == >

maior ou igual a == >=

menor que == <

menor ou igual == <=

igual == ==

diferente == !=

Um padrão comum em java para trabalhar com valores booleanos é usar "is"
isDezMaiorQueVinte
*/

public class aula016OperadoresRelacionais {
    public static void main(String[] args) {
    int numero01 = 21;   
    int numero02 = 20;
    
    int restoPar = numero02 % 2;
    int restoImpar = numero01 % 2;

    System.out.println(restoPar);
    System.out.println(restoImpar);

    boolean isDezMaiorQueVinte = 10 > 20;
    boolean isDezMenorQueVinte = 10 < 20;
    boolean isDezIgualVinte = 10 == 20;
    boolean isDezIgualDez = 10 == 10;
    boolean isDezDiferenteDez = 10 != 10;
    System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
    System.out.println("isDezMenorQueVitne "+ isDezMenorQueVinte);
    System.out.println("isDezIgualVinte "+isDezIgualVinte);
    System.out.println("isDezigualDez "+isDezIgualDez);
    System.out.println("isDezDiferenteDez "+isDezDiferenteDez);
    }
}
