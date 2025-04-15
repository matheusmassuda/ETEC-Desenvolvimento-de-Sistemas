/*
Casting: Forçar o Java colocar o valor de uma variável dentro da outra. Não é uma boa prática, é mais correto trocar o tipo da variável;

 Forçando variáveis para que o Java entenda a variável como ela definitivamente é:

 A convenção é colocar a letra maiúscula na frente do número

 */

public class aula012TiposPrimitivos3 {
    public static void main(String[] args) {
      double salarioDouble = 2800.00D;
      float salarioFloat = 2500.00F;  
      long numeroGrande = 1000000L;

      int idade = (int) 100000000000L;
        System.out.println(idade); //retorna um número estranho pois como forcei um long dentro de um inte, ele irá começar a cortar bites para conseguir forçar esse numero grande dentro da memória do int;
    }
}
