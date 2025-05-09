package aula04;
//Definição da Classe (abstrata) caneta;
public class Caneta {
    //Definição de atributos para a classe caneta;
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    //Método construtor (mesmo nome da classe);
    public Caneta(String m, String c, float p) {
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
        
    }

    //Definição de método público para "pegar" modelo;
    public String getModelo() {
        //Ação do método pegar modelo
        return this.modelo;
    }

    //Definição de método público para Modificar modelo + parâmetro m que receberá algum novo valor para modelo (m);
    public void setModelo(String m) {
        //Ação do método (atribuição de valor de ponta);
        this.modelo = m;
    }

    //Definição de método público "pegar" para o atributo ponta;
    public float getPonta() {
        //Ação do método (retornar valor de ponta)
        return this.ponta;
    }

    //Definição de método público para modificar/definir valor para ponta + passagem de parâmetro (p) correspondente;
    public void setPonta( float p) {
        //Ação do método (atribuição de valor de ponta)
        this.ponta = p;
    }

    //
    public void status() {
        System.out.println("INFORMAÇÕES SOBRE A CANETA: ");
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Ponta: "+this.getPonta());
    }

    //Teste de criação de método em linha;
    public void statusLinha() {
        System.out.println("Tenho uma caneta "+getModelo()+" de ponta: "+getPonta());
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    //Teste criação método para constructor
    public void statusLinhaConstructor() {
        System.out.println("Tenho uma caneta "+getModelo()+" de ponta: "+getPonta()+" e cor "+this.cor+".");
        System.out.println("Ela está tampara: "+this.tampada);
    }

    
}
