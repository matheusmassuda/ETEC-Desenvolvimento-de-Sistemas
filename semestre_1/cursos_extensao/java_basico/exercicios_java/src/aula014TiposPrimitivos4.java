/*
Crie variáveis para os campos descritos a baixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>;
 */
public class aula014TiposPrimitivos4 {
    public static void main(String[] args) {
        String nome = "Matheus";
        String endereco = "Rua das Flores";
        double salario = 10580.00;
        String dataRecebimentoSalario = "15/04/2025";

        System.out.println("Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de R$ "+salario+ ", na data "+dataRecebimentoSalario);

    }
}
