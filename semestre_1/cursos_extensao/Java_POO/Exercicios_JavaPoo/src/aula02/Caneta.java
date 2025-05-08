package aula02;
//Criando uma classe (caneta) com 5 atributos e 3 métodos;
public class Caneta {
//Declarando atributos da classe e tipos;
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Carga: "+this.carga);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Está tampada? " + this.tampada);
    }

    //Declarando método (void = vazio / sem retorno);
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO: Estou tampada, não posso rabiscar");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
