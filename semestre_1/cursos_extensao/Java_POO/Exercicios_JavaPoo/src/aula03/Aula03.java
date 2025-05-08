package aula03;
public class Aula03 {
    public static void main(String[] args) {
        //Instanciando objeto - Classe nome do objeto = new nome da classe
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor ="Azul";
        //A linha de baixo não é permitia pois ele está tentando acessar um atributo que é privado, ou seja, não pode ser acessado;
        //c1.ponta = 0.5f;
        //Na linha de baixo só é possível mexer em um atributo protegido pois está dentro da classe mãe;
        c1.carga = 80;
        //Experimente alternar entre "true" e "false" na linha de baixo para ver os diferentes resultadois no console;
        c1.tampada = false;
        c1.status();
        c1.rabiscar(); 
    }
}
