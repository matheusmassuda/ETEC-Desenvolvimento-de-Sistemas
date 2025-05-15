package aula05;
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private float saldoConta;
    private boolean statusConta;

    //Métodos Personalizados
    public void estadoAutla() {
        System.out.println("----------------------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Dono: "+this.getDonoConta());
        System.out.println("Tipo de conta: "+this.getTipoConta());
        System.out.println("Saldo: "+this.getSaldoConta());
        System.out.println("Status: "+this.getStatusConta());
    }

    public void abrirConta(String t) {
        this.setTipoConta(t);
        //atribui a conta o valor lógico "verdadeiro" (ela passou a existir);
        this.setStatusConta(true);
        if (t == "CC") {
            this.setSaldoConta(50);
        } else if (t == "CP") {
            this.setSaldoConta(150);;
        }
    }
    public void fecharConta() {
        if (this.getSaldoConta() > 0) {
            System.out.println("Conta não pode ser fechada, ainda tem dinheiro");
        } else if (this.getSaldoConta() < 0) {
            System.out.println("Conta não pode ser fechada, está em débito");
        } else {
            this.setStatusConta(false);
            System.out.println("Conta fechada com  sucesso");
        }
    }
    public void depositarConta(float v) {
        if (this.getStatusConta()) {
            //this.saldo = this.saldo + v;
            this.setSaldoConta(this.getSaldoConta() + v);
            System.out.println("Depósito de: "+v+ " realizado na conta de: "+this.getDonoConta());
        } else {
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }
    public void sacar(float v) {
        if (this.getStatusConta()) {
            if (this.getSaldoConta() >= v) {
                this.setSaldoConta(this.getSaldoConta() - v);
                System.out.println("Saque de: "+v+  " realizado na conta de: "+this.getDonoConta());
            } else {
                System.out.println("Saldo insulficiente");
            }
        } else {
            System.out.println("Impossível sacar de uma conta inativa");
        }
    }
    public void pegarMensalidade() {
        int v = 0;
        if (this.getTipoConta() == "CC") {
            v = 12;
        } else if (this.getTipoConta() == "CP") {
            v = 20;
        }
        if (this.getStatusConta()) {
            this.setSaldoConta(this.getSaldoConta() - v);
            System.out.println("Mensalidade paga com sucesso");
        } else {
            System.out.println("Impossível apgar mensalidade de uma conta fechada");
        }
    }

    //Métodos Especiais
    //1° Contructor (construtor - mesmo nome da classe)
    public ContaBanco() {
        this.saldoConta = 0;
        this.statusConta = false;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    public String getDonoConta() {
        return donoConta;
    }
    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }
    public float getSaldoConta() {
        return saldoConta;
    }
    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }
    public boolean getStatusConta() {
        return statusConta;
    }
    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

}
