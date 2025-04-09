import java.util.Scanner;
public class ex015_Tabuada6a10 {
    public static void main(String[] args) {
        int escolhaTabuada, i;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a tabuada de qual número deseja calcular: de [6 até 10]");
        escolhaTabuada = leitor.nextInt();
        
        switch (escolhaTabuada) {
            case 6:
            System.out.println("A tabuada do número "+escolhaTabuada+ " é:");
            
            for (i=1; i<=10;i++) {
                System.out.println("\n"+escolhaTabuada+" x "+i+" = "+escolhaTabuada*i);  
            }
            break;
            case 7:
            System.out.println("A tabuada do número "+escolhaTabuada+ " é:");
            
            for (i=1; i<=10;i++) {
                System.out.println("\n"+escolhaTabuada+" x "+i+" = "+escolhaTabuada*i);  
            }
            break;
            case 8:
            System.out.println("A tabuada do número "+escolhaTabuada+ " é:");
            
            for (i=1; i<=10;i++) {
                System.out.println("\n"+escolhaTabuada+" x "+i+" = "+escolhaTabuada*i);  
            }
            break;
            case 9:
            System.out.println("A tabuada do número "+escolhaTabuada+ " é:");
            
            for (i=1; i<=10;i++) {
                System.out.println("\n"+escolhaTabuada+" x "+i+" = "+escolhaTabuada*i);  
            }
            break;
            case 10:
            System.out.println("A tabuada do número "+escolhaTabuada+ " é:");
            
            for (i=1; i<=10;i++) {
                System.out.println("\n"+escolhaTabuada+" x "+i+" = "+escolhaTabuada*i);  
            }
            break;
            default:
            System.out.println("Valor inválido. Digite um número entre [6 e 10]");
            break;
        }

        /**
        if (escolhaTabuada == 6) {
            System.out.println("A tabuada do número "+escolhaTabuada+ " é:");
            
            for (i=1; i<=10;i++) {
                System.out.println("\n"+escolhaTabuada+" x "+i+" = "+escolhaTabuada*i);  
            }
        } else if (escolhaTabuada == 7) {
            System.out.println("A tabuada do número "+escolhaTabuada+ " é:");
            
            for (i=1; i<=10;i++) {
                System.out.println("\n"+escolhaTabuada+" x "+i+" = "+escolhaTabuada*i);  
            }
        } else if (escolhaTabuada == 8) {
            System.out.println("A tabuada do número "+escolhaTabuada+ " é:");
            
            for (i=1; i<=10;i++) {
                System.out.println("\n"+escolhaTabuada+" x "+i+" = "+escolhaTabuada*i);  
            }
        } else if (escolhaTabuada == 9) {
            System.out.println("A tabuada do número "+escolhaTabuada+ " é:");
            
            for (i=1; i<=10;i++) {
                System.out.println("\n"+escolhaTabuada+" x "+i+" = "+escolhaTabuada*i);  
            }
        } else if (escolhaTabuada == 10) {
            System.out.println("A tabuada do número "+escolhaTabuada+ " é:");
            
            for (i=1; i<=10;i++) {
                System.out.println("\n"+escolhaTabuada+" x "+i+" = "+escolhaTabuada*i);  
            }
        }
        */
    } 
}