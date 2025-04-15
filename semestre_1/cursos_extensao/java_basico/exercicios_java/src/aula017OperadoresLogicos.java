/* 
Operadores lógicos: são os operadores que funcionam em forma da table verdade;

E (And) == Alto && Bonito só é verdadeiro se as duas forem verdadeiras;

OU (Or) == Alto || Bonito, só é falso se as duas proposições forem falsas;

Negação (logical not) == !



*/ 

public class aula017OperadoresLogicos {
    public static void main(String[] args) {
        int idade = 26;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612; // f && f == f

        boolean isDentroDaLeiMenorQueTrinta =  idade < 30 && salario >= 3381; // v && v == v

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
    }
}
