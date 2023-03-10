package aula02;

public class Conta {
    private String id = null;
    private double saldo = 0;

    public Conta(String id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void sacar(double valor) {
        if(valor > 0) {
            this.saldo = this.saldo - valor;
        }
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo = this.saldo + valor;
        }
    }
    
}
