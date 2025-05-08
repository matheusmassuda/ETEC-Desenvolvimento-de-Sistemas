package aula02;
public class Aula02 {
    public static void main(String[] args) {
        //Instanciando objeto - Classe nome do objeto = new nome da classe
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();

        c1.status();
        c1.rabiscar();
        
        //Instanciando um outro objeto
        Caneta c2 = new Caneta();
        c2.modelo = "Momblank";
        c2.cor = "preta";
        c2.destampar();
        c1.status();
        c2.rabiscar();
    }
}
