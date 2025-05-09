package aula04;

//Criação de classe para instanciar objetos
public class aula04 {
    public static void main(String[] args) {
        //Instanciamento/criação do objeto caneta e passagem de valores e parâmetros;
        Caneta c1 = new Caneta("Bic", "Verde", 0.7f);
        c1.statusLinhaConstructor();
        Caneta c2 = new Caneta("Bic", "Preta", 0.3f);
        c2.statusLinhaConstructor();
        
        //Definição do valor "BIC" para o atributo modelo (via adição POR MÉTODO SET ACESSOR);
        //c1.setModelo("BIC");
        c1.modelo = "BIC Cristal";

        //Definição do valor 0.5 para o atributo ponta via método acessor (set.ponta())
        c1.setPonta(0.7f);
        //Essa ação para passar valor em ponta pois ponta é um atributo privado, ou seja, ele exige que se use o método set.ponta(), caso contrário ele proíbe o acesso direto;
        //c1.ponta = 0.5f;
        
}
}
