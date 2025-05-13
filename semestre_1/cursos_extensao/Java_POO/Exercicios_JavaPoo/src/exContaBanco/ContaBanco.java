package exContaBanco;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private float saldoConta;
    private boolean statusConta;


    //Métodos
    public abrirConta(t: String) {
        setTipoConta(t);
        setStatusConta(true);

        if (t = "CC") {
            saldoConta = 50;
        } else if (t = "CP") {
            saldoConta = 150;
        } 
    }

    public fecharConta() {
        if (saldoConta > 0) {
            System.out.println("Conta com dinheiro");
        } else if (saldoConta < 0) {
            System.out.println("Conta em débito");
        } else {
            setStatusConta(false);
        }
    }

    public depositar(v: float) {
        if (statusConta = true) {
            // linha de baixo é equivalente a: saldoConta += v;
            setSaldoConta(getSaldoConta() + v);
        } else {
            System.out.println("Conta está fechada");
        }
    }

    public sacar(v: float) {
        if (getStatusConta() = true) {
            if (saldoConta > v) {
                setSaldoConta(getSaldoConta() - v);
            }
        } else {
            System.out.println("Impossível sacar");
        }
    }

    public pagarMensal() {
        float v;
        if (tipoConta = "CC") {
            v = 12;
        } else if (tipoConta ="CP") {
            v = 20;
        }

        if (statusConta = true) {
            if (saldoConta > v) {
                setSaldoConta(getSaldoConta() - v)
            } else {
                System.out.println("Saldo insulficiente");
            }
        }
    }

    //Métodos Especiais (Constructor);
    public ContaBanco() {
        saldoConta = 0;
        statusConta = false;
    }

    public setNumConta(n: int) {
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
