package aula05;

public class Aula05 {
    public static void main(String[] args) {
        //Criação de conta para Matheus Massuda
        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumConta(14333465);
        pessoa1.setDonoConta("Matheus Massuda");
        pessoa1.abrirConta("CC");
        pessoa1.depositarConta(150);

        //Criação de conta para Giulia
        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.setNumConta(14333366);
        pessoa2.setDonoConta("Giulia Massuda");
        pessoa2.abrirConta("CP");
        pessoa2.depositarConta(200);

        pessoa1.depositarConta(50);
        pessoa2.sacar(100);
        pessoa1.sacar(250);
        pessoa1.fecharConta();
        
        pessoa1.estadoAutla();
        pessoa2.estadoAutla();
    }
}
