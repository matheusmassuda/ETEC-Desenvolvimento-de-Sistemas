/*
Operadores de atribuição: 
= == Atribui um valor à uma determinada veriável;

+=

-=

*=

/=

%=

Incrementadores unários: 

 */

public class aula019OperadoresAtribuicao {
    public static void main(String[] args) {
        double bonus = 1800;
        //sistema que adiciona 1000 no valor do bonus (permitindo modificações futuras)
        //bonus = bonus + 1000;
        bonus += 1000; //maneira simplificada e com boa prática de se escrever código;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 3;
        bonus %= 2;
        System.out.println(bonus);

        int contador = 0;
        contador += 1; //1
        contador++; //2
        contador--; //1
        System.out.println(contador);
    }
}
