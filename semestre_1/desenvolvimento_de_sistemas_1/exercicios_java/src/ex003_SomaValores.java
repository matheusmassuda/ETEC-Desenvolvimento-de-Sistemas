import java.util.Scanner;

public class ex003_SomaValores {
    public static void main(String[] args) {
        int primeiroValor;
        int segundoValor;
        int soma;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Programa que soma dois valores");
        System.out.println("Digite o primeiro valor: ");
        primeiroValor = leitor.nextInt();
        System.out.println("Digite o segundo valor: ");
        segundoValor = leitor.nextInt();

        soma = primeiroValor + segundoValor;

        System.out.print("A soma entre " + primeiroValor + " e " + segundoValor + " é igual a " + soma);
    }
}
    