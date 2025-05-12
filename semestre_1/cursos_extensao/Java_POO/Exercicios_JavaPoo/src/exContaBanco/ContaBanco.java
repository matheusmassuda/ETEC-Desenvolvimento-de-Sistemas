package exContaBanco;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private float saldoConta;
    private boolean statusConta;

    //Métodos Especiais (Constructor);
    public ContaBanco() {
        saldoConta = 0;
        status = false;
    }

    public setNumConta(n: float) {
        numConta = n;
    }

    public getNumConta() {
        return numConta;
    }

    public setTipoConta(t: String) {
        tipoConta = t;
    }

    public getTipoConta() {
        return tipoConta;
    }

    public setDonoConta(d: String) {
        donoConta = d;
    }

    public getDonoConta() {
        return donoConta;
    }

    public setSaldoConta(s: float) {
        saldoConta = s;
    }

    public getSaldoConta() {
        return saldoConta;
    }

    public setStatusConta(st: boolean) {
        statusConta = st;
    }

    public getStatusConta() {
        return statusConta;
    }


}
