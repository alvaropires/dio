package one.digitalInnovation.junit;

public class Conta {
    private String conta;
    private Double saldo;

    public Conta(String conta, Double saldo) {
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getConta() {
        return conta;
    }

    public Double getSaldo() {
        return saldo;
    }
}
